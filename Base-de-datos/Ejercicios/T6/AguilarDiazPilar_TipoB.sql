DROP TABLE IF EXISTS producto CASCADE;
DROP TABLE IF EXISTS categoria CASCADE;
DROP TABLE IF EXISTS trabajador CASCADE;
DROP TABLE IF EXISTS pedido CASCADE;
DROP TABLE IF EXISTS detallepedido CASCADE;
DROP TABLE IF EXISTS comprador CASCADE;


CREATE TABLE producto(
	cod_producto		integer,
	nombre				varchar NOT NULL, 
	descripcion			text, 
	pvp					numeric NOT NULL, 
	categoria			varchar,
	
	CONSTRAINT pk_producto PRIMARY KEY(cod_producto)
);

CREATE TABLE categoria(
	id_categoria		integer,
	nombre				varchar NOT NULL,
	descripcion			text,
	
	CONSTRAINT pk_categoria PRIMARY KEY(id_categoria)
);

CREATE TABLE trabajador(
	num_trabajador		integer,
	nombre_completo		text NOT NULL,
	email				text(320),
	cuenta_corriente	varchar(24),
	pass				varchar(12),
	
	CONSTRAINT pk_trabajador PRIMARY KEY(num_trabajador)
);

CREATE TABLE pedido(
	cod_pedido			integer,
	fecha_pedido		date NOT NULL,
	num_trabajador		integer NOT NULL,
	dni_comprador		varchar NOT NULL,
	
	CONSTRAINT pk_pedido PRIMARY KEY(cod_pedido)
);

CREATE TABLE detallepedido(
	cod_pedido			integer,
	num_detalle			integer,
	cantidad			integer,
	cod_producto		integer,
	precio				numeric(2) NOT NULL, 
	descuento			numeric NOT NULL,
	
	CONSTRAINT pk_detallepedido PRIMARY KEY(cod_pedido,num_detalle)
);


CREATE TABLE comprador(
	dni					varchar,
	nombre_completo		text NOT NULL,
	email				text(320),
	direccion			text(100),
	fecha_alta			date,
	
	CONSTRAINT pk_detallepedido PRIMARY KEY(cod_pedido,num_detalle)
);

ALTER TABLE producto
	ADD CONSTRAINT fk_producto_categoria FOREIGN KEY(categoria) REFERENCES id_categoria;
	
ALTER TABLE trabajador
	ADD CONSTRAINT pass CHECK('%@%');
	ADD CONSTRAINT cuenta_corriente CHECK('es%'),
	ADD CONSTRAINT pass CHECK(!='-';
							  
ALTER TABLE pedido
	ADD CONSTRAINT fk_pedido_trabajador FOREIGN KEY(num_trabajador) REFERENCES num_trabajador,
	ADD CONSTRAINT fk_pedido_comprador FOREIGN KEY(dni_compardor) REFERENCES dni;
							  
ALTER TABLE detallepedido
	ADD CONSTRAINT cantidad CHECK(cantidad > 0),
	ADD CONSTRAINT descuento DEFAULT 0,
	ADD CONSTRAINT fk_detallepedido_producto FOREIGN KEY(cod_producto) REFERENCES cod_producto;
							  

							  
INSERT INTO categoria (id_categoria,nombre) VALUES (001,electronica);
INSERT INTO comprador (dni, nombre_completo,email) VALUES (88569245B, Fernando Fanegas, fernando.fanegas@yahoo.com);
INSERT INTO pedido (cod_pedido,dni_comprador) VALUES (001,88569245B);
INSERT INTO detallepedido (cod_pedido) VALUES (001);
