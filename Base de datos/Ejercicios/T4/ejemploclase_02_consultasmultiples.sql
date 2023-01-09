--seleccionar todos los datos de aquellos
--empleados que pertenezcan al departamento
-- Execituve.

SELECT *
FROM employees JOIN departments
	USING (department_id)
WHERE department_name ilike 'Executive';

-- seleccionar el nombre de aquellos departamentos
-- que tengas empleados qu cobren en 8 y 10 mil dólares (ambos inclusive)

SELECT DISTINCT department_name
FROM departments JOIN employees
		USING (department_id)
WHERE salary BETWEEN 8000 AND 10000;

-- seleccionar el nombre y apellidos de aquellos
-- empleados qu eno trabajan en oficinas situadas
-- en Tokio.

SELECT first_name, last_name, city
FROM employees JOIN departments
		USING (department_id)
				JOIN locations
		USING (location_id)
WHERE city != 'Tokio';

-- seleccionar el número de epmpleados de la región Europe

SELECT COUNT(*)
FROM employees JOIN departments
		USING (department_id)
			JOIN locations
		USING (location_id)
			JOIN public.countries
		USING (country_id)
			JOIN regions
		USING (region_id)
WHERE region_name = 'Europe';
