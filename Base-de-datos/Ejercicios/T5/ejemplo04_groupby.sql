-- seleccionar el nº de empleados que trabaja en cada país
 
 select country_name, count(employee_id)
 from employees join departments using(department_id)
 				join locations using(location_id)
				join countries using(country_id)
				join regions using (region_id)
group by country_name, city, 

-- seleccionar el nº de empleados que trabaja en cada país 
--siempre que el pais no este en la region de Asia, siendo 5 
--el nº mayor de emppleados

 select country_name, count(employee_id), avg(salary)
 from employees join departments using(department_id)
 				join locations using(location_id)
				join countries using(country_id)
				join regions using (region_id)
where region_name !='Asia'  
group by country_name
having count(employee_id)<5;

-- Seleccionar la media de la temperatura media agrupando por provincia y mes.
-- Ordena los resultados por provincias asc y cronológicamente(enero, fecbrero, marzo, ...).

select provincia, to_char(fecha,'tmmonth')"Mes", avg(temperatura_media) "media"
from climatologia 
group by to_char(fecha,'tmmonth'), extract(month from fecha),  provincia
order by provincia asc, extract(month from fecha);

