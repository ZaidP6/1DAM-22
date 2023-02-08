--duracion media de todos los vuelos

select avg(age(llegada, salida))
from vuelo;

--

-- Primera aproximación. Esta no nos permite mostrar el nombre de los aeropuertos y demás datos

SELECT TO_CHAR(salida, 'ID'), 
		MAX(age(llegada, salida))
FROM vuelo JOIN aeropuerto d 
		ON (d.id_aeropuerto = vuelo.desde)
	JOIN aeropuerto h 
		ON (h.id_aeropuerto = vuelo.hasta)
GROUP BY TO_CHAR(salida, 'ID');

-- Solución correcta con subconsulta correlacionada.
SELECT d.ciudad, h.ciudad, salida, llegada,
		TO_CHAR(salida, 'TMDay'),
		age(llegada, salida)
FROM vuelo v JOIN aeropuerto d 
		ON (d.id_aeropuerto = v.desde)
	JOIN aeropuerto h 
		ON (h.id_aeropuerto = v.hasta)
WHERE age(llegada, salida) >= ALL
			(
				SELECT age(llegada, salida)
				FROM vuelo v2
				WHERE TO_CHAR(v.salida, 'ID')
						= TO_CHAR(v2.salida, 'ID')			
			)
ORDER BY TO_CHAR(v.salida, 'ID');