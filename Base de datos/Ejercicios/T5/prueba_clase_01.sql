-- Seleccionar el nombre, apellidos y gasto total de aquellos 
-- clientes que gastaron menos que la media de gasto por cliente

SELECT cliente.nombre, cliente.apellido1, COUNT(
						SELECT id_cliente, AVG((precio +precio*COALESCE(descuento, 0)/100)) as "precio_desc"
						FROM vuelo JOIN reserva USING(id_vuelo)
								JOIN cliente USING(id_cliente)
						GROUP BY id_cliente
										)
FROM vuelo JOIN reserva USING(id_vuelo)
			JOIN cliente USING(id_cliente)
WHERE


