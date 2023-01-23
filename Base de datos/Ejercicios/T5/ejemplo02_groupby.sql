-- seleccionar el nº de refgistros meteorológicos 
-- que hay para cada estación

select estacion, count(*)
from climatologia
where estacion = 'Estaca de Bares'
-- ERROR: la columna «climatologia.estacion» debe aparecer en la cláusula GROUP BY 
-- o ser usada en una función de agregación
select estacion, count(*)
from climatologia
group by estacion
where estacion = 'Estaca de Bares'

--calcular la media de cada estacion meteorologica ordenada de mas calida a mas fria.

select estacion, provincia, round(avg(temperatura_media),2) as "media"
from climatologia
group by estacion, provincia --debe aparecer todo lo que aaprarezca en el select que 
							--NO sea una funcion de resumen(avg, max, min, count, sum)
order by media desc;

-- seleccionar tem media agrupada pòr estacion meteorologica de las provincias de Extremadura
select estacion, provincia, round(avg(temperatura_media),2) as "media"
from climatologia
where provincia in('Cáceres', 'Badajoz')
group by estacion, provincia
