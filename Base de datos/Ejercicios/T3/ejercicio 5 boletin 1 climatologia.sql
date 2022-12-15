select estacion, fecha, temperatura_minima, temperatura_maxima
from climatologia
where (temperatura_maxima between 30 and 40) and (fecha between '2019-07-01' and '2019-08-31');

select estacion, provincia, precipitacion_total, fecha
from climatologia
where (fecha between '2019-04-01' and '2019-04-30');

select *
from climatologia
where (estacion ilike '%e%') --and ((fecha between '2019-02-25' and '2019-02-29') 
								  -- or (fecha between '2019-03-25' and '2019-03-31') 
								   --or (fecha between '2019-04-25' and '2019-04-30'))
--where (estacion ilike '%e%') and (fecha = '2019-04' or fecha = '2019-03' or fecha = '2019-02')
order by provincia asc, estacion asc, fecha desc;