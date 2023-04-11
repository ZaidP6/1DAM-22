select first_name, last_name,department_name,salary
from public.employees, public.departments
where public.employees.department_id=
			public.departments.department_id
order by last_name;

SELECT first_name, last_name,department_name,salary
FROM public.employees, public.departments
WHERE public.employees.department_id=
			public.departments.department_id 
			and salary > 10000
ORDER BY last_name;

SELECT first_name, last_name,department_name,salary, job_title
FROM public.employees, public.departments, public.jobs
WHERE public.employees.department_id=
			public.departments.department_id 
			AND public.employees.job_id = jobs.job_id
			and salary > 10000
ORDER BY salary desc;

SELECT *
FROM public.employees NATURAL JOIN department;

SELECT *
FROM public.employees JOIN departments USING (department_id)
WHERE salary > 10000;

SELECT *
FROM employees el JOIN employees e2 ON (e1.manager_id) = (e2.manager_id)
