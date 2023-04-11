BEGIN;


CREATE TABLE IF NOT EXISTS public."Usuarios"
(
    dni character varying(20) NOT NULL,
    nombre character varying NOT NULL,
    apellidos character varying NOT NULL,
    direccion text,
    telefono numeric NOT NULL,
    email character varying NOT NULL,
    passw character varying(8),
    saldo_disponible real NOT NULL DEFAULT 0,
	fecha_baja date,
    PRIMARY KEY (dni)
	--CONSTRAINT pasw CHECK ( )
);

CREATE TABLE IF NOT EXISTS public."Estaciones"
(
    cod_estacion character varying NOT NULL,
    num_estacion serial NOT NULL,
    direccion character varying NOT NULL,
    latitud real NOT NULL,
    longitud real NOT NULL,
    PRIMARY KEY (cod_estacion)
);

CREATE TABLE IF NOT EXISTS public."Bicicletas"
(
    cod_bicicleta serial NOT NULL,
    marca character varying NOT NULL,
    modelo character varying NOT NULL,
    fecha_alta date NOT NULL,
    PRIMARY KEY (cod_bicicleta)
);

CREATE TABLE IF NOT EXISTS public."Uso"
(
    estacion_salida character varying NOT NULL,
    fecha_salida timestamp without time zone NOT NULL,
    dni_usuario character varying(20) NOT NULL,
    cod_bicicleta integer NOT NULL,
    estacion_llegada character varying NOT NULL,
    fecha_llegada timestamp without time zone NOT NULL,
    PRIMARY KEY (estacion_salida, fecha_salida, dni_usuario, cod_bicicleta, estacion_llegada)
);

ALTER TABLE IF EXISTS public."Uso"
    ADD CONSTRAINT estacion_salida FOREIGN KEY (estacion_salida)
    REFERENCES public."Estaciones" (cod_estacion) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID;


ALTER TABLE IF EXISTS public."Uso"
    ADD CONSTRAINT dni_usuario FOREIGN KEY (dni_usuario)
    REFERENCES public.usuarios (dni) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID;


ALTER TABLE IF EXISTS public."Uso"
    ADD CONSTRAINT estacion_llegada FOREIGN KEY (estacion_llegada)
    REFERENCES public."Estaciones" (cod_estacion) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID;


ALTER TABLE IF EXISTS public."Uso"
    ADD CONSTRAINT cod_bicicleta FOREIGN KEY (cod_bicicleta)
    REFERENCES public."Bicicletas" (cod_bicicleta) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID;

ALTER TABLE IF EXISTS public."Usuarios"
	ADD CONSTRAINT ck_passw check (len(rtrim(passw))>0);

END;