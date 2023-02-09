-- 1.Seleccionar el vuelo más largo (con mayor duración) de cada día de la semana. 
-- Debe aparecer el nombre del aeropuerto de salida, el de llegada, la fecha y hora 
-- de salida y llegada y la duración.

/*select id_vuelo, salida, llegada, llegada - salida as "duracion", to_char(salida, 'day') as dia_semana
from vuelo
group by id_vuelo, salida, llegada, dia_semana
order by duracion desc;

select *, age(llegada, salida)
from vuelo join aeropuerto d on(d.id_aeropuerto=vuelo.desde)
			join aeropuerto h  on(h.id_aeropuerto=vuelo.hasta)
group by to_char(salida, 'ID')
*/

select d.ciudad, h.ciudad, salida, llegada, to_char(salida, 'TMDay'), age(llegada, salida)
from vuelo v join aeropuerto d on(d.id_aeropuerto=v.desde)
			join aeropuerto h  on(h.id_aeropuerto=v.hasta)
where age(llegada, salida)>= all
	(
	select age(llegada, salida)
		from vuelo v2
		where to_char(v.salida,'ID')= to_char(v2.salida, 'ID')
	)
order by to_char(v.salida, 'ID');

-- 2.Seleccionar el cliente que más ha gastado en vuelos que salen del mismo aeropuerto. 
-- Debe aparecer el nombre del cliente, el nombre y la ciudad del aeropuerto y la 
-- cuantía de dinero que ha gastado.

/*select distinct(id_cliente),  aeropuerto.nombre, aeropuerto.ciudad
from cliente  join reserva using(id_cliente)
				join vuelo using(id_vuelo)
				join aeropuerto on(hasta=id_aeropuerto)
group by id_cliente, aeropuerto.nombre, aeropuerto.ciudad
having (		select sum(precio + precio*10/100) as "gastado"
				from vuelo join reserva using(id_vuelo)
							join cliente using(id_cliente)
							join aeropuerto on(hasta=id_aeropuerto)
				group by id_aeropuerto
				order by gastado  desc
					)dato
order by dato desc;
*/

SELECT c.nombre, apellido1, apellido2,
		d.nombre, d.ciudad, 
		SUM(
			COALESCE(precio * 
					 (1 - (descuento::numeric/100)),
						precio)
			) as "gasto_por_cliente"
FROM cliente c JOIN reserva USING (id_cliente)
		JOIN vuelo v USING (id_vuelo)
		JOIN aeropuerto d 
			ON (d.id_aeropuerto = desde)
GROUP BY c.id_cliente,c.nombre, apellido1, apellido2,
		v.desde, d.nombre, d.ciudad
HAVING SUM(
			COALESCE(precio * 
					 (1 - (descuento::numeric/100)),
						precio)
			) >= ALL (
						SELECT SUM(
							COALESCE(precio * 
									 (1 - (descuento::numeric/100)),
										precio)
							)
						FROM vuelo v2 JOIN
							reserva USING (id_vuelo)
						WHERE v.desde = v2.desde
						GROUP BY id_cliente, v2.desde
			)
ORDER BY gasto_por_cliente DESC;

-- 3.Seleccionar el piso que se ha vendido más caro de cada provincia. 
-- Debe aparecer la provincia, el nombre del comprador, la fecha de la operación 
-- y la cuantía.

select provincia, comprador.nombre, fecha_operacion, max(precio_final) as precio_venta
from operacion join inmueble using(id_inmueble)
				join tipo on(tipo_inmueble=id_tipo)
				join comprador using(id_cliente)
where tipo.nombre in('Piso') 
group by provincia, comprador.nombre, fecha_operacion
order by precio_venta desc;

select provincia, comprador.nombre, fecha_operacion, precio_final
from operacion join inmueble i using(id_inmueble)
				join tipo on(tipo_inmueble=id_tipo)
				join comprador using(id_cliente)
where tipo.nombre in('Piso') and tipo_operacion = 'Venta' 
							and precio_final>= all(
												select precio_final
												from operacion join inmueble i2 using(id_inmueble)
																join tipo on(tipo_inmueble=id_tipo)
												where tipo.nombre = 'Piso'and tipo_operacion = 'Venta'
																and i.provincia = i2.provincia
													);
order by precio_venta desc, provincia;

-- 4.Seleccionar los alquileres más baratos de cada provincia y mes (da igual el día 
-- y el año). Debe aparecer el nombre de la provincia, el nombre del mes, el resto de 
-- atributos de la tabla inmueble y el precio final del alquiler.

select provincia, min(precio)
from operacion join inmueble using(id_inmueble)
				join tipo on(tipo_inmueble=id_tipo)
				join comprador using(id_cliente)
where tipo_operacion in('Alquiler')
group by provincia;

select provincia, to_char(fecha_alta, 'mm')
from operacion join inmueble using(id_inmueble)
				join tipo on(tipo_inmueble=id_tipo)
				join comprador using(id_cliente)
where tipo_operacion in('Alquiler')
group by provincia, fecha_alta;




