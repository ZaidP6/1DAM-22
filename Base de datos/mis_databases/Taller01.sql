DROP TABLE IF EXISTS Vehículo;
DROP TABLE IF EXISTS Cliente;

CREATE TABLE Vehículo(
	Matrícula varchar(12) PRIMARY KEY,
	Marca varchar(40),
	Modelo varchar(55),
	Fecha_matriculación date,
	Kilómetros real,
	color varchar(40),
	Número_bastidor varchar(55),
	Neumáticos varchar(40),
	PotenciaCV integer,
	Tipo_batería varchar(25)	
);

CREATE TABLE Cliente(
	DNI varchar(20) PRIMARY KEY,
	Nombre varchar(40),
	Apellido1 varchar(25),
	Apellido2 varchar(25),
	Dirección varchar(100),
	Teléfono varchar(15),
	Email carchar(40),
	Fecha_nacimiento date
);