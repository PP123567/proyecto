CREATE DATABASE LABORATORIOS_DE_COMPUTO;
GO

USE LABORATORIOS_DE_COMPUTO;
GO

CREATE TABLE Salones(
Id varchar(10) PRIMARY KEY,
Estado varchar(15),
);

CREATE TABLE Materias(
Nombre varchar(80) PRIMARY KEY,
Color varchar(10)
);

CREATE TABLE Usuarios(
Id varchar(15) PRIMARY KEY,
TipoUsuario varchar(15),
Nombre varchar(50),
Contrase�a varchar(20),
Estado varchar(15)
);

CREATE TABLE Administradores(
Id varchar(15) PRIMARY KEY,
Nombre varchar(50),
Contrase�a varchar(20),
Estado varchar(15)
);

CREATE TABLE Software(
Id int PRIMARY KEY,
Nombre varchar(50),
VersionX varchar(10)
);

GO

CREATE TABLE Horarios(
Id varchar(20) PRIMARY KEY,
Salon varchar(10) FOREIGN KEY REFERENCES Salones(Id),
Profesor varchar(15) FOREIGN KEY REFERENCES Usuarios(Id),
Materia varchar(80) FOREIGN KEY REFERENCES Materias(Nombre),
HoraInicio varchar(10),
HoraFin varchar(10),
Periodo varchar(30),
A�o int,
Estado varchar(15)
);

CREATE TABLE Rondines(
Id int IDENTITY(1, 1) PRIMARY KEY,
Fecha datetime DEFAULT GETDATE(),
Administrador varchar(15) FOREIGN KEY REFERENCES Administradores(Id),
Salon varchar(10) FOREIGN KEY REFERENCES Salones(Id),
Comentario varchar(350)
);

CREATE TABLE Mensajes(
Id int IDENTITY(1, 1) PRIMARY KEY,
Administrador varchar(15) FOREIGN KEY REFERENCES Administradores(Id),
Asunto varchar(50),
Cuerpo varchar(200),
TipoDeUsuarioAlQueSeDirige varchar(15),
Estado varchar(15)
);

CREATE TABLE Equipos(
Id varchar(8) PRIMARY KEY,
Salon varchar(10) FOREIGN KEY REFERENCES Salones(Id),
Estado varchar(15),
Teclado varchar(40),
Mouse varchar(40),
Monitor varchar(40),
Procesador varchar(40),
Almacenamiento varchar(40),
);

GO

/* Bajo este modelo el administrador no puede reportar observaciones, para hacerlo debemos incluir al admin dentro de la tabla de usuarios y no como una entidad (table) distinta */
CREATE TABLE Observaciones(
Id int IDENTITY(1, 1) PRIMARY KEY,
Fecha datetime DEFAULT GETDATE(),
Usuario varchar(15) FOREIGN KEY REFERENCES Usuarios(Id),
Equipo varchar(8) FOREIGN KEY REFERENCES Equipos(Id),
Comentario varchar(200),
Estado varchar(15)
);

CREATE TABLE SoftwarePorEquipo(
Equipo varchar(8) FOREIGN KEY REFERENCES Equipos(Id),
Software int FOREIGN KEY REFERENCES Software(Id)
);