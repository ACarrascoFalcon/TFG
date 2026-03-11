CREATE TABLE empresa (
    id_empresa SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    direccion VARCHAR(200)
);

CREATE TABLE contacto (
    id_contacto SERIAL PRIMARY KEY,
    id_empresa INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    p_apellido VARCHAR(100),
    s_apellido VARCHAR(100),
    email VARCHAR(150) UNIQUE,
    telefono VARCHAR(30),
    CONSTRAINT fk_contacto_empresa
        FOREIGN KEY (id_empresa)
        REFERENCES empresa(id_empresa)
        ON DELETE CASCADE
);

CREATE TABLE pago (
    id_pago SERIAL PRIMARY KEY,
    nombre VARCHAR(200) NOT NULL
);

CREATE TABLE area (
    id_area SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE departamento (
    id_departamento SERIAL PRIMARY KEY,
    id_area INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    CONSTRAINT fk_departamento_area
        FOREIGN KEY (id_area)
        REFERENCES area(id_area)
        ON DELETE CASCADE
);

CREATE TABLE usuario (
    id_usuario SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    p_apellido VARCHAR(100),
    s_apellido VARCHAR(100),
    nombre_usuario VARCHAR(150) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE material (
    id_material SERIAL PRIMARY KEY,
    id_departamento INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    CONSTRAINT fk_material_departamento
        FOREIGN KEY (id_departamento)
        REFERENCES departamento(id_departamento)
        ON DELETE CASCADE
);

CREATE TABLE ensayo (
    id_ensayo SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE norma (
    id_norma SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE tarifa (
    id_tarifa SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio NUMERIC(10,2) NOT NULL,
    acreditado BOOLEAN DEFAULT FALSE,
    id_material INT NOT NULL,
    id_ensayo INT NOT NULL,
    id_norma INT NOT NULL,
    CONSTRAINT fk_tarifa_material FOREIGN KEY (id_material) REFERENCES material(id_material),
    CONSTRAINT fk_tarifa_ensayo FOREIGN KEY (id_ensayo) REFERENCES ensayo(id_ensayo),
    CONSTRAINT fk_tarifa_norma FOREIGN KEY (id_norma) REFERENCES norma(id_norma)
);

CREATE TABLE presupuesto (
    id_presupuesto SERIAL PRIMARY KEY,
    id_relativo INT,
    id_contacto INT NOT NULL,
    id_pago INT NOT NULL,
    id_usuario INT NOT NULL,
    fecha_peticion DATE NOT NULL,
    fecha_envio DATE,
    observacion TEXT,
    aceptado BOOLEAN DEFAULT FALSE,
    habitual BOOLEAN DEFAULT FALSE,
    CONSTRAINT fk_presupuesto_contacto FOREIGN KEY (id_contacto) REFERENCES contacto(id_contacto),
    CONSTRAINT fk_presupuesto_pago FOREIGN KEY (id_pago) REFERENCES pago(id_pago),
    CONSTRAINT fk_presupuesto_usuario FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    CONSTRAINT fk_presupuesto_relativo FOREIGN KEY (id_relativo) REFERENCES presupuesto(id_presupuesto)
);

CREATE TABLE presupuesto_ensayo (
    id_pe SERIAL PRIMARY KEY,
    id_tarifa INT NOT NULL,
    id_presupuesto INT NOT NULL,
    descuento NUMERIC(5,2) DEFAULT 0,
    CONSTRAINT fk_pe_tarifa FOREIGN KEY (id_tarifa) REFERENCES tarifa(id_tarifa),
    CONSTRAINT fk_pe_presupuesto FOREIGN KEY (id_presupuesto) REFERENCES presupuesto(id_presupuesto) ON DELETE CASCADE
);
