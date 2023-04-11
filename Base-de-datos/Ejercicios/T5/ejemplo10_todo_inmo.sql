-- Ejercicio 1
-- Selecciona a los compradores que hayan hecho todas sus operaciones de alquiler en las
-- provincias de Almería o Granada.

select comprador.nombre, provincia
from inmueble join operacion using(id_inmueble)
			join comprador using(id_cliente)
where tipo_operacion = 'Alquiler' and provincia in('Almería','Granada');

-- Ejercicio 2
-- Selecciona a los 2 vendedores que más han alquilado (más cuantía de dinero en total).
-- Muestra el nombre del vendedor, la media de los alquileres que ha realizado y la suma 
-- total del importe de los inmuebles alquilados.

select vendedor.*, count(fecha_operacion)
from vendedor join operacion using(id_vendedor)
group by id_vendedor
order by count(fecha_operacion) desc
limit 2;

-- Ejercicio 3
-- Seleccionar los inmuebles que estén en venta (es decir, que aún no han sido vendidos) y
-- cuyo precio esté por debajo de la media de todos los inmuebles en venta.



select inmueble.*
from inmueble
where tipo_operacion = 'Venta' and precio< (select avg(precio)
											from inmueble
											where tipo_operacion = 'Venta');

-- Ejercicio 4
-- Seleccionar para el año 2022, y para cada provincia, lo que ha ingresado la 
-- inmobiliaria. Debe aparecer la provincia, el total ingresado por ese año en dicha 
-- provincia, el % de lo que ha ingresado por alquileres y el % de lo que ha ingresado 
-- por ventas.
with total_alquiler as 
(select count(precio_final)
from vendedor join operacion using(id_vendedor)
				join inmueble using(id_inmueble)
where tipo_operacion = 'Alquiler'
), total_venta as 
(select count(precio_final)
from vendedor join operacion using(id_vendedor)
				join inmueble using(id_inmueble)
where tipo_operacion = 'Venta')

select provincia, count(precio_final), total_venta*count(precio_final)/100 as porc_venta,
				total_alquiler*count(precio_final)/100 as porc_alq
from vendedor join operacion using(id_vendedor)
				join inmueble using(id_inmueble)
where to_char(fecha_operacion, 'YYYY') = '2022'
group by provincia
order by count(precio_final) desc;



-- Ejercicio 5
-- Selecciona el precio medio y el precio medio por superficie de los alquileres 
-- realizados,agrupado por mes y año.

with precio_medio as (select round(avg(precio_final), 2), to_char(fecha_operacion, 'MM'), to_char(fecha_operacion, 'YYYY')
				  from inmueble join operacion using(id_inmueble)
					where tipo_operacion = 'Alquiler'
				  group by to_char(fecha_operacion, 'MM'), to_char(fecha_operacion, 'YYYY')
)
select precio_medio, avg(precio_final*superficie/100), to_char(fecha_operacion, 'MM'), 
		to_char(fecha_operacion, 'YYYY')
from inmueble join operacion using(id_inmueble)
where tipo_operacion = 'Alquiler'
group by precio_medio, to_char(fecha_operacion, 'MM'), to_char(fecha_operacion, 'YYYY')
order by to_char(fecha_operacion, 'YYYY') desc;


-- Ejercicio 6
-- Seleccionar el vendedor con el que la inmobiliaria ha ingresado más dinero en cada
-- provincia. Debe aparecer el nombre de la provincia, el nombre del vendedor, la suma 
-- total de lo que ha ingresado ese vendedor en dicha provincia y el número de 
-- operaciones de alquiler o venta que ha realizado en la misma.

with  cant_venta as (select count(fecha_operacion)
		 		from vendedor join operacion using(id_vendedor)
								join inmueble using(id_inmueble)
		 		where tipo_operacion = 'Venta'
),cant_alquiler as (select count(fecha_operacion)
		 		from vendedor join operacion using(id_vendedor)
								join inmueble using(id_inmueble)
		 		where tipo_operacion = 'Aquiler'	
)
select id_vendedor, provincia, cant_aquiler, cant_venta, count(precio_final)
from vendedor join operacion using(id_vendedor)
				join inmueble using(id_inmueble)
				join cant_alquiler using(fecha_operacion)
				join cant_venta using(fecha_operacion)
group by id_vendedor, provincia
order by count(precio_final) desc;


