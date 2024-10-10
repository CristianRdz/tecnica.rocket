CREATE
DATABASE IF NOT EXISTS `prueba`;
USE `prueba`;

CREATE TABLE IF NOT EXISTS `Tarea`
(
    `id`
    BIGINT
    NOT
    NULL
    AUTO_INCREMENT,
    `nombre`
    VARCHAR
(
    255
) NOT NULL,
    `descripcion` TEXT,
    `fechaInicio` DATE,
    PRIMARY KEY
(
    `id`
)
    ) ENGINE=InnoDB;