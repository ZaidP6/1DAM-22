--ejercicio1

SELECT  ROUND(AVG(precio),2)
FROM vuelo JOIN aeropuerto d ON (desde = d.id_aeropuerto)
			JOIN aeropuerto h ON (hasta = h.id_aeropuerto) 
WHERE (d.nombre IN('Heathrow') AND h.nombre IN ('JFK'))
		AND descuento is null

--ejercicio2

SELECT DISTINCT id_cliente, nombre, apellido1, apellido2
FROM cliente JOIN reserva USING (id_cliente)
WHERE fecha_reserva TO_CHAR (fecha_reserva, 'id' ) 
								IN ('Mon', 'Tue', 'Wed')
				AND desde IN('Berlín')
ORDER BY id_cliente;	


--ejercicio3

SELECT  desde, salida, hasta, llegada
FROM vuelo JOIN aeropuerto h ON (hasta = h.id_aeropuerto)
			JOIN reserva USING (id_vuelo)
WHERE h.nombre IN ('Ámsterdam-Schiphol') 
		AND llegada TO_CHAR('Fri', 'id') AND llegada TO_CHAR('Feb', 'MM')
		AND fecha_reserva TO_CHAR('HH:MM') 
					BETWEEN 07:00::timestamp AND 07:59::timestamp;
					
--ejercicio4

SELECT *
FROM vuelo JOIN aeropuerto d ON (desde = d.id_aeropuerto)
			JOIN aeropuerto h ON (hasta = h.id_aeropuerto) 
WHERE ciudad = 'Sevilla' AND 



								

