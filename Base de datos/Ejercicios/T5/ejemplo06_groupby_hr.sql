--salario medio maximo agrupando por departamento

select max(salario),  avg(num)
from (
		select department_name, avg(salary) as "media"
		from employees join departments using(department_id) as "num"
		group by aeropuerto.nombre, ciudad, to_char(salida,'TMDay')
		order by ciudad asc
		)datos
group by departmet_name
order by media desc
limit 2;
