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
INSERT INTO pagos (nombre) VALUES
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
(2, 'Físicos y mecánicos')

