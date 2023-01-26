-- 1.Seleccionar el salario máximo de cada departamento, mostrando 
	-- el nombre del departamento y dicha cantidad.
	
	select department_name, max(salary)
	from employees join departments using(department_id)
	group by department_name;
	
-- 2.Seleccionar el salario mínimo de cada departamento, para 
	-- aquellos departamentos cuyo salario mínimo sea menor que 5000$.
	
	select department_name, min(salary) as "salario_min"
	from employees join departments using(department_id)
	group by department_name
	having min(salary)>5000;
	
-- 3.Seleccionar el número de empleados que trabajan en cada oficina, 
	-- mostrando el STREET_ADDRESS y dicho número; hay que ordenar la 
	-- salida de mayor a menor.
	
	select street_address,count(employee_id) 
	from employees join departments using(department_id)
					join locations using(location_id)
	group by street_address
	order by count(employee_id) desc;
	
-- 4.Modificar la consulta anterior para que muestre las 
	-- localizaciones que no tienen ningún empleado.
	
	select street_address, coalesce(count(employee_id)) as "num"
	from employees right join departments using(department_id)
					full join locations using(location_id)
	group by street_address, employee_id
	having  count(employee_id) = 0 ---sin coalesce seria is null
	order by count(employee_id) desc;
	
-- 5.Seleccionar el salario que es cobrado a la vez por más personas. 
	-- Mostrar dicho salario y el número de personas.
	select salary, max(cantidad_repetidos)
	from 	(select salary, count(salary) as "cantidad_repetidos"
			from employees
			group by salary
			--having count(salary)>1
			order by cantidad_repetidos desc)datos
	group by salary
	
-- 6.Seleccionar el número de empleados que empezaron a trabajar 
	-- cada año, ordenando la salida por el año.

	select extract(year from hire_date) as "anio", count(employee_id)
	from employees
	group by extract(year from hire_date)
	order by anio;