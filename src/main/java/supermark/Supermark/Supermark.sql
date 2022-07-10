-- Creacion de la BDD supermark
DROP DATABASE IF EXISTS Supermark;
CREATE DATABASE Universidad CHARACTER SET utf8mb4;
USE Supermark;

-- Crear tablas 
CREATE TABLE Localidad(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    provincia VARCHAR(20),
    departamento VARCHAR(20),
    ciudad VARCHAR(20)
);

CREATE TABLE Domicilio(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    calle1 VARCHAR(30),
    calle2 VARCHAR(30), 
    altura INT, 
    ruta VARCHAR(30), 
    tipoCasa VARCHAR (20),
    dptoNumero INT,
    piso INT,
    id_localidad INT NOT NULL,
    CONSTRAINT localidad_fk
    FOREIGN KEY Domicilio(id_localidad)
    REFERENCES Localidad(id)
);

-- Tabla usuario 
CREATE TABLE Usuario(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30),
    apellido1 VARCHAR(30),
    apellido2 VARCHAR (30), 
    email VARCHAR(30),
    dni INT(8) UNSIGNED NOT NULL,
    tipoUsuario VARCHAR (15), 
    contrasenia VARCHAR(16),
	nombreUsuario VARCHAR (20), 
    id_domicilio INT NOT NULL,
    CONSTRAINT domicilio_fk
    FOREIGN KEY Usuario(id_domicilio)
    REFERENCES Domicilio(id)
);

CREATE TABLE TarjetaCredito(
	numero BIGINT UNSIGNED NOT NULL PRIMARY KEY,
    banco VARCHAR(20),
    titular VARCHAR(60),
    fecha_caducidad DATE,
    id_usuario INT NOT NULL,
    CONSTRAINT usuario_tc_fk
    FOREIGN KEY TarjetaCredito(id_usuario)
    REFERENCES Usuario(id)
);

-- Tabla Descuento 
 CREATE TABLE Descuento(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    porcentaje FLOAT
);


CREATE TABLE Comprobante(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(1),
    fecha TIMESTAMP,
    id_usuario INT NOT NULL,
    id_tc BIGINT UNSIGNED NOT NULL,
    CONSTRAINT usuario_comprobante_fk
    FOREIGN KEY Comprobante(id_usuario)
    REFERENCES Usuario(id),
    CONSTRAINT tc_comprobante_fk
    FOREIGN KEY Comprobante(id_tc)
    REFERENCES TarjetaCredito(numero)
);
-- Tabla producto
CREATE TABLE Producto(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    marca VARCHAR(20),
    fecha_venc DATE,
    descripcion VARCHAR(128),
    precio FLOAT NOT NULL,
    stock INT,
    tipo VARCHAR(20),
    id_descuento INT NOT NULL,
    CONSTRAINT descuento_fk
    FOREIGN KEY Tipo(id_descuento)
    REFERENCES Descuento(id)
);

CREATE TABLE Factura(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_comprobante INT NOT NULL,
    id_producto INT NOT NULL,
    cantidad INT UNSIGNED NOT NULL,
    CONSTRAINT comprobante_fk
    FOREIGN KEY Detalle(id_comprobante)
    REFERENCES Comprobante(id),
    CONSTRAINT producto_fk
    FOREIGN KEY Producto(id_producto)
    REFERENCES Producto(id)
);



