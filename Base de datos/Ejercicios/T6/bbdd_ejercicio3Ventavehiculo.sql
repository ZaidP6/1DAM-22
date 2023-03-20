
DROP TABLE IF EXISTS vehiculo CASCADE;
DROP TABLE IF EXISTS coche CASCADE;
DROP TABLE IF EXISTS motocicleta CASCADE;
DROP TABLE IF EXISTS venta CASCADE;
DROP TABLE IF EXISTS lineaDeVenta CASCADE;
DROP TABLE IF EXISTS cliente CASCADE;


CREATE TABLE vehiculo
(
    numBastidor varchar,
    fechaMatriculacion date,
    matricula varchar,
    CONSTRAINT pkvehiculo PRIMARY KEY (numBastidor)
);

CREATE TABLE coche
(
    numBastidor varchar,
    numPuertas smallint,
    CONSTRAINT pk_coche PRIMARY KEY (numBastidor)
);

CREATE TABLE motocicleta
(
    numBastidor varchar,
    cilindrada integer,
    CONSTRAINT pk_motocicleta PRIMARY KEY (numBastidor)
);

CREATE TABLE Venta
(
    codVenta varchar,
    fecha date,
    codCliente serial,
    CONSTRAINT pk_venta PRIMARY KEY (codVenta)
);

CREATE TABLE lineaDeVenta
(
    codVenta varchar,
    codLinea varchar,
    pvp real,
    numBastidor varchar,
    CONSTRAINT pk_lineaDeVenta PRIMARY KEY (codVenta, codLinea)
);

CREATE TABLE cliente
(
    codCliente serial,
    nombre varchar,
    clientePremium boolean,
    CONSTRAINT pk_cliente PRIMARY KEY (codCliente)
);

ALTER TABLE coche
    ADD CONSTRAINT fk_coche_vehiculo 
	FOREIGN KEY (numBastidor) REFERENCES vehiculo (numBastidor) 
    ON DELETE CASCADE;


ALTER TABLE motocicleta
    ADD CONSTRAINT fk_motocicleta_vehiculo  
	FOREIGN KEY  (numBastidor) REFERENCES vehiculo (numBastidor)
    ON DELETE CASCADE;


ALTER TABLE venta
    ADD CONSTRAINT fk_venta_cliente 
	FOREIGN KEY (codCliente) REFERENCES cliente (codCliente)
    ON DELETE CASCADE;


ALTER TABLE lineaDeVenta
    ADD CONSTRAINT fk_lineaDeVenta_venta 
	FOREIGN KEY (codVenta) REFERENCES venta (codVenta) 
    ON DELETE CASCADE;


ALTER TABLE lineaDeVenta
    ADD CONSTRAINT  fk_lineaDeVenta_vehiculo
	FOREIGN KEY (numBastidor) REFERENCES vehiculo (numBastidor) 
    ON DELETE CASCADE;