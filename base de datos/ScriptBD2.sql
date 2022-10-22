CREATE DATABASE LABORATORIOS_DE_COMPUTO;

USE LABORATORIOS_DE_COMPUTO;

CREATE TABLE Salones(
Id varchar(10) PRIMARY KEY,
Estado varchar(15)
);

CREATE TABLE Materias(
Nombre varchar(80) PRIMARY KEY,
Color varchar(10)
);

CREATE TABLE Usuarios(
Id int(10) PRIMARY KEY,
TipoUsuario varchar(15),
Nombre varchar(50),
Contraseña varchar(20),
Estado varchar(15)
);

CREATE TABLE Software(
Id int PRIMARY KEY,
Nombre varchar(50),
VersionX varchar(10)
);

CREATE TABLE Horarios(
Id varchar(20) PRIMARY KEY,
Salon varchar(10),
Profesor int(11),
Materia varchar(80),
HoraInicio varchar(10),
HoraFin varchar(10),
Periodo varchar(30),
Año int,
Estado varchar(15),
FOREIGN KEY  (Salon) REFERENCES Salones(Id),
FOREIGN KEY  (Profesor) REFERENCES Usuarios(Id),
FOREIGN KEY  (Materia) REFERENCES Materias(Nombre)
);

CREATE TABLE Rondines(
Id int  PRIMARY KEY AUTO_INCREMENT,
Fecha datetime default CURRENT_TIMESTAMP,
Administrador varchar(50),
Salon varchar(10),
Comentario varchar(350),
FOREIGN KEY  (Salon) REFERENCES Salones(Id)
);

CREATE TABLE Mensajes(
Id int PRIMARY KEY AUTO_INCREMENT,
Administrador int(11),
Asunto varchar(50),
Cuerpo varchar(200),
TipoDeUsuarioAlQueSeDirige varchar(15),
Estado varchar(15),
FOREIGN KEY  (Administrador) REFERENCES Usuarios(Id)
);

CREATE TABLE Equipos(
Id varchar(8) PRIMARY KEY,
Salon varchar(10),
Estado varchar(15),
Teclado varchar(40),
Mouse varchar(40),
Monitor varchar(40),
Procesador varchar(40),
Almacenamiento varchar(40),
FOREIGN KEY  (Salon) REFERENCES Salones(Id)
);

CREATE TABLE Observaciones(
Id int PRIMARY KEY AUTO_INCREMENT,
Fecha datetime ,
Usuario int(11),
Equipo varchar(8),
Comentario varchar(200),
Estado varchar(15),
FOREIGN KEY  (Usuario) REFERENCES Usuarios(Id),
FOREIGN KEY  (Equipo) REFERENCES Equipos(Id)
);

/*CREATE TABLE SoftwarePorEquipo(
Equipo varchar(8) FOREIGN KEY REFERENCES Equipos(Id),
Software int FOREIGN KEY REFERENCES Software(Id)
);*/

/*De aqui en adelante insertamos los datos*/

INSERT INTO Salones (Id,Estado) 
values 
('LAS','Activo'),
('LDM','Activo'),
('LDS','Activo'),
('LPG','Activo'),
('LSO','Activo')
;

INSERT INTO Materias (Nombre, Color) values ('Progamacion', 'Negro');

INSERT INTO Usuarios (Id, TipoUsuario, Nombre, Contraseña, Estado) 
values
 ('2030178', 'Administrador', 'MICHEL', '12345', 'Activo'),
 ('2034230', 'Docente', 'adrian', '12345', 'Activo'),
 ('2034107', 'Estudiante', 'The Motherfucker', '12345', 'Activo')
 ;

INSERT INTO Software (Id, Nombre, VersionX) values ('374743', 'Mr Robot', 'Windows 10');

INSERT INTO Horarios (Id, Salon, Profesor, Materia, HorarioInicio, HoraFin, Periodo, Año, Estado) values ('Krillin', 'LAS', 'Charles', 'Metaverso', '07:00', '08:00', 'Enero - Abril', '2022', 'Activo');

INSERT INTO Rondines (Id, Administrador, Salon, Comentario) values ('3747448', '2030178', 'LAS', 'Los dispositivos se encuentran funcionando');

INSERT INTO Mensajes (Id, Administrador, Asunto, Cuerpo, TipoDeUsuarioAlQueSeDirige, Estado) 
values
 ('374744', '2030178', 'Maquina', 'La maquina no funciona', 'Administrador', 'Inactivo'),
 ('374745', '2030178', 'Maquina', 'La maquina no funciona', 'Docente', 'Inactivo'),
 ('374746', '2030178', 'Maquina', 'La maquina no funciona', 'Estudiante', 'Inactivo')
 ;

INSERT INTO Equipos (Id, Salon, Estado, Teclado, Mouse, Monitor, Procesador, Almacenamiento) 
values 
('LAS-PC1', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC2', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC3', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC4', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC5', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro')
;
INSERT INTO Equipos (Id, Salon, Estado, Teclado, Mouse, Monitor, Procesador, Almacenamiento) 
values 
('LDM-PC1', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC2', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC3', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC4', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC5', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro')
;
INSERT INTO Equipos (Id, Salon, Estado, Teclado, Mouse, Monitor, Procesador, Almacenamiento) 
values 
('LDS-PC1', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC2', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC3', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC4', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC5', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro')
;

INSERT INTO Observaciones (Id, Fecha, Usuario, Equipo, Comentario, Estado) values ('374743', '2020-01-01 15:10:10', '2030178', 'LAS-PC1', 'Equipo funcional', 'Activo');

INSERT INTO Mensajes (Id, Administrador, Asunto, Cuerpo, TipoDeUsuarioAlQueSeDirige, Estado) 
values
 ('374745', '2030178', 'Maquina', 'La maquina no funciona', 'Docente', 'Inactivo')
 ;

SELECT *FROM Rondines;

SELECT Nombre FROM Usuarios WHERE TipoUsuario='Estudiante'