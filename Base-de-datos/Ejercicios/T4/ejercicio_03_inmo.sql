-- Selecciona los datos del inmueble sobre el que se ha 
-- realizado una operación un lunes de febrero o un viernes 
-- de marzo, que tenga más de 200 metros cuadrados y donde 
-- el nombre del vendedor contenga una A mayúscula o 
-- minúscula.

select inmueble.*
from operacion join inmueble using (id_inmueble)
				join vendedor using (id_vendedor)
where vendedor.nombre ilike '%a%'and inmueble.superficie >200  
				and ((extract(month from fecha_operacion) = 2 
				and extract(day from fecha_operacion) = 1 )
				or (extract (month from fecha_operacion) = 3
				and extract(day from fecha_operacion) =5));
				
-- Selecciona el precio medio por metro cuadrado de los 
-- alquileres de viviendas en los meses de marzo y abril de 
-- cualquier año para las provincias costeras de Andalucía.

select round(avg(precio/superficie), 2) as "precio_medio_m2"
from inmueble 
where extract(month from fecha_alta) between 3 and 4 
			and tipo_operacion ilike 'Alquiler'
			and provincia in ('Cádiz', 'Huelva', 
				'Almería','Málaga');

-- ¿Cuál es la media del porcentaje de diferencia entre el 
-- precio inicial (en la tabla inmueble) y el precio final 
-- (en la tabla operación) para aquellas operaciones de 
-- alquiler realizadas en enero de cualquier año, donde el 
-- tipo del inmueble es Oficina, Local o Suelo?

select round (avg(operacion.precio_final/inmueble.precio*100),2)
from inmueble join operacion using (id_inmueble)
    		join tipo on (id_tipo = tipo_inmueble)
where extract(month from fecha_operacion ) = 1
    and tipo.nombre in ('oficina', 'local', 'suelo');

-- Seleccionar el nombre de aquellos compradores de Casa 
-- o Piso en las provincias de Jaén o Córdoba, donde el precio 
-- final de inmueble esté entre 150.000 y 200.000€, para aquellos 
-- inmuebles que han tardado entre 3 y 4 meses en venderse.

select comprador.nombre
from comprador join operacion using (id_cliente)
			join inmueble using (id_inmueble)
where provincia in ('jaén', 'córdoba')
    and precio_final between 150000 and 200000
    and age(fecha_operacion, fecha_alta) 
	between '3 mon'::interval and '4 mon'::interval; 
-- no salen nombres???

-- Selecciona la media del precio inicial (en la tabla inmueble), 
-- del precio final (en la tabla operación) y de la diferencia 
-- en porcentaje entre ellas de aquellas viviendas (Casa o Piso) 
-- en alquiler que tengan menos de 100 metros cuadrados y que 
-- hayan tardado un año o más en alquilarse.

select round(avg(precio), 2) as "media_precio_inicial", 
		round(avg(precio_final), 2) as "media_precio_final", 
		round((operacion.precio_final/inmueble.precio*100), 2) 
		as "diferencia_precio_porcentaje" 
from inmueble join operacion using (id_inmueble)
    		join tipo on (id_tipo = tipo_inmueble)
where tipo.nombre in ('Casa', 'Piso')
		and tipo_operacion ilike 'Alquiler'
		and inmueble.superficie < 100;
		--and age(fecha_operacion, fecha_alta)>= '1 year'::interval;

-- Selecciona el alquiler de vivienda (Casa o Piso) más caro realizado 
-- en Julio o Agosto de cualquier año en la provincia de Huelva.

select max(precio), min(precio)
from inmueble
where tipo_operacion ilike 'Alquiler' and provincia = 'Huelva' 
		and extract(month from fecha_alta) between 7 and 8;

