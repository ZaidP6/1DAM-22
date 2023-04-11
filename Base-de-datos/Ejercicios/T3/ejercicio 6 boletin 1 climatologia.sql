--1

SELECT AVG(temperatura_media)
FROM climatologia

WHERE provincia IN ('Sevilla', 'Granada', 'Málaga', 'Huelva',
				   'Jaén', 'Córdoba', 'Almería', 'Cádiz')
				AND STARTS_WITH(estacion, 'Al')
				AND fecha BETWEEN '2019-05-01' AND '2019-05-31';
				
--2

select fecha, estación, temperatura_media, precipitacion_total,
	case
		when precipitacion_total >= 50
			then 'CHUZOS DE PUNTA'
		when 40 <= precipitacion_total < 50
			then 'A CÁNTAROS'
		when 25 <= precipitacion_total < 40
			then 'MUCHA LLUVIA'
		when 10 <= precipitacion_total < 25
			then 'FALTA LE HACÍA AL CAMPO'
		when precipitacion_total < 10
			then 'HA LLOVIDO POCO'
		else precipitacion_total = 0 or precipitacion_total is 'null'    --corregido
			then 'NO HA LLOVIDO'
	end
from climatologia 
where provincia = 'Jaén' and fecha::date ilike '2019-11%'
order by fecha, estacion desc;

--3

select estacion, provincia, hora_temperatura_maxima, temperatura_maxima,fecha
from climatologia
where hora_temperatura_maxima = '14:00'
			and fecha::text ilike '2019-03%' and provincia in ('Asturias', 'Cantabria');