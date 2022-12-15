select *
from employees
where department_id > 8 and department_id < 12;

select *
from countries
where country_name ilike '_a_%';

select *
from employees;

select last_name, first_name, salary, department_id
from employees
where salary >= 100000 and not (job_id = 6);

select *
from departments
where department_name ilike '%t%t%';

select *
from locations
where (city = 'Toronto' or city = 'Oxford') or state_province = 'California';