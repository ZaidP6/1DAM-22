-- 1. Selecciona, agrupando por vendedor, el precio final medio de pisos y casas que 
-- se han vendido en cada provincia. Debe aparecer el nombre del vendedor, la provincia 
-- y el precio medio.

select vendedor.nombre, provincia, (select avg(precio_final)
						from inmueble join operacion using(id_inmueble)
									join vendedor using(id_vendedor)
									join tipo on(tipo_inmueble=id_tipo)
						where tipo.nombre in('Piso', 'Casa')
						) as "media_provincia"
from inmueble join operacion using(id_inmueble)
				join vendedor using(id_vendedor)
group by vendedor.nombre, provincia
order by vendedor.nombre;
				

-- 2. Seleccionar la suma del precio final, agrupado por provincia, de aquellos locales 
-- donde su precio sea superior al producto del número de metros cuadrados de ese local 
-- por el precio medio del metro cuadrado de los locales de esa provincia.

with media_preciom2 as (select provincia, avg(precio/superficie)
						from inmueble join tipo on(tipo_inmueble=id_tipo)
						where tipo.nombre = 'Local'
						group by provincia
), suma_preciofin as (select provincia, sum(precio_final)
					from operacion join inmueble using(id_inmueble)
					group by provincia)
					
select *
from suma_preciofin join media_preciom2 using(id_inmueble)
where suma_precioT>media_preciom2;


-- 3. Selecciona la media de pisos vendidos al día que se han vendido en cada provincia. 
-- Es decir, debes calcular primero el número de pisos que se han vendido cada día de 
-- la semana en cada provincia, y después, sobre eso, calcular la media por provincia.

select provincia, count(*)
from operacion join inmueble using(id_inmueble)
				join tipo on(tipo_inmueble=id_tipo)
where tipo.nombre = 'Piso'
group by provincia;

-- 4. Selecciona el cliente que ha comprado más barato cada tipo de inmueble (casa, 
-- piso, local, …). Debe aparecer el nombre del cliente, la provincia del inmueble, 
-- la fecha de operación, el precio final y el nombre del tipo de inmueble. ¿Te ves 
-- capaz de modificar la consulta para que en lugar de que salga el más barato, salgan 
-- los 3 más baratos?

select DISTINCT(tipo.nombre), min(precio_final)
from comprador join operacion using(id_cliente)
				join inmueble using(id_inmueble)
				join tipo on(tipo_inmueble=id_tipo)
group by tipo.nombre;

select comprador.nombre, tipo.nombre, min(precio_final)
from comprador join operacion using(id_cliente)
				join inmueble using(id_inmueble)
				join tipo on(tipo_inmueble=id_tipo)
group by comprador.nombre, tipo.nombre


-- 5. De entre todos los clientes que han comprado un piso en Sevilla, selecciona a 
-- los que no han realizado ninguna compra en fin de semana.



-- 6. El responsable de la inmobiliaria quiere saber el rendimiento de operaciones de 
-- alquiler que realiza cada vendedor durante los días de la semana (de lunes a sábado). 
-- Se debe mostrar el nombre del vendedor, el % del número de operaciones de alquiler 
-- que ha realizado en ese día de la semana ese vendedor y el precio medio por metro 
-- cuadrado de las operaciones de alquiler que ha realizado ese vendedor en ese día de 
-- la semana.



-- 7. Elabora el enunciado de una consulta que incluya una su consulta correlacionada 
-- o que sea ideal para resolver con el operador WITH.
