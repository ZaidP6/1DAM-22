-- 4.1 Seleccionar el COMPANY_NAME y CONTACT_NAME de aquellos CUSTOMERS 
-- que hayan hecho pedidos (ORDERS).

select distinct company_name, contact_name
from customers join orders using (customer_id)
where order_id is not null;

-- 4.2 Seleccionar el número de pedidos que hemos enviado en la década de los 
-- 90 con las empresas Federal Shipping o United Package.

select count(*)
from orders join shippers ON (shipper_id = ship_via)
where company_name in ('Federal Shipping','United Package' )
		and to_char (order_date, 'YYYY') between '1990' and '1999';

-- 4.3 Seleccionar el nombre de aquellos productos que han sido solicitados en 
-- algún pedido.

select distinct products.product_name
from orders join order_details using (order_id)
			join products using (product_id)
where quantity != 0;

-- 4.4 Seleccionar la suma de los importes "cobrados" en todos los pedidos 
-- realizados en el año 96.

select round(sum(unit_price::numeric*quantity::numeric-unit_price::numeric
				 *quantity::numeric*discount::numeric), 2) as "Total cobrado"
from order_details join orders using (order_id)
where to_char (order_date, 'YY') in ('96');

-- 4.5 Seleccionar el nombre de contacto del cliente y el del empleado para 
-- aquellos clientes y empleados que han participado en pedidos donde la 
-- diferencia entre la fecha de envío y la fecha de requisito sea menos de 20 días

select contact_name, first_name,required_date, shipped_date
from orders join customers using (customer_id)
			join employees using (employee_id)
where age (required_date, shipped_date) between '0 days'::interval 
											and '19 days'::interval;

-- 4.6 Diseña una consulta (incluyendo su solución) para la base de datos 
-- NORTHWIND que contenga los siguientes elementos.
-- La salida del select no será SELECT *
-- Debe realizar el JOIN de al menos 4 tablas.
-- Uno de los JOINs debe, obligatoriamente, ser un JOIN ON
-- Al menos, tendrá cuatro condiciones en el WHERE (conectadas con AND u OR)
-- Debe ordenar la salida por algún criterio.


--EJERCICIO 5

-- 5.1 Seleccionar los nombres de los productos que hayan sido solicitados 
-- en pedidos que hayan sido enviados por la empresa United Package.

select distinct products.product_name
from orders join order_details using (order_id)
			join products using (product_id)
			join shippers on (shipper_id = ship_via)
where company_name = 'United Package';

-- 5.2 Seleccionar el nombre del producto y el de su categoría que se hayan 
-- incluido en algún pedido, para todos aquellos pedidos solicitados en un día de 
-- Agosto

select distinct product_name, category_name
from products join categories using(category_id)
				join order_details using (product_id)
				join  orders using (order_id)
where to_char (required_date, 'MM') in ('08');

-- 5.3 Seleccionar el nombre de todas las empresas que sean clientes, hayan 
-- realizado pedidos o no.

select company_name
from customers;

-- 5.4 Seleccionar el nombre de los empleados que han atendido pedidos realizados 
-- por clientes de Brasil (Brazil).

select first_name, last_name
from orders join employees using (employee_id)
				join customers using (customer_id)
where customers.country = 'Brazil';

-- 5.5 Seleccionar el nombre de la categoría y los productos que se han pedido en 
-- aquellos pedidos que han sido atendidos por Janet Leverling (EMPLOYEE).

select distinct products.product_name, categories.category_name
from products join order_details using (product_id)
				join orders using (order_id)
				join employees using (employee_id)
				join categories using (category_id)
where employees.last_name = 'Leverling' and employees.first_name = 'Janet';

-- 5.6 Diseña una consulta (incluyendo su solución) para la base de datos 
-- NORTHWIND que contenga los siguientes elementos.
-- La salida del select no será SELECT *
--  Debe realizar el JOIN de al menos 3 tablas.
-- Uno de los JOINs debe, obligatoriamente, ser un JOIN ON
-- Al menos uno de los JOINs debe ser lateral
-- Al menos, tendrá tres condiciones en el WHERE (conectadas con AND u OR)
-- Debe ordenar la salida por algún criterio.







