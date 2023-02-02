-- seleccionar lo 5 empleados q mas cobran
select first_name,last_name, salary
from employees
order by salary desc
limit 5;

-- seleccionar los empleados que cobrar los 5 salarios mas altos
select *
from employees
where salary in(
				select distinct salary
				from employees
				order by salary desc
				limit 5
				);
				
-- seleccionar los 5 departamentos con los empleados con salarios 
-- más altos. Debe aparecer el nombre del departamento y el salario 
-- más alto de dicho departamento.

select department_name, max(salary)
from employees join departments using(department_id)
group by department_name
order by max(salary) desc
limit 5;

-- seleccionar los departamentos con los empleados con 5 salarios 
-- más altos. Debe aparecer el nombre del departamento y el salario 
-- más alto de dicho departamento. Resolver con subconsulta.

select department_name,  max(salary)
from employees join departments using(department_id)
group by department_name
having max(salary) in (
						select distinct max(salary)
						from employees
						group by department_id
						order by max(salary) desc
						limit 5
						)
order by max(salary) desc
limit 5;