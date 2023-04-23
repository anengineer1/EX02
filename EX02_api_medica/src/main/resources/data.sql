DROP TABLE IF EXISTS citas;
DROP TABLE IF EXISTS clientes;
DROP TABLE IF EXISTS dentistas;

CREATE TABLE clientes (
dni VARCHAR(8) NOT NULL,
nomapels NVARCHAR(255) DEFAULT NULL,
email NVARCHAR(100) DEFAULT NULL,
PRIMARY KEY (dni)
);

CREATE TABLE dentistas (
dni VARCHAR(8) NOT NULL,
nomapels NVARCHAR(255) DEFAULT NULL,
email NVARCHAR(100) DEFAULT NULL,
PRIMARY KEY (dni)
);

CREATE TABLE citas (
id int NOT NULL AUTO_INCREMENT,
descripcion NVARCHAR(255) DEFAULT NULL,
fecha DATETIME DEFAULT NULL,
idcliente VARCHAR(8) NOT NULL,
iddentista VARCHAR(8) NOT NULL,
PRIMARY KEY (id),
CONSTRAINT cliente_fk FOREIGN KEY (idcliente) REFERENCES clientes (dni),
CONSTRAINT dentista_fk FOREIGN KEY (iddentista) REFERENCES dentistas (dni)
);

LOCK TABLES clientes WRITE;
INSERT INTO clientes (dni, nomapels, email) VALUES ('23458697', 'Francisco Herrera', 'fherrera@gmail.com');
INSERT INTO clientes (dni, nomapels, email) VALUES ('29384750', 'Fernando Cortes', 'fcortes@gmail.com');
INSERT INTO clientes (dni, nomapels, email) VALUES ('23458690', 'Carlos Montes', 'cmontes@gmail.com');
UNLOCK TABLES;

LOCK TABLES dentistas WRITE;
INSERT INTO dentistas (dni, nomapels, email) VALUES ('67458697', 'Hermenegildo Altelarrea', 'haltelarrea@dental.com');
INSERT INTO dentistas (dni, nomapels, email) VALUES ('99458697', 'Armando Guerra', 'aguerra@dental.com');
INSERT INTO dentistas (dni, nomapels, email) VALUES ('77758697', 'Carbon el Borracho', 'cborrachodental.com');
UNLOCK TABLES;

LOCK TABLES citas WRITE;
INSERT INTO citas (fecha, descripcion, idcliente, iddentista) VALUES ('2023-04-20 12:30:00', 'Dolor de muela', '23458697', '67458697');
INSERT INTO citas (fecha, descripcion, idcliente, iddentista) VALUES ('2023-04-20 11:30:00', 'Hiperdentia', '29384750', '99458697');
INSERT INTO citas (fecha, descripcion, idcliente, iddentista) VALUES ('2023-04-20 10:30:00', 'Revisión', '23458690', '77758697');
UNLOCK TABLES;
