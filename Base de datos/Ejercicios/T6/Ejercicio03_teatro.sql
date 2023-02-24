DROP TABLE IF EXISTS invitados;
DROP TABLE IF EXISTS teatros CASCADE;
DROP TABLE IF EXISTS obras CASCADE;
DROP TABLE IF EXISTS tipos_asientos CASCADE;
DROP TABLE IF EXISTS exhibe CASCADE;
DROP TABLE IF EXISTS asientos_tipo;
DROP TABLE IF EXISTS precio;


CREATE TABLE invitados(
NroInvitado		integer,
Nombre			varchar,
Categoria		varchar,
Origen			varchar(20),

CONSTRAINT pk_invitados PRIMARY KEY (NroInvitado)
);

CREATE TABLE teatros(
CodTeat			integer,
Nombre			varchar,
Direccion		text, 
CantAsientos	integer,

CONSTRAINT pk_teatros PRIMARY KEY (CodTeat)
);

CREATE TABLE obras(
CodObra			smallint,
NombreObra		text,
Autor			varchar,
	
CONSTRAINT pk_obras PRIMARY KEY(CodObra)
);

CREATE TABLE  tipos_asientos(
Tipo			smallint,
Nombre			varchar,
Descripcion		text,
	
CONSTRAINT pk_tipos_asientos PRIMARY KEY (Tipo)
);

CREATE TABLE exhibe(
CodTeat			integer,
Feha			date,
CodObra			smallint,
	
CONSTRAINT pk_exhibe PRIMARY KEY (CodTeat)
);

ALTER TABLE exhibe
ADD CONSTRAINT FK_exhibe_teatros FOREIGN KEY (CodTeat) 
REFERENCES teatros (CodTeat)
ON DELETE CASCADE;
	
ALTER TABLE exhibe
ADD CONSTRAINT FK_exhibe_obras FOREIGN KEY (CodObra) 
REFERENCES obras (CodObra)
ON DELETE CASCADE;

CREATE TABLE asiento_tipos(
NroAsiento		integer,
Tipo			smallint,
	
CONSTRAINT pk_asiento_tipos PRIMARY KEY (NroAsiento)
);

ALTER TABLE asiento_tipos
ADD CONSTRAINT FK_asiento_tipos_tipos_asientos FOREIGN KEY (tipo) 
REFERENCES tipos_asientos (tipo)
ON DELETE CASCADE;

CREATE TABLE precio(
CodTeat			integer,
Fecha			date,
Tipo			smallint,
Precio			real,
	
CONSTRAINT pk_precio PRIMARY KEY (CodTeat, Fecha)
);

-- Da un error en estas dos últimas FK

/*ALTER TABLE precio
ADD CONSTRAINT FK_precio_exhibe FOREIGN KEY (CodTeat, Fecha) 
REFERENCES exhibe (CodTeat, Fecha)
ON DELETE CASCADE;

ALTER TABLE precio
ADD CONSTRAINT FK_precio_tipos_aseintos FOREIGN KEY (Tipo) 
REFERENCES tipo_asientos (Tipo)
ON DELETE CASCADE;
*/