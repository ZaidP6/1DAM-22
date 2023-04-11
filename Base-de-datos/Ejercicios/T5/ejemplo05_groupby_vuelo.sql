-- Seleccionar el nº de vuelos que salen en media de cada día 
-- de la semana(lunes, martes, ...)agrupando por aeropurto de salida

select count(id_vuelo), ciudad, to_char(salida, 'TMDay')
from vuelo join aeropuerto on(desde = id_aeropuerto)
group by aeropuerto.nombre, ciudad, to_char(salida,'TMDay')
order by ciudad asc;


select ciudad,  avg(numval)
from (
		select count(id_vuelo), ciudad, to_char(salida, 'TMDay') 
					as "dia",  count(*) as "numval"
		from vuelo join aeropuerto on(desde = id_aeropuerto)
		group by aeropuerto.nombre, ciudad, to_char(salida,'TMDay')
		order by ciudad asc
		)datos
group by ciudad;


