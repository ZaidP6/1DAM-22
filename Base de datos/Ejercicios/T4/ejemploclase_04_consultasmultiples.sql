select*
from tipo;

--selecionar todos los datod de aquellas casas uqe hayan 
--sido alquiladas en la provincia de Sevilla o Jaén en el año 2021.

select inmueble.*
from inmueble join tipo on(tipo_inmueble = id_tipo)
			join operacion using (id_inmueble)
			
where tipo_operacion ='Alquiler' and provincia in ('Sevilla', 'Jaén')
					and fecha_operacion::text ilike '2021-%'
					and nombre = 'Casa';
