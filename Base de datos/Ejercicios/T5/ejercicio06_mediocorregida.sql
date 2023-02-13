-- Seleccionar la suma del precio final, agrupado por provincia, de aquellos locales donde su precio sea superior al producto 
-- del número de metros cuadrados de ese local por el precio medio del metro cuadrado de los locales de esa provincia.

	with media_preciom2 as (select provincia, avg(precio_final/superficie)
				from inmueble join tipo on(tipo_inmueble=id_tipo)
								join operacion using(id_inmueble)
				where tipo.nombre = 'Local' and tipo_operacion = 'Venta' 
				group by provincia
), suma_preciofin as (select provincia, sum(precio_final)
			from operacion join inmueble using(id_inmueble)
			group by provincia)
					
select *
from suma_preciofin join media_preciom2 using(id_inmueble)
where suma_precioT>media_preciom2;
