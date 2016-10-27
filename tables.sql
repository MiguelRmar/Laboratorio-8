-- -----------------------------------------------------
-- Table `USUARIOS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `USUARIOS` (
  `email` VARCHAR(40) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`email`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ENTRADAS_FOROS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ENTRADAS_FOROS` (
  `id` INT NULL AUTO_INCREMENT,
  `fecha_hora` TIMESTAMP NOT NULL,
  `contenido` TEXT NOT NULL,
  `USUARIOS_email` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_ENTRADAS_FOROS_USUARIOS1_idx` (`USUARIOS_email` ASC),
  CONSTRAINT `fk_ENTRADAS_FOROS_USUARIOS1`
    FOREIGN KEY (`USUARIOS_email`)
    REFERENCES `USUARIOS` (`email`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `COMENTARIOS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `COMENTARIOS` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `fecha_hora` TIMESTAMP NOT NULL,
  `contenido` TEXT NOT NULL,
  `ENTRADAS_FOROS_id` INT NOT NULL,
  `USUARIOS_email` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_COMENTARIOS_ENTRADAS_FOROS_idx` (`ENTRADAS_FOROS_id` ASC),
  INDEX `fk_COMENTARIOS_USUARIOS1_idx` (`USUARIOS_email` ASC),
  CONSTRAINT `fk_COMENTARIOS_ENTRADAS_FOROS`
    FOREIGN KEY (`ENTRADAS_FOROS_id`)
    REFERENCES `ENTRADAS_FOROS` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_COMENTARIOS_USUARIOS1`
    FOREIGN KEY (`USUARIOS_email`)
    REFERENCES `USUARIOS` (`email`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
