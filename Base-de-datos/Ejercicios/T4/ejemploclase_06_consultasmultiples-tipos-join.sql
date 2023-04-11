select count(*)
from departments;

select count(*)
from employees;

select count(*)
from employees join departments using (department_id);

select *
from employees left join departments using (department_id);

--para que aparezcan todos los empleados aunque no tengan departamento asignado

select *
from employees right join departments using (department_id);

--para que aparezcan los departamentos que no tienen empleados

select *
from employees full join departments using (department_id);

--para sacar ambos resultados en una consulta
