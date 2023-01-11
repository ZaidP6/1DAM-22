SELECT *
FROM employees;

/*1 - seleccionar el nombre, los apellidos y el email de los empleados 
que trabajen en en una oficina del Reino Unido (United Kingdom)*/

SELECT first_name, last_name, email
FROM employees
		  JOIN departments USING (department_id)
		  JOIN locations USING (location_id)
		  JOIN countries USING (country_id)
WHERE country_name = 'United Kingdom';

/*2 - Seleccionar el nombre de aquellos departamentos en los que trabaja 
un empleado que fue contratado a lo largo del año 1993.*/

SELECT department_name
FROM departments JOIN employees USING (department_id)
WHERE hire_date::text ILIKE '1993-%';

/*3 - Seleccionar la región de los empleados con un salario inferior a 10000$*/

SELECT DISTINCT(region_name)
FROM regions JOIN countries USING (region_id)
			JOIN locations USING (country_id)
			JOIN departments USING (location_id)
			JOIN employees USING (department_id)
WHERE salary < 10000;

/*4 - Seleccionar el nombre de aquellos empleados cuyo 
jefe directo tenga un apellido que empiece por D, H o S.*/

/*SELECT first_name
FROM employees JOIN employees USING (manager_id)
				JOIN employees USING (employee_id)
WHERE manager_id = employee_id AND last_name LIKE 'D%' 
				OR last_name LIKE 'H%' OR last_name LIKE 'S%';*/
-- Primera vez al hacerlo, creo que no termino de entender bien 
-- la diferencia entre USING y ON.
				
SELECT a2.first_name
FROM employees a2 JOIN employees a1 ON(a1.manager_id=a2.employee_id)
WHERE a1.last_name LIKE 'D%' OR a1.last_name LIKE 'H%' OR a1.last_name LIKE 'S%';


/*5 - Seleccionar el número de familiares (dependents) que son hijos 
de algún miembro de los departamentos de Marketing, Administration e IT.*/

SELECT COUNT(*)
FROM dependents JOIN employees USING (employee_id)
				JOIN departments USING (department_id)
WHERE department_name IN ('Marketing', 'Administration', 'IT') AND relationship = 'Child';