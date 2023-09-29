CREATE TABLE
    `bd_libreria_viernes`.`libros` (
        `isbn` VARCHAR(100) NOT NULL,
        `titulo` VARCHAR(45) NOT NULL,
        `tematica` VARCHAR(45) NULL,
        PRIMARY KEY (`isbn`)
    );