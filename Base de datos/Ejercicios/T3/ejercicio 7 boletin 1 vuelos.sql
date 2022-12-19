select *
from vuelos
where  desde ilike 'Berlín' and hasta ilike 'Londres' 
			and llegada::date between '2020-10-01' and '2020*12-31';


select id, salida, desde,  llegada, hasta, precio, 
			coalesce (descuento, 0) as "descuento",
		    coalesce (precio-descuento, precio) as "precio final"

from vuelos

where desde in ('Sevilla', 'Málaga') and hasta
			in ('Madrid', 'Barcelona') 
			and salida::date between '2020-12-01' and '2020-12-31';

			--and salida::text ilike '2020-12%';
			
select *
from vuelos
where descuento is null and llegada::date between '2020-10-01' and '2020-10-15' 
				and hasta ilike 'Nueva York';

select *
from vuelos
where salida::text ilike '2021-01%' 
		and llegada::text ilike '%09:%' 
		and desde ilike 'Ámsterdam';

select id,salida,desde,llegada,hasta,precio,
		coalesce (descuento, 0) as "descuento",
		coalesce (precio-descuento, precio) as "precio final",
	case
		when precio < 60 and precio >= 0 then '¡OFERTÓN!'
		when precio >= 60 and precio < 120 then 'ECONÓMICO'
		when precio >= 120 and precio < 200 then 'NORMAL'
		when precio >= 200 and precio < 300 then 'CARO'
		when precio >= 300 then 'MUY CARO'
	end

from vuelos
where salida::text ilike '2021%' and desde ilike 'Sevilla';
		