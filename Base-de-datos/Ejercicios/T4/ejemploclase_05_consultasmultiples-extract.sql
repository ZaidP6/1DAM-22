/*eleccionar las casa o pisos que han sido vendidas en un mes de marzo, 
mostrando además de la información del inmueble en que % es diferente 
el precio inicial y el precio final*/

SELECT inmueble.*,
		ROUND(((precio - precio_final)/precio::NUMERIC)*100,2)
FROM inmueble JOIN operacion USING(id_inmueble) 
				JOIN tipo ON(tipo_inmueble = id_tipo)
WHERE tipo.nombre IN('Casa', 'Piso') AND tipo_operacion = 'Venta'
				--AND fecha_operacion::text ILIKE '%-03-%';
				--AND TO_CHAR(fecha_operacion, 'MM')='03';
				--AND EXTRACT(month FROM fecha_operacion) = 3;
				AND TO_CHAR(fecha_operacion, 'TMMonth') = 'Marzo';
--to_char + 'mon' devuelve el mes con 3 letras (fechas)
-- extract devuelve el numero (fechas)
--TM = translate mode; traduce al idioma que este puesto
-- to_char practicar en casa con la plantilla

---------------------------------------------------------------------------------
--seleccionar el precio final medio de aquellos pisos que se pusieron 
--en alquiler en Almeria o Granada a partir de Julio de 2020 y que 
--tardaron 5 meses o mneos en ser alquilados

select AVG(precio_final)
from inmueble join tipo on(tipo_inmueble = id_tipo)
				join operacion using (id_inmueble)
where tipo_operacion ='Alquiler' and provincia in ('Almería', 'Granada')
			and fecha_alta >= make_date(2020, 7, 1)
				--to_date('01/01/2020', 'DD, MM, YYYY')
				--and months_between 
				and fecha_operacion between fecha_alta + '5 mon'::interval
				and tipo.nombre
		order by fecha_alta asc;