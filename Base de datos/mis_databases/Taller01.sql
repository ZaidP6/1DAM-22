DROP TABLE IF EXISTS vehiculo;
DROP TABLE IF EXISTS cliente;

CREATE TABLE vehiculo(
	matricula varchar(12),
	Marca varchar(40),
	Modelo varchar(55),
	Fecha_matriculación date,
	Kilómetros real,
	color varchar(40),
	Número_bastidor varchar(55),
	Neumáticos varchar(40),
	PotenciaCV integer,
	
	CONSTRAINT pk_vehiculo PRIMARY KEY(matricula)
);

CREATE TABLE cliente(
	dni varchar(20),
	nombre varchar(40),
	apellidos varchar(50),
	direccion text,
	telefono varchar(15) UNIQUE NOT NULL,
	email varchar(40),
	fecha_nacimiento date,
	matricula varchar(12),
	
	CONSTRAINT pk_cliente PRIMARY KEY(dni)
);