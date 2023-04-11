DROP TABLE IF EXISTS cliente CASCADE;
DROP TABLE IF EXISTS visita CASCADE;
DROP TABLE IF EXISTS propietario CASCADE;
DROP TABLE IF EXISTS habitaciones;
DROP TABLE IF EXISTS inmueble CASCADE;
DROP TABLE IF EXISTS local;
DROP TABLE IF EXISTS vivienda;
DROP TABLE IF EXISTS chalet;
DROP TABLE IF EXISTS piso;
DROP TABLE IF EXISTS casa;

CREATE TABLE cliente(
	dni 				varchar(15),
	nombre				text,
	
	CONSTRAINT pk_cliente PRIMARY KEY (dni)
);

CREATE TABLE visita(
	fecha				date,
	ref_inmueble		varchar,
	dni_propietario		varchar(15),
	dni_cliente			varchar(15),
	comentarios			text,
	
	CONSTRAINT pk_visita PRIMARY KEY (fecha, ref_inmueble, dni_cliente,dni_propietario)
);

CREATE TABLE propietario(
	dni					varchar(15),
	nombre				text,
	telefono			integer, 
	
	CONSTRAINT pk_propietario PRIMARY KEY (dni)
);

CREATE TABLE inmueble(
	ref					varchar,
	dni_propietario 	varchar(15),
	m2					real,
	direccion			text, 
	tipoOperacion		integer,
	
	CONSTRAINT pk_inmueble PRIMARY KEY (ref, dni_propietario)
);

CREATE TABLE vivienda(
	ref					varchar,
	dni_propietario		varchar(15),
	descripcion			text, 
	numBath				smallint, 
	
	CONSTRAINT pk_vivienda PRIMARY KEY (ref)
) INHERITS (inmueble);

CREATE TABLE local(
	ref					varchar,
	dni_propietario		varchar(15),
	zona				smallint, 
	caracteristicas		text, 
	
	CONSTRAINT pk_local PRIMARY KEY (ref,dni_propietario)
) INHERITS (inmueble);

CREATE TABLE piso(
	ref					varchar,
	zona				smallint, 
	esNuevo				boolean,
	
	CONSTRAINT pk_piso PRIMARY KEY (ref)
) INHERITS (vivienda);

CREATE TABLE casa(
	ref					varchar,
	zona				smallint, 
	esNuevo				boolean,
	
	CONSTRAINT pk_casa PRIMARY KEY (ref)
) INHERITS (vivienda);

CREATE TABLE chalet(
	ref					varchar,
	urbanizacion		varchar, 
	parcela				smallint,
	
	CONSTRAINT pk_chalet PRIMARY KEY (ref)
) INHERITS (vivienda);

CREATE TABLE habitaciones(
	id_tipo				smallint,
	ref_vivienda		varchar,
	m2					real,
	descripcion			text,
	foto				varchar,
	
	CONSTRAINT pk_habitaciones PRIMARY KEY (id_tipo, ref_vivienda)
);
--TABLA INMUEBLE-- 
ALTER TABLE inmueble
ADD CONSTRAINT fk_inmueble_propietario FOREIGN KEY (dni_propietario) REFERENCES propietario(dni);

-- TABLA VISITA -- 
ALTER TABLE visita
ADD CONSTRAINT fk_visita_cliente FOREIGN KEY (dni_cliente) REFERENCES cliente(dni),
ADD CONSTRAINT fk_visita_inmueble FOREIGN KEY (ref_inmueble,dni_propietario) REFERENCES inmueble(ref,dni_propietario);

--TABLA VIVIENDA--
ALTER TABLE vivienda
ADD CONSTRAINT fk_vivienda_inmueble FOREIGN KEY (ref,dni_propietario) REFERENCES inmueble(ref,dni_propietario);

--TABLA LOCAL--
ALTER TABLE local
ADD CONSTRAINT fk_local_inmueble FOREIGN KEY (ref,dni_propietario) REFERENCES inmueble(ref,dni_propietario);

--TABLA HABITACIONES--
ALTER TABLE habitaciones
ADD CONSTRAINT fk_habitaciones_vivienda FOREIGN KEY (ref_vivienda) REFERENCES vivienda(ref);

--TABLA PISO--
ALTER TABLE piso
ADD CONSTRAINT fk_piso_vivienda FOREIGN KEY (ref) REFERENCES vivienda(ref);

--TABLA CASA--
ALTER TABLE casa
ADD CONSTRAINT fk_casa_vivienda FOREIGN KEY (ref) REFERENCES vivienda(ref);

--TABLA CHALET--
ALTER TABLE chalet
ADD CONSTRAINT fk_chalet_vivienda FOREIGN KEY (ref) REFERENCES vivienda(ref);