-- 1. Selecciona la media, agrupada por nombre de aeropuerto de salida, del % de ocupación 
-- de los vuelos. PISTA: tendrás que incluir una subconsulta dentro de otra y, en la 
-- interior, usar una subconsulta en el select :S (o bien usar WITH).

with porcentaje_ocupacion as (select id_vuelo,  -- max_pasajeros, count(id_reserva)::numeric as "ocupacion", 
								count(id_reserva)*100/av.max_pasajeros as "porcentaje"
				from vuelo join avion av using(id_avion)
							join reserva using(id_vuelo)
				group by id_vuelo, max_pasajeros
)

select desde, avg(porcentaje_ocupacion)
from aeropuerto join vuelo on(id_aeropuerto=desde)
 				join avion av using(id_avion)
				join reserva using(id_vuelo)
group by desde;

---------------------------------------------------------------------------------

WITH ocupacion_por_vuelo AS (

	SELECT id_vuelo, COUNT(*) as "num_pasajeros"

	FROM reserva

	GROUP BY id_vuelo

), porcentaje_ocupacion_por_vuelo AS (

	SELECT id_vuelo, desde, 

		(num_pasajeros::numeric / max_pasajeros) * 100

		as "porcentaje_ocupacion"

	FROM vuelo JOIN avion USING (id_avion) 

		JOIN ocupacion_por_vuelo USING (id_vuelo)

)

SELECT nombre, 

		ROUND(AVG(porcentaje_ocupacion),2)

FROM porcentaje_ocupacion_por_vuelo

		JOIN aeropuerto ON (desde = id_aeropuerto)

GROUP BY nombre;







SELECT nombre, AVG(ocupacion)

FROM (SELECT v.id_vuelo, nombre, 

	  	(COUNT(id_reserva)::numeric /

	  	(SELECT max_pasajeros 

		 FROM avion av

		 WHERE av.id_avion = v.id_avion		

		))*100 as "ocupacion" 

	  FROM reserva JOIN vuelo v USING (id_vuelo)

	  	JOIN aeropuerto ON (desde = id_aeropuerto)

	  GROUP BY v.id_vuelo, nombre

	 ) d

GROUP BY nombre;


-- 2. Selecciona el tráfico de personas (es decir, personas que han llegado en un 
-- vuelo o personas que han salido en un vuelo) agrupado por mes (independiente del 
-- año) y aeropuerto. 
-- INVESTIGA: Tienes que hacer uso de la cláusula UNION, y piensa en hacer primero 
-- el tráfico de salida, después el de llegada (en consultas diferentes pero casi 
-- idénticas) y posteriormente en sumarlo.

-- Se necesita el número de reservas de cada vuelo y a su vez el total de cada aeropuerto.
-- (Ya sea de entrada o de salida).
--  Agrupando por mes la salida y/o llegada.
select id_vuelo,count(id_reserva)::numeric
from vuelo join aeropuerto a1 on(desde = a1.id_aeropuerto)
			join aeropuerto a2 on(hasta = a2.id_aeropuerto)
			join reserva using(id_vuelo)
group by id_vuelo;

------------------------------------------------------------------------------------

(SELECT nombre, TO_CHAR(salida, 'TMMonth'),
		COUNT(id_reserva), 'salida'
FROM aeropuerto JOIN vuelo ON (desde = id_aeropuerto)
		JOIN reserva USING (id_vuelo)
GROUP BY nombre, TO_CHAR(salida, 'TMMonth'))		
UNION
(SELECT nombre, TO_CHAR(llegada, 'TMMonth'),
		COUNT(id_reserva), 'llegada'
FROM aeropuerto JOIN vuelo ON (hasta = id_aeropuerto)
		JOIN reserva USING (id_vuelo)
GROUP BY nombre, TO_CHAR(llegada, 'TMMonth'));


WITH trafico_salida AS (
	SELECT nombre, TO_CHAR(salida, 'TMMonth') as "mes",
		EXTRACT(month FROM salida) as "nmes",
		COUNT(id_reserva) "num_personas", 
		'salida' as "tipo_trafico"
	FROM aeropuerto JOIN vuelo ON (desde = id_aeropuerto)
			JOIN reserva USING (id_vuelo)
	GROUP BY nombre, TO_CHAR(salida, 'TMMonth'),
	 EXTRACT(month FROM salida)
), trafico_llegada AS (
	SELECT nombre, TO_CHAR(llegada, 'TMMonth') as "mes",
		EXTRACT(month FROM llegada) as "nmes",
		COUNT(id_reserva) "num_personas", 
		'llegada' as "tipo_trafico"
	FROM aeropuerto JOIN vuelo ON (hasta = id_aeropuerto)
			JOIN reserva USING (id_vuelo)
	GROUP BY nombre, TO_CHAR(llegada, 'TMMonth'),
		EXTRACT(month FROM llegada)
), trafico AS (
	SELECT *
	FROM trafico_salida 
	UNION 
	SELECT *
	FROM trafico_llegada
)
SELECT nombre, mes, num_personas, tipo_trafico
FROM trafico
ORDER BY nombre, nmes;


-- 3. Suponiendo que el 30% del precio de cada billete son beneficios (y el 70% son 
-- gastos), ¿cuál es el trayecto que más rendimiento económico da? Es decir, ¿en qué 
-- trayecto estamos ganando más dinero? ¿Y con el que menos? Lo puedes hacer en 
-- consultas diferentes usando WITH

with ptotal_asientos_vendidos as (select id_vuelo, count(id_reserva)::numeric as "vendidas", round((precio -precio*coalesce(descuento, 0)/100),2) 
																		as "precioReal", 
		count(id_reserva)::numeric * round((precio -precio*coalesce(descuento, 0)/100),2) as "precioVueloVendido"
from vuelo join reserva using(id_vuelo)
group by id_vuelo
order by count(id_reserva)::numeric * round((precio -precio*coalesce(descuento, 0)/100),2) desc
)
-- faltaria consulta multiplicando ptotal_asientos_vendidos por 0.3 y 0.7 para calcular el de mas beneficio 
-- y de mas gasto.
----------------------------------------------------------------------------------------------

WITH beneficio_por_trayecto AS (
	SELECT d.ciudad as "desde", h.ciudad as "hasta",
			SUM(COALESCE(precio * (1-(descuento::numeric/100)),precio) * 0.3) as "beneficio"
	FROM vuelo JOIN reserva USING (id_vuelo)
				JOIN aeropuerto d ON (desde = d.id_aeropuerto)
				JOIN aeropuerto h ON (hasta = h.id_aeropuerto)
	GROUP BY d.ciudad, h.ciudad
), beneficio_maximo AS (
	SELECT MAX(beneficio) as "maximo"
	FROM beneficio_por_trayecto
), beneficio_minimo AS (
	SELECT MIN(beneficio) as "minimo"
	FROM beneficio_por_trayecto
), trayecto_beneficio_maximo AS (
	SELECT *, 'max'
	FROM beneficio_por_trayecto
	WHERE beneficio = (
					SELECT maximo
					FROM beneficio_maximo
					)
), trayecto_beneficio_minimo AS (
	SELECT *, 'min'
	FROM beneficio_por_trayecto
	WHERE beneficio = (
					SELECT minimo
					FROM beneficio_minimo
					)	
)
SELECT *
FROM trayecto_beneficio_maximo
UNION
SELECT *
FROM trayecto_beneficio_minimo;

-- 4. Seleccionar el nombre y apellidos de los clientes que no han hecho ninguna 
-- reserva para un vuelo que salga en el tercer trimestre desde Sevilla.

select cliente.nombre, apellido1, apellido2, ciudad, salida
from cliente left join reserva using(id_cliente)
				left join vuelo using(id_vuelo)
				left join aeropuerto on(desde = id_aeropuerto)
where aeropuerto.ciudad != 'Sevilla' and to_char(salida, 'MM') in('01','02','03','07','08','09','10','11','12')
		--and id_reserva is null;

--------------------------------------------------------------------------------------------
WITH reservas_sevilla_3trim AS (
	SELECT id_cliente
	FROM reserva JOIN vuelo USING (id_vuelo)
				JOIN aeropuerto ON (desde = id_aeropuerto)
	WHERE ciudad = 'Sevilla' AND TO_CHAR(salida, 'Q') = '3'
)
SELECT DISTINCT nombre, apellido1, apellido2
FROM cliente JOIN reserva USING (id_cliente) 
WHERE id_cliente NOT IN 
			(
			 SELECT id_cliente
			 FROM reservas_sevilla_3trim
			);



-- 5. Selecciona el nombre y apellidos de aquellos clientes cuyo gasto en reservas 
-- de vuelos con origen en España (Sevilla, Málaga, Madrid, Bilbao y Barcelona) ha 
-- sido superior a la media total de gasto de vuelos con origen fuera de España.


select distinct(desde), ciudad
from aeropuerto join vuelo on(id_aeropuerto=desde)
order by desde;
-- Conocer los aeropuertos fuera de España

select id_vuelo, count(id_reserva)::numeric * round((precio -precio*coalesce(descuento, 0)/100),2)
from aeropuerto join vuelo on(id_aeropuerto=desde)
				join reserva using(id_vuelo)
				join cliente using(id_cliente)
where desde between 5 and 10
group by id_vuelo;
-- Conocer el gasto total de cada vuelos fuera de España.
-- A esto se le haría la suma de esta operación para saber el total gastado fuera de España.
-- Luego habría que hacerle la media a ese resultado y comparar con la consulta siguiente.
	
select id_cliente, count(id_reserva)::numeric * round((precio -precio*coalesce(descuento, 0)/100),2)
from aeropuerto join vuelo on(id_aeropuerto=desde)
				join reserva using(id_vuelo)
				join cliente using(id_cliente)
where desde between 1 and 4 or desde in('11')
group by id_cliente, precio, descuento;
-- A esto habría que sacarle el total con sum y tendría que ser mayor que lo explicado en la consulta anterior.				

--------------------------------------------------------------------------------------------------------------

WITH gasto_por_cliente_fuera_espana AS (

	SELECT id_cliente, SUM(COALESCE(precio * (1-(descuento::numeric/100)),precio)) as "gasto"
	FROM reserva JOIN vuelo USING (id_vuelo)
				JOIN aeropuerto ON (desde = id_aeropuerto)
	WHERE ciudad NOT IN ('Sevilla', 'Málaga', 'Madrid', 'Bilbao', 'Barcelona')
	GROUP BY id_cliente

), media_gasto_por_cliente_fuera_espana AS (

	SELECT AVG(gasto) as "media_gasto" 
	FROM gasto_por_cliente_fuera_espana

), gasto_por_cliente_desde_espana AS (

	SELECT id_cliente,SUM(COALESCE(precio * (1-(descuento::numeric/100)),precio)) as "gasto"
	FROM reserva JOIN vuelo USING (id_vuelo)
				JOIN aeropuerto ON (desde = id_aeropuerto)
	WHERE ciudad IN ('Sevilla', 'Málaga','Madrid', 'Bilbao','Barcelona')
	GROUP BY id_cliente

), cliente_con_gasto_superior_media AS (

	SELECT *
	FROM gasto_por_cliente_desde_espana
	WHERE gasto > (
		SELECT media_gasto
		FROM media_gasto_por_cliente_fuera_espana
	)
)

SELECT nombre, apellido1, apellido2, gasto
FROM cliente JOIN cliente_con_gasto_superior_media USING (id_cliente);
/*WHERE id_cliente IN 
				(SELECT id_cliente
				FROM cliente_con_gasto_superior_media
				);*/