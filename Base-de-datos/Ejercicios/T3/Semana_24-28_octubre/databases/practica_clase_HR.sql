select *
from employees
where salary >= 5000 and salary <= 10000;
--esto es un comentario
select *
from employees
where salary between 5000 and 10000;

select *
from departments;

select *
from employees;

select *
from employees
where department_id = 1
	or department_id = 2
	or department_id = 3;
	
select *
from employees 
where department_id in (1,2,3);

select *
from employees
where first_name = 'Alexander';

select *
from employees
where first_name = 'A%';

select *
from employees
where first_name ilike 'Ale%';

select *
from employees
where first_name ilike 'a_a%';

--seleccionar los empleados del departamentto 6 que cobre entre 7000$ y 9000$

select *
from employees
where department_id = 6
	and salary between 7000 and 9000;
	
--seleccionar los empleados que no esten en el departamentto 6 o que no cobre entre 7000$ y 9000$

select *
from employees
where not(department_id = 6 and salary between 7000 and 9000);

--seleccionar a los empleados que cobran
-- menos de 10000$ y la primera letra de su
-- nombre es A o N

select *
from employees
where salary < 10000
	and (first_name ilike 'a%'
	or first_name ilike 'n%');

--PARA SELECCIONAR EMPLEADO SIN JEFE 
	select *
	from employees
	where manager_id is not null;
	
-- CONCATENAR TEXTOS (JUNTAR TEXTOS EN UNA COLUMNA DARLE UN ALIAS A LA COLUMNA)
	select first_name ||' '|| last_name
			as "full name" 
	from employees;
	
-- CONCATENAR TEXTOS (JUNTAR TEXTOS EN UNA COLUMNA DARLE UN ALIAS A LA COLUMNA)
	select first_name ||' '|| last_name
			as "full name" ,
		'Department ID: ' || department_id
			as "Department ID"
	from employees;
	
--Devolver salario quitando un 10%
select salary,
		--salary - (salary * 10 / 100)
		salary - (salary * 0.1)
from employees;

select *
from employees
where hire_date::text like '%-06-%';

select *
from employees
where hire_date::text like '2023%';

select count(*)
from employees;
where department_id = 6;

-- calcula el salario medio de los empleados
-- del departamento 6

select first_name, last_name, avg(salary)
from employees
where department_id = 6;

--select avg(salary);

select sum(salary)
from employees;

select max(salary), min (salary)
from employees
where department_id = 6;