CREATE DATABASE supermarket DEFAULT CHAR SET utf8mb4;
USE supermarket; 

CREATE TABLE domicilio (
  id_domicilio int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  Localidad varchar(20) NOT NULL DEFAULT '',
  Ciudad VARCHAR(15) NOT NULL DEFAULT 'Capital',
  Barrio VARCHAR(20) NOT NULL DEFAULT '',
  Calle VARCHAR(20) NOT NULL DEFAULT '', 
  Altura int NOT NULL DEFAULT '0'
 ); 

 CREATE TABLE tipoCasa (
 id_casa INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
 tCasa VARCHAR (20) NOT NULL DEFAULT 'Casa', 
 dptoNumero INT, 
 piso INT,
 id_domicilio INT NOT NULL, 
 CONSTRAINT domicilio_fk
 FOREIGN KEY (id_domicilio) REFERENCES domicilio(id_domicilio)
); 

CREATE TABLE Usuario (
id_usuario INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(30) NOT NULL,
apellido1 VARCHAR(30) NOT NULL,
apellido2 VARCHAR (30),
fechaNacimiento DATE NOT NULL,  
email VARCHAR(40) NOT NULL,
dni INT(8) UNSIGNED NOT NULL,
tipoUsuario enum('Cliente', 'Cliente regular','Administrador') NOT NULL DEFAULT 'Cliente', 
id_domicilio INT NOT NULL,
FOREIGN KEY (id_domicilio) REFERENCES domicilio (id_domicilio)
);

CREATE TABLE Registrarse(
id_registrarse INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
nombre VARCHAR (30) NOT NULL,
apellido VARCHAR (30) NOT NULL, 
fecha_Nacimiento DATE NOT NULL,  
nombreUsuario VARCHAR(30) NOT NULL, 
contrasenia VARCHAR(10) NOT NULL,
email VARCHAR (40) NOT NULL,  
id_usuario INT NOT NULL,
FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario) 
); 

CREATE TABLE IngresarCuenta(
id_ingresarCuenta INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
nombreUsuario VARCHAR (30) NOT NULL, 
contrasenia VARCHAR (10) NOT NULL, 
email VARCHAR (40) NOT NULL, 
id_usuario INT NOT NULL,
id_registrarse INT NOT NULL, 
FOREIGN KEY (id_usuario) REFERENCES Usuario (id_usuario), 
FOREIGN KEY (id_registrarse) REFERENCES Registrarse (id_registrarse)
);

CREATE TABLE TarjetaCredito(
	numero BIGINT UNSIGNED NOT NULL PRIMARY KEY,
    banco VARCHAR(20),
    titular VARCHAR(60),
    fecha_caducidad DATE,
    id_usuario INT NOT NULL,
    CONSTRAINT usuario_tc_fk
    FOREIGN KEY TarjetaCredito(id_usuario)
    REFERENCES Usuario(id_usuario)
);

CREATE TABLE Descuento(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    porcentaje FLOAT
);

CREATE TABLE Producto(
	id_producto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    marca VARCHAR(20),
    tipo VARCHAR(20),
    fecha_venc DATE,
    precio FLOAT NOT NULL,
    stock INT,
    id_descuento INT NOT NULL,
    CONSTRAINT descuento_fk
    FOREIGN KEY Tipo (id_descuento) REFERENCES Descuento(id)
);

CREATE TABLE Compra(
	id_compra INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_producto INT NOT NULL,
    costoFinal DOUBLE NOT NULL, 
    cantidad INT UNSIGNED NOT NULL,
    CONSTRAINT producto_fk
    FOREIGN KEY Producto(id_producto) REFERENCES Producto(id_producto)
);

CREATE TABLE Comprobante(
	id_comprobante INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_factura INT NOT NULL, 
    tipo VARCHAR(1),
    fecha TIMESTAMP,
    id_usuario INT NOT NULL,
    id_tc BIGINT UNSIGNED NOT NULL,
    CONSTRAINT usuario_comprobante_fk
    FOREIGN KEY Comprobante(id_usuario)
    REFERENCES Usuario(id_usuario),
    CONSTRAINT tc_comprobante_fk
    FOREIGN KEY Comprobante(id_tc)
    REFERENCES TarjetaCredito(numero)
);

CREATE TABLE Factura(
	id_factura INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_comprobante INT NOT NULL,
    id_producto INT NOT NULL,
    cantidad INT UNSIGNED NOT NULL,
    FOREIGN KEY (id_comprobante) REFERENCES Comprobante(id_comprobante),
    FOREIGN KEY (id_producto) REFERENCES Producto(id_producto)
);
