--ejerccio 2 opB
select (temperatura_maxima + temperatura_minima)/2
from climatologia
where fecha::text ilike '2019-01%'
		and (estacion ilike '%á%' or
			estacion ilike '%é%' or
			 estacion ilike '%í%' or
			 estacion ilike '%ó%' or
			 estacion ilike '%ú%');
--ejercicio 5 opA
select provincia, estacion, fecha, temperatura_maxima, racha_viento, 
		temperatura_minima, temperatura_maxima - temperatura_minima as "x",
		0.2*temperatura_maxima as "30% temperatura_max"
from climatologia
where temperatura_minima >10
	and temperatura_maxima - temperatura_minima
		between 0.2*temperatura_maxima and
				0.3*temperatura_maxima;