-- 1. Seleccionar los 3 aeropuertos que menos tráfico de llegada 
-- (menos personas llegando a ellos en un vuelo) han registrado 
-- en un mes de Enero, Febrero o Marzo.

select nombre, count(llegada)
from aeropuerto join vuelo d on(id_aeropuerto = hasta)
where to_char(llegada, 'MM') in ('01', '02', '03')
group by nombre
order by count(llegada) asc
limit 3;			

-- 2.Selecciona los clientes que han comprado casas en Almería, 
-- siendo el precio final mayor que el precio medio de las casas 
-- vendidas en Almería.

select id_cliente, comprador.nombre, precio_final, avg(inmueble.precio)
from operacion join comprador using(id_cliente)
				join inmueble using(id_inmueble)
				join tipo on(tipo_inmueble=id_tipo)
where tipo.nombre in('Casa') and provincia = 'Almería'
				and tipo_operacion = 'Venta'
group by id_cliente, comprador.nombre, precio_final
having precio_final > avg(inmueble.precio);

-- 3.Selecciona de todos los vendedores a aquellos que solo vendieron 
-- inmuebles de tipo Parking.

select distinct id_vendedor, vendedor.nombre, tipo.nombre
from vendedor join operacion using(id_vendedor)
				join inmueble using(id_inmueble)
				join tipo on(tipo_inmueble=id_tipo)
where tipo.nombre in('Parking');


-- 4.Selecciona el origen y el destino de los 10 vuelos con una 
-- duración menor. Debes realizarlo usando subconsultas.

select desde, hasta
from vuelo
where id_vuelo in (SELECT id_vuelo
					FROM vuelo
					ORDER BY llegada - salida
					LIMIT 10);

-- 5.Selecciona el importe que la aerolínea de la base de datos de vuelos 
-- ha ingresado por cada uno de los vuelos que se han realizado en fin de semana (es decir, que 
-- han salido entre viernes y domingo) en los meses de Julio y Agosto (da igual el año).

select id_vuelo, sum(precio)
from vuelo
where (extract (day from salida)between 5 and 7)
			and extract(month from salida) in (7,8)
group by id_vuelo;
