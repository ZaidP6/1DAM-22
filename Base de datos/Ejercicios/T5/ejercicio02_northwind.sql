-- 1. Seleccionar el número de pedidos atendidos por cada empleado, 
-- sí y sólo si dicho número está entre 100 y 150.

select last_name, first_name, count(order_id)
from employees join orders using(employee_id)
group by last_name, first_name
having count(order_id) between 100 and 150;

-- 2. Seleccionar el nombre de las empresas que no han realizado ningún pedido.

select company_name, count(order_id)
from customers left join orders using(customer_id)
group by company_name
having count(order_id) = 0
order by count(order_id) asc;

-- 3. Seleccionar la categoría que tiene más productos diferentes solicitados 
-- en pedidos. Mostrar el nombre de la categoría y dicho número.

select distinct category_name, count(product_id)
from categories join products using(category_id)
				join order_details using(product_id)
				join orders using(order_id)
group by category_name
order by count(product_id) desc
limit 1;
-- 4. Si suponemos que nuestro margen de beneficio con los productos es de 
-- un 25% (es decir, el 25% de su precio, son beneficios, y el 75% son costes), 
-- calcular la cantidad de beneficio que hemos obtenido, agrupado por categoría 
-- y producto. Las cantidades deben redondearse a dos decimales.
-- 5. Selecciona aquellos clientes (CUSTOMERS) para los que todos los envíos 
-- que ha recibido (sí, todos) los haya transportado (SHIPPERS) la empresa 
-- United Package.
