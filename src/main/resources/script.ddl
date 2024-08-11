CREATE TABLE articulo (
    id VARCHAR(10) NOT NULL,
    nombre VARCHAR(20) NOT NULL,
    descripcion VARCHAR(200),
    precio DECIMAL(10, 2) NOT NULL,
    modelo VARCHAR(10),
    PRIMARY KEY (id)
);
