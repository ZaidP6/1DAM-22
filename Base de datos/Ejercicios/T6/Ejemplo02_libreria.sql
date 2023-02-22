 DROP TABLE IF EXISTS libro;
 DROP TABLE IF EXISTS autor;
 DROP TABLE IF EXISTS editorial;
 DROP TABLE IF EXISTS genero;
 DROP TABLE IF EXISTS edicion;
 
 
 CREATE TABLE libro(
 	 isbn				varchar(15),
	 titulo				text NOT NULL,
	 dni_autor			varchar NOT NULL,
	 cod_genero			integer NOT NULL, 
	 cod_ditorial		integer NOT NULL,
	 CONSTRAINT pk_libro PRIMARY KEY (isbn)
 );
 
 CREATE TABLE autor(
 	dni					varchar(20),
	nombre				text NOT NULL,
	nacionalidad		text,
	CONSTRAINT pk_autor PRIMARY KEY(dni)
	--CONSTRAINT fk_autor_libro FOREIGN KEY(dni) REFERENCES libro
);
 
 CREATE TABLE editorial(
 	cod_editorial		varchar,
	nombre				text NOT NULL,
	direccion			text,
	poblacion			varchar,
	CONSTRAINT pk_editorial PRIMARY KEY(cod_editorial)
	--CONSTRAINT fk_editorial_libro FOREIGN KEY(cod_editorial) REFERENCES libro
 );
 
 CREATE TABLE  genero(
 	id_genero			varchar,
	nombre				varchar NOT NULL,
	descripcion			text,
	CONSTRAINT pk_genero PRIMARY KEY(id_genero)
	--CONSTRAINT fk_genero_libro FOREIGN KEY(id_genero) REFERENCES libro
 );
 
 CREATE TABLE edicion(
 	isbn				varchar(20),
	fecha_publicacion	date,
	cantidad			integer CONSTRAINT cantidad_positiva CHECK(cantidad>0),
	CONSTRAINT pk_edicion PRIMARY KEY(isbn, fecha_publicacion)
	--CONSTRAINT fk_edicion_libro FOREIGN KEY (isbn) REFERENCES libro
 );
--OPCION 1(NO HA RESULTADO)
--COMMIT;
--BEGIN TRANSACTION;
--ALTER TABLE autor
--ADD FOREIGN KEY(dni) REFERENCES (dni);
--COMMIT;

--OPCION 2 
ALTER TABLE autor
ADD CONSTRAINT FK_autor_libro
FOREIGN KEY (isbn) REFERENCES libro(isbn)
ON DELETE CASCADE;

ALTER TABLE editorial
ADD CONSTRAINT FK_editorial_libro
FOREIGN KEY (isbn) REFERENCES libro(isbn)
ON DELETE CASCADE;

ALTER TABLE genero
ADD CONSTRAINT FK_genero_libro
FOREIGN KEY (isbn) REFERENCES libro(isbn)
ON DELETE CASCADE;

ALTER TABLE edicion 
ADD CONSTRAINT FK_edicion_libro
FOREIGN KEY (isbn) REFERENCES libro(isbn)
ON DELETE CASCADE;

--ROLLBACK