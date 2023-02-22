DROP TABLE IF EXISTS Vehículo;
DROP TABLE IF EXISTS Cliente;

CREATE TABLE Vehículo(
	Matrícula varchar(12),
	Marca varchar(40),
	Modelo varchar(55),
	Fecha_matriculación date,
	Kilómetros real,
	color varchar(40),
	Número_bastidor varchar(55),
	Neumáticos varchar(40),
	PotenciaCV integer,
	Tipo_batería varchar(25),
	
	CONSTRAINT pk_Vehículo PRIMARY KEY(Matrícula)
);

CREATE TABLE Cliente(
	DNI_cliente varchar(20),
	Nombre varchar(40),
	Apellido1 varchar(25),
	Apellido2 varchar(25),
	Dirección varchar(100),
	Teléfono varchar(15) UNIQUE NOT NULL,
	Email varchar(40),
	Fecha_nacimiento date,
	Matrícula varchar(12),
	
	CONSTRAINT pk_Cliente PRIMARY KEY(DNI_cliente),
	FOREIGN KEY(Matrícula) REFERENCES Vehículo(Matrícula)
);