DROP TABLE IF EXISTS my_first_table;
DROP TABLE IF EXISTS my_second_table;
DROP TABLE IF EXISTS productos;
DROP TABLE IF EXISTS alumno;

-- este scrip no tiene fallos porque crea una tabla pero si repetirla.

CREATE TABLE my_first_table(
first_column		text,
second_column		integer
);

CREATE TABLE my_second_table(
cod_categoria		smallserial,  --donde el número más grande será unos 32000 números
nombre				text
);

CREATE TABLE productos(
	id_producto		serial,
	nombre			text,
	precio			numeric(6,2) DEFAULT 9.99,
	fecha_creacion	timestamp DEFAULT CURRENT_TIMESTAMP,
	valoracion		int2, --smallint
	descuento		numeric DEFAULT 0, 
	precio_desc		numeric GENERATED ALWAYS AS(precio - (precio*descuento)) STORED
);

INSERT INTO
	productos(nombre, precio)
VALUES 
	('PC',499.9);

INSERT INTO
	productos(nombre) --otra opcion productos(num_producto,nombre, precio)
VALUES 
	('Auriculares con cara de D.Bosco'); -- (2, 'Auriculares con cara de D.Bosco', DEFAULT);

INSERT INTO productos
VALUES(DEFAULT, 'Ratón Razer Mamba Tournament');


-- crear una tabla para guardar alumno por ahora con nombre, 
-- apellidos, numero de asignaturas y nota media.
-- Agregar fecha de nacimiento, de matrícula y la edad a 31 de dic. del año actual.

CREATE TABLE alumno(
	nombre				varchar(100),
	apellidos			varchar(200),
	numero_asignaturas	smallint,
	nota_media			numeric(4,2),
	fecha_nacimiento	date,
	fecha_matricula		date,
	edad_31_dic			smallint
);

INSERT INTO
	productos(nombre, precio, descuento)
VALUES
	('Xiaomi Redmi Note', 426.48, 21);
	