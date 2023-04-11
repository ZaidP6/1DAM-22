select*
from vuelo
order by random()
limit 5;


select*
from vuelo
order by salida
limit 5;

select*
from vuelo
order by salida
-- offset (n-1)*s
offset 29*25
limit 25;

-- s= 25 cantidad de artículos a mostrar
-- n = 30 número de páginas