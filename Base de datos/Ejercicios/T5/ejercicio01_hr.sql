-- 1.Seleccionar el salario máximo de cada departamento, mostrando 
	-- el nombre del departamento y dicha cantidad.
	
	select department_name, max(salary)
	from employees join departments on(department_id= department_id)
	group by department
-- 2.Seleccionar el salario mínimo de cada departamento, para 
	-- aquellos departamentos cuyo salario mínimo sea menor que 5000$.
-- 3.Seleccionar el número de empleados que trabajan en cada oficina, 
	-- mostrando el STREET_ADDRESS y dicho número; hay que ordenar la 
	-- salida de mayor a menor.
-- 4.Modificar la consulta anterior para que muestre las 
	-- localizaciones que no tienen ningún empleado.
-- 5.Seleccionar el salario que es cobrado a la vez por más personas. 
	-- Mostrar dicho salario y el número de personas.
-- 6.Seleccionar el número de empleados que empezaron a trabajar 
	-- cada año, ordenando la salida por el año.
