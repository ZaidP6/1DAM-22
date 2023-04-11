--mostrar aeropuerto de salida, el aeropuerto de llegada, fecha de salida y 
--llegada de los vuelos que han salido desde Sevilla hacia Londres en un martes 
--de noviembre.

select v1.nombre, salida, v2.nombre, llegada
from vuelo join aeropuerto v1 on(desde=v1.id_aeropuerto)
			join aeropuerto v2 on(hasta=v2.id_aeropuerto)
where v1.ciudad = 'Sevilla' and v2.ciudad = 'Londres' 
			and to_char(salida, 'id') = '2/11';
			
--seleccionar el precio final de cada vuelo

select vuelo.*, coalesce(precio*(1-(descuento::numeric/100)), precio)
from vuelo;

--seleccionar elm importe total gastadopor todos los clientes que reservaron un vuelo que 
--salió(en pasado) desde Berlín un martes o miércoles, y donde la reserva se hiciera entre 
--30 y 45 días antes de la salida del vuelo.

select sum(coalesce(precio*(1-(descuento::numeric/100)), precio))
from vuelo join reserva using (id_vuelo)
			join aeropuerto on(desde = id_aeropuerto)
where salida < current_timestamp
		and ciudad = 'Berlín' and to_char(salida, 'ID') in ('2', '3')  --id o ID pero no Id
		and salida - fecha_reserva between '30 day'::interval and '45 day'::interval;
