BEGIN;


CREATE TABLE IF NOT EXISTS public.alumnos
(
    dni character varying NOT NULL,
    nombre character varying,
    direccion text,
    telefono text NOT NULL,
    edad smallint,
    empresa character varying,
    PRIMARY KEY (dni),
    CONSTRAINT edad UNIQUE (edad)
);

CREATE TABLE IF NOT EXISTS public.empresas
(
    cif character varying NOT NULL,
    nombre character varying NOT NULL,
    direccion text,
    telefono character varying,
    PRIMARY KEY (cif),
    CONSTRAINT telefono UNIQUE (telefono)
);

CREATE TABLE IF NOT EXISTS public.cursos
(
    n_concreto integer NOT NULL,
    fecha_inicio date,
    fecha_fin date,
    dni_profesor character varying,
    tipo_curso integer,
    nota_curso smallint,
    PRIMARY KEY (n_concreto)
);

CREATE TABLE IF NOT EXISTS public.asistencia_alumnos
(
    dni character varying NOT NULL,
    n_concreto integer NOT NULL,
    PRIMARY KEY (dni, n_concreto)
);

CREATE TABLE IF NOT EXISTS public.profesores
(
    dni character varying NOT NULL,
    nombre character varying,
    apellido character varying,
    telefono character varying,
    direccion text,
    PRIMARY KEY (dni)
);

CREATE TABLE IF NOT EXISTS public.tipos_curso
(
    cod_curso integer NOT NULL,
    duracion smallint,
    programa character varying,
    titulo character varying,
    PRIMARY KEY (cod_curso)
);

-- ALUMNOS
INSERT INTO alumnos VALUES ('77869582J', 'Luis Miguel', 'Rodrigo de triana 24, 2A; 41927, Sevilla', '633958244', 39, 'Salesianos Triana');

-- EMPRESAS
INSERT INTO empresas VALUES ('685468468448GR', 'Salesianos Triana', 'Condes de Bustillo 13, Triana', '954683327');

-- TIPOS_CURSO
INSERT INTO tipos_curso VALUES (001, 250, 'creación de tablas','creador de bbdd');


ALTER TABLE IF EXISTS public.alumnos
    ADD CONSTRAINT empresa FOREIGN KEY (empresa)
    REFERENCES public.empresas (cif) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE SET NULL
    NOT VALID;


ALTER TABLE IF EXISTS public.cursos
    ADD CONSTRAINT dni_profesor FOREIGN KEY (dni_profesor)
    REFERENCES public.profesores (dni) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE SET NULL
    NOT VALID;


ALTER TABLE IF EXISTS public.cursos
    ADD CONSTRAINT tipo_curso FOREIGN KEY (tipo_curso)
    REFERENCES public.tipos_curso (cod_curso) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE CASCADE
    NOT VALID;


ALTER TABLE IF EXISTS public.asistencia_alumnos
    ADD CONSTRAINT dni FOREIGN KEY (dni)
    REFERENCES public.alumnos (dni) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID;


ALTER TABLE IF EXISTS public.asistencia_alumnos
    ADD CONSTRAINT n_concreto FOREIGN KEY (n_concreto)
    REFERENCES public.cursos (n_concreto) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE CASCADE
    NOT VALID;

END;

-- al declarar la PK hay que poner CONSTRAINT pk_nombretabla FOREINGN KEY (nombrePK)
-- ALTER TABLE tabladelaFK
-- ADD CONSTRAINT fk_tabladelaFK_tabladelaPK FOREIGN KEY (nombreFK) REFERENCES nombretablaPK(PKreferenciada)
-- ON DELETE ....tipo de borrado;