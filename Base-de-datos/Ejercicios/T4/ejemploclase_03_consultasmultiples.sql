SELECT *
FROM employees;

/* seleccionar el nombre, los apellidos y el email de los empleados 
que trabajen en en una oficina del Reino Unido (United Kingdom)*/

SELECT first_name, last_name, email
FROM employees
		  JOIN departments USING (department_id)
		  JOIN locations USING (location_id)
		  JOIN countries USING (country_id)
WHERE country_name = 'United Kingdom';

--seleccionar el número total de empleados que 
--trabajan en las regiones de Americas y Asia 

SELECT COUNT (*)
FROM employees
		JOIN departments USING (department_id)
		JOIN locations USING (location_id)
		JOIN countries USING (country_id)
		JOIN regions USING (region_id)
WHERE region_name IN ('Americas', 'Asia');

