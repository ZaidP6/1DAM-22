-- seleccionar los 10 productos con el precio mas caro.

select product_name, unit_price
from products
where unit_price::numeric in(
							select distinct unit_price
							from products
							order by unit_price desc
							)
order by unit_price desc
limit 10;

-- seleccionar cantidad de productos comprados por cada compañía donde la cantidad de los 
-- productos sea mayor a la media de los precios de los productos. Mostrar nombre de la 
-- compañía y la cantidad ordenada de mayor a menor.

select company_name, count(products.unit_price::numeric)
from products join order_details using(product_id)
				join orders using(order_id)
				join shippers on(ship_via=shipper_id)
group by company_name
having count(products.unit_price::numeric) >
				(
				select avg(unit_price::numeric)
				from products
				);


-- seleccionar nombre y apellido de los empleados los cuales hayan realizado más de 50
-- pedidos.

select last_name, first_name, count(order_id)
from employees join orders using(employee_id)
group by last_name, first_name
having count(order_id)>50
order by count(order_id) desc;