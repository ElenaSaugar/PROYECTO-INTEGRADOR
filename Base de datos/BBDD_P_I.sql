-- borramos todas las tablas al inicio
DROP TABLE IF EXISTS Alumnos;
DROP TABLE IF EXISTS Proyecto_Integrador;
DROP TABLE IF EXISTS Area;
DROP TABLE IF EXISTS Profesores;

CREATE TABLE Area (
  CodAr VARCHAR(10) PRIMARY KEY,
  Descripcion VARCHAR(100)
);

CREATE TABLE Proyecto_Integrador (
  CodProy INT auto_increment primary KEY ,
  nombreProy VARCHAR(50) not null,
  notaFinal DECIMAL(4,2) not null,
  URL VARCHAR(100) not null,
  año INT not null,
  curso VARCHAR(10) not null,
  Area_CodAr VARCHAR(10) not null,
  FOREIGN KEY (Area_CodAr) REFERENCES Area(CodAr)
);

CREATE TABLE Alumnos (
  codAlum INT PRIMARY KEY,
  numExpediente VARCHAR(20),
  nombreApellidos VARCHAR(100),
  Proyecto_Integrador_CodProy INT,
  FOREIGN KEY (Proyecto_Integrador_CodProy) REFERENCES Proyecto_Integrador(CodProy)
);

CREATE TABLE Profesores (
  codProf VARCHAR(20) PRIMARY KEY,
  contraseña VARCHAR(20)
);

-- INSERTAMOS DATOS A LAS TABLAS

INSERT INTO Area (CodAr, Descripcion) VALUES
('DAM', 'Desarrollo de Aplicaciones Multiplataforma'),
('DAW', 'Desarrollo de Aplicaciones Web'),
('ASIR', 'Administración de Sistemas Informáticos en Red');

INSERT INTO Proyecto_Integrador ( nombreProy, notaFinal, URL, año, curso, Area_CodAr) VALUES
('CodeBots',  8.5, 'http://ejemplo.com', 2023, 1, 'DAM'),
('SmartLens', 9.2, 'http://ejemplo.com', 2023, 1, 'DAW'),
('DataSift' , 7.8, 'http://ejemplo.com', 2023, 1, 'ASIR'),
('WebBoost', 8.9, 'http://ejemplo.com', 2023, 1, 'DAM'),
('TechTonic', 7.5, 'http://ejemplo.com', 2023, 1, 'DAW'),
('NetGuru' , 9.0, 'http://ejemplo.com', 2023, 1, 'ASIR'),
('PixelForge' , 6.8, 'http://ejemplo.com', 2023, 1, 'DAM'),
('CyberCore' , 8.1, 'http://ejemplo.com', 2023, 1, 'DAW'),
('InnoVent', 8.7, 'http://ejemplo.com', 2023, 1, 'ASIR'),
('LabInfo',7.8,'http://ejemplo.com', 2023, 1, 'DAW' );


INSERT INTO Alumnos (codAlum,numExpediente, nombreApellidos, Proyecto_Integrador_CodProy)
VALUES
(1,'001', 'James Andrew', 9),
(2,'002', 'Ismael BODAS', 2),
(3,'003', 'Jorge BURGOS', 2),
(4,'004', 'Ali CHALAK', 3),
(5,'005', 'JAVIER CHICANO', 2),
(6,'006', 'AMELIA MARIA COCA', 1),
(7,'007', 'Juan CORTÉS ', 1),
(8,'008', 'Santiago Andres DAZA', 4),
(9,'009', 'Amir Mahdi ', 3),
(10,'010', 'Aarón Juan ESCUDERO ', 10),
(11,'011', 'Daniel GARRIDO ', 5),
(12,'012', 'Daniel HERRERO ', 10),
(13,'013', 'Alejandro JUNYENT ', 5),
(14,'014', 'Aris Maximilian', 4),
(15,'015', 'Lucca MANFREDOTTI', 3),
(16,'016', 'Ismael MORENO', 10),
(17,'017', 'Juan Diego MOTTA', 9),
(18,'018', 'Paula MOURE', 5),
(19,'019', 'Pablo NARANJO', 6),
(20,'020', 'DAVID ONATE', 4),
(21,'021', 'Mario ROBLES', 9),
(22,'022', 'Gabriel Enrique RODRÍGUEZ', 6),
(23,'023', 'David ROJO ', 1),
(24,'024', 'Celia RUBIO ', 6),
(25,'025', 'Miguel SANZ', 7),
(26,'026', 'Elena SAUGAR', 7),
(27,'027', 'ALVARO SERRANO', 7),
(28,'028', 'Josep SERRANO', 8),
(29,'029', 'Wei XU', 8),
(30,'030', 'Guoanqi YIN', 8);

INSERT INTO Profesores (CodProf, contraseña) VALUES
('profesor','profesor');