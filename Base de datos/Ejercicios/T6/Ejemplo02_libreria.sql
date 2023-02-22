 DROP TABLE IF EXISTS libro;
 DROP TABLE IF EXISTS autor;
 DROP TABLE IF EXISTS editorial;
 DROP TABLE IF EXISTS genero;
 DROP TABLE IF EXISTS edicion;
 
 
 CREATE TABLE libro(
 	 isbn				varchar(15),
	 titulo				text,
	 dni_autor			varchar,
	 cod_genero			integer, 
	 cod_ditorial		integer
 );
 
 CREATE TABLE autor(
 	dni					varchar,
	nombre				text,
	nacionalidad		text
 );
 
 CREATE TABLE editorial(
 	cod_editorial		serial,
	nombre				text,
	direccion			text,
	poblacion			varchar
 );
 
 CREATE TABLE  genero(
 	id_genero			smallint,
	nombre				varchar,
	descripcion			text
 );
 
 CREATE TABLE edicion(
 	isbn				varchar(20),
	fecha_publicidad	date,
	cantidad			integer
 );