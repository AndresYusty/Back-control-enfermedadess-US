-- liquibase formatted sql

-- changeset andres:1
-- comment: Tabla donde guardaremos los tipos de identificacion
CREATE TABLE tipo_identificacion(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    descripcion VARCHAR(255) NOT NULL
);

-- changeset andres:2
-- comment: Tabla donde guardaremos los tipos de sangre
CREATE TABLE tipo_sangre(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    descripcion VARCHAR(255) NOT NULL
);

-- changeset andres:3
-- comment: Tabla para guardar los datos basicos de un estudiante
CREATE TABLE estudiante (
	id INT PRIMARY KEY AUTO_INCREMENT,
    numero_identificacion VARCHAR(30) NOT NULL UNIQUE,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    id_tipo_identificacion INT NOT NULL,
		FOREIGN KEY(id_tipo_identificacion) REFERENCES tipo_identificacion(id),
    id_tipo_sangre INT NOT NULL,
		FOREIGN KEY(id_tipo_sangre) REFERENCES tipo_sangre(id)
);

-- changeset andres:4
-- comment: Tabla para registrar las enfermades que tiene el estudiante  
CREATE TABLE enfermedad_estudiante(
	id INT PRIMARY KEY AUTO_INCREMENT,
	id_estudiante INT NOT NULL,
		FOREIGN KEY(id_estudiante) REFERENCES estudiante(id),
    nombre VARCHAR(50) NOT NULL,
    observacion VARCHAR(255) NOT NULL
);

-- changeset andres: 5
-- comment: Registros para los tipos de identificacion 
INSERT INTO tipo_identificacion (nombre,descripcion) VALUES
("Registro Civil","Descripcion del registro civil tatata"),
("Tarjeta de identidad","Descripcion tarjeta de identidadddd"),
("Cédula de ciudadanía","Descripcion cedula zzzz"),
("Cédula de extranjería","Descripcion extranjeriaaa"),
("Pasaporte","Descripcion del pasaporteee");

-- changeset andres:6
-- comment: Registro para el tipo de sangre
INSERT INTO tipo_sangre (nombre,descripcion) VALUES
("A+","A positivo"),
("A-","A negativo"),
("O+","O positivo"),
("O-","O negativo");

-- changeset andres:7
-- comment: Tabla usuarios
CREATE TABLE usuario(
	id INT PRIMARY KEY AUTO_INCREMENT,
    username  VARCHAR(50) NOT NULL unique,
    clave VARCHAR(60) NOT NULL,
    activo boolean NOT NULL,
    rol varchar(20) NOT NULL
);

-- changeset andres:8
-- comment: Insert into a usuario
INSERT  INTO usuario (username,clave,activo,rol) VALUES 
("u20211197218", "$2a$10$wMnQksKFxUfS/d.9KYUWReBL.9hKBksyEAP8J0udFmqnljv0cwN/y", true, "Administrador" );


