select department_name, count(employee_id)
from departments right join employees using (department_id)
group by department_name;