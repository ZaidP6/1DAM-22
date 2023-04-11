select fecha, provincia,  round(avg(coalesce(velocidad_maxima_viento, 0),2)) as media_velocidad_maxima_viento, 
			 round(avg(coalesce (racha_viento, 0),2)) as media_racha_viento, 
			 round(avg(coalesce(precipitacion_total, 0),2)) as media_precipitacion_total
from climatologia
where fecha::text ilike '2019-03%' and ilike '2019-08%' and ilike '2019-12%'
order by fecha;

--Hacer una consulta en la que se muestre 