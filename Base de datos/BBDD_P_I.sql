-- borramos todas las tablas al inicio
DROP TABLE IF EXISTS Alumnos;
DROP TABLE IF EXISTS Proyecto_Integrador;
DROP TABLE IF EXISTS Area;
DROP TABLE IF EXISTS Profesores;

CREATE TABLE Area (
  CodAr INT PRIMARY KEY,
  Nombre VARCHAR(50),
  Descripcion VARCHAR(100)
);

CREATE TABLE Proyecto_Integrador (
  CodProy INT PRIMARY KEY,
  nombreProy VARCHAR(50),
  asignatura VARCHAR(50),
  componentes VARCHAR(150),
  grupo VARCHAR(10),
  notaFinal DECIMAL(4,2),
  URL VARCHAR(100),
  año INT,
  curso VARCHAR(10),
  Area_CodAr INT,
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

INSERT INTO Area (CodAr, Nombre, Descripcion) VALUES
(1, 'DAM', 'Desarrollo de Aplicaciones Multiplataforma'),
(2, 'DAW', 'Desarrollo de Aplicaciones Web'),
(3, 'ASIR', 'Administración de Sistemas Informáticos en Red');

INSERT INTO Proyecto_Integrador (CodProy, nombreProy, asignatura, componentes, grupo, notaFinal, URL, año, curso, Area_CodAr) VALUES
(1,'CodeBots', 'Base de Datos', 'Juan Cortés Cortés, Amelia María Coca López, David Rojo Villalba', 'DAM', 8.5, 'http://ejemplo.com', 2023, 1, 1),
(2,'SmartLens', 'Programación', 'Ismael Bodas Díaz, Jorge Burgos Barrera, Javier Chicano Miguel', 'DAW', 9.2, 'http://ejemplo.com', 2023, 1, 2),
(3,'DataSift' ,'Entornos de Desarrollo', 'Ali Chalak, Amir Mahdi Dorrani, Lucca Manfredotti García', 'ASIR', 7.8, 'http://ejemplo.com', 2023, 1, 3),
(4, 'WebBoost','Base de Datos', 'Santiago Andres Daza Villamizar, Aris Maximilian Kuhs, David Onate Sanchez', 'DAM', 8.9, 'http://ejemplo.com', 2023, 1, 1),
(5,'TechTonic', 'Programación', 'Daniel Garrido Nuñez, Alejandro Junyent Romani, Paula Moure Prado', 'DAW', 7.5, 'http://ejemplo.com', 2023, 1, 2),
(6,'NetGuru' ,'Entornos de Desarrollo', 'Pablo Naranjo Cid, Gabriel Enrique Rodríguez Padrón, Celia Rubio Pais', 'ASIR', 9.0, 'http://ejemplo.com', 2023, 1, 3),
(7,'PixelForge' ,'Base de Datos', 'Miguel Sanz Villanueva, Elena Saugar Mayoral, Alvaro Serrano Colomer', 'DAM', 6.8, 'http://ejemplo.com', 2023, 1, 1),
(8,'CyberCore' ,'Programación', 'Josep Serrano Rayó, Wei Xu, Guoanqi Yin', 'DAW', 8.1, 'http://ejemplo.com', 2023, 1, 2),
(9, 'InnoVent','Entornos de Desarrollo', 'James Andrew Behan, Juan Diego Motta Moncada, Mario Robles Padua', 'ASIR', 8.7, 'http://ejemplo.com', 2023, 1, 3),
(10,'LabInfo','Programación','Aarón Juan ESCUDERO NAVAS, Daniel HERRERO MARTÍNEZ,Ismael MORENO MORAL', 'ASIR',7.8,'http://ejemplo.com', 2023, 1, 2 );


INSERT INTO Alumnos (codAlum,numExpediente, nombreApellidos, Proyecto_Integrador_CodProy)
VALUES
(1,'001', 'James Andrew BEHAN', 9),
(2,'002', 'Ismael BODAS DÍAZ', 2),
(3,'003', 'Jorge BURGOS BARRERA', 2),
(4,'004', 'Ali CHALAK', 3),
(5,'005', 'JAVIER CHICANO MIGUEL', 2),
(6,'006', 'AMELIA MARIA COCA LOPEZ', 1),
(7,'007', 'Juan CORTÉS CORTÉS', 1),
(8,'008', 'Santiago Andres DAZA VILLAMIZAR', 4),
(9,'009', 'Amir Mahdi DORRANI', 3),
(10,'010', 'Aarón Juan ESCUDERO NAVAS', 10),
(11,'011', 'Daniel GARRIDO NUÑEZ', 5),
(12,'012', 'Daniel HERRERO MARTÍNEZ', 10),
(13,'013', 'Alejandro JUNYENT ROMANI', 5),
(14,'014', 'Aris Maximilian KUHS', 4),
(15,'015', 'Lucca MANFREDOTTI GARCÍA', 3),
(16,'016', 'Ismael MORENO MORAL', 10),
(17,'017', 'Juan Diego MOTTA MONCADA', 9),
(18,'018', 'Paula MOURE PRADO', 5),
(19,'019', 'Pablo NARANJO CID', 6),
(20,'020', 'DAVID ONATE SANCHEZ', 4),
(21,'021', 'Mario ROBLES PADUA', 9),
(22,'022', 'Gabriel Enrique RODRÍGUEZ PADRÓN', 6),
(23,'023', 'David ROJO VILLALBA', 1),
(24,'024', 'Celia RUBIO PAIS', 6),
(25,'025', 'Miguel SANZ VILLANUEVA', 7),
(26,'026', 'Elena SAUGAR MAYORAL', 7),
(27,'027', 'ALVARO SERRANO COLOMER', 7),
(28,'028', 'Josep SERRANO RAYÓ', 8),
(29,'029', 'Wei XU', 8),
(30,'030', 'Guoanqi YIN', 8);

INSERT INTO Profesores (CodProf, contraseña) VALUES
('profesor','profesor');
