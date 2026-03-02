-- INSERTS para empresa
INSERT INTO empresa (nombre, direccion) VALUES
('Tech Solutions S.A.', 'Calle Innovación 123, Ciudad Tech'),
('Laboratorios Alfa', 'Avenida Central 456, Ciudad Alfa'),
('Consultoría Beta', 'Paseo Empresarial 789, Ciudad Beta'),
('Industria Gamma', 'Calle Industrial 12, Zona Gamma'),
('Servicios Delta', 'Boulevard Delta 34, Ciudad Delta');

-- INSERTS para contacto
INSERT INTO contacto (id_empresa, nombre, p_apellido, s_apellido, email, telefono) VALUES
(1, 'Laura', 'Martínez', 'Gómez', 'laura.martinez@techsolutions.com', '+34123456789'),
(1, 'Carlos', 'Pérez', 'López', 'carlos.perez@techsolutions.com', '+34123456788'),
(2, 'Ana', 'Rodríguez', 'Sánchez', 'ana.rodriguez@laboratoriosalfa.com', '+34123456787'),
(2, 'Javier', 'García', 'Fernández', 'javier.garcia@laboratoriosalfa.com', '+34123456786'),
(3, 'María', 'Hernández', 'López', 'maria.hernandez@consultoriabeta.com', '+34123456785'),
(4, 'Pedro', 'Jiménez', 'Ruiz', 'pedro.jimenez@industriagamma.com', '+34123456784'),
(5, 'Lucía', 'Vargas', 'Morales', 'lucia.vargas@serviciosdelta.com', '+34123456783');

-- INSERTS para pagos
INSERT INTO pago (nombre) VALUES
('Transferencia bancaria del 50% previa a la entrega de resultados, y el 50% restante tras la entrega de resultados'),
('Transferencia bancaria tras la entrega de resultados.'),
('Transferencia bancaria previa a la entrega de resultados.');

-- INSERTS para area
INSERT INTO area (nombre) VALUES
('Materiales'),
('Cementos, hormigón y morteros');

--INSERTS para departamento
INSERT INTO departamento (id_area, nombre) VALUES
(1, 'Arcilla cocida'),
(1, 'Áridos'),
(1, 'Prefabricados de hormigón'),
(1, 'Yesos'),
(2, 'Físicos y mecánicos'),
(2, 'Químicos');


--INSERTS para usuarios
INSERT INTO usuario (nombre, p_apellido, s_apellido, nombre_usuario, password) VALUES
('Carlos', 'Martínez', 'Ruiz', 'cmartinez', '12345A'),
('Laura', 'Fernández', 'Gómez', 'lfernandez', '54321A'),
('Miguel', 'Sánchez', 'Pérez', 'msanchez', '12345B'),
('Ana', 'López', 'Moreno', 'alopez', '54321B'),
('Javier', 'García', 'Navarro', 'jgarcia', '6789A'),
('Elena', 'Romero', 'Torres', 'eromero', '6789B'),
('Pablo', 'Hernández', 'Vega', 'phernandez', '9876A'),
('María', 'Díaz', 'Cano', 'mdiaz', '9876B'),
('Sergio', 'Ortega', 'Molina', 'sortega', '12345C');


--INSERTS para material
INSERT INTO material (id_departamento, nombre) VALUES
-- Arcilla cocida
(1, 'Ladrillo cerámico'),
(1, 'Teja cerámica'),

-- Áridos
(2, 'Arena natural'),
(2, 'Grava'),

-- Prefabricados de hormigón
(3, 'Bloque de hormigón'),
(3, 'Adoquín prefabricado'),

-- Yesos
(4, 'Yeso de construcción'),
(4, 'Yeso proyectado'),

-- Físicos y mecánicos
(5, 'Mortero'),
(5, 'Hormigón'),

-- Químicos
(6, 'Cemento Portland'),
(6, 'Aditivo plastificante');


--INSERTS para ensayos
INSERT INTO ensayo (nombre) VALUES
('Resistencia a compresión'),
('Absorción de agua'),
('Densidad aparente'),
('Resistencia a flexión'),
('Tiempo de fraguado'),
('Contenido en sulfatos');


--INSERTS para normas
INSERT INTO norma (nombre) VALUES
('UNE-EN 771'),
('UNE-EN 12390'),
('UNE-EN 1015'),
('UNE-EN 196'),
('UNE-EN 933'),
('UNE-EN 934');


--INSERTS para tarifas
INSERT INTO tarifa (nombre, precio, acreditado, id_material, id_ensayo, id_norma) VALUES
('Tarifa AW', 120.00, TRUE, 1, 1, 1),
('Tarifa Nuevo', 150.00, TRUE, 1, 1, 1),

('Tarifa AW', 95.00, TRUE, 1, 2, 6),

('Tarifa Nuevo', 150.00, TRUE, 5, 1, 2),
('Tarifa Nuevo', 130.00, FALSE, 5, 4, 2),

('Tarifa Normal', 80.00, FALSE, 3, 3, 5),
('Tarifa CE', 110.00, TRUE, 3, 6, 5),

('Tarifa AW', 130.00, TRUE, 11, 5, 4),
('Tarifa Normal', 125.00, TRUE, 9, 1, 3);