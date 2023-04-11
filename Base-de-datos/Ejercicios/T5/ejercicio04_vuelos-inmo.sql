-- 1.Seleccionar el vuelo más largo (con mayor duración) de cada día de la semana. 
-- Debe aparecer el nombre del aeropuerto de salida, el de llegada, la fecha y hora 
-- de salida y llegada y la duración.

select id_vuelo, salida, llegada, llegada - salida as "duracion", to_char(salida, 'day') as dia_semana
from vuelo
group by id_vuelo, salida, llegada, dia_semana
order by duracion desc;

-- 2.Seleccionar el cliente que más ha gastado en vuelos que salen del mismo aeropuerto. 
-- Debe aparecer el nombre del cliente, el nombre y la ciudad del aeropuerto y la 
-- cuantía de dinero que ha gastado.

select distinct(id_cliente),  aeropuerto.nombre, aeropuerto.ciudad
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




