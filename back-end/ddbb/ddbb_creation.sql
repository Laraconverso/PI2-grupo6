-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema clubapp
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema clubapp
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `clubapp` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `clubapp` ;

-- -----------------------------------------------------
-- Table `clubapp`.`categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubapp`.`categories` (
  `id_category` BIGINT NOT NULL AUTO_INCREMENT,
  `category_name` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id_category`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clubapp`.`clubs`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubapp`.`clubs` (
  `id_club` BIGINT NOT NULL AUTO_INCREMENT,
  `club_description` VARCHAR(255) NOT NULL,
  `club_logo` VARCHAR(255) NOT NULL,
  `club_name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_club`),
  UNIQUE INDEX `UK_trex7d6t7rw9krju61y5oxmv5` (`club_name` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clubapp`.`roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubapp`.`roles` (
  `id_role` BIGINT NOT NULL AUTO_INCREMENT,
  `role_name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_role`),
  UNIQUE INDEX `UK_716hgxp60ym1lifrdgp67xt5k` (`role_name` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clubapp`.`coaches`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubapp`.`coaches` (
  `coach_number` BIGINT NOT NULL AUTO_INCREMENT,
  `user_address` VARCHAR(255) NOT NULL,
  `user_dni` VARCHAR(255) NOT NULL,
  `user_email` VARCHAR(255) NOT NULL,
  `user_lastname` VARCHAR(255) NOT NULL,
  `user_name` VARCHAR(255) NOT NULL,
  `user_password` VARCHAR(255) NOT NULL,
  `id_club` BIGINT NULL DEFAULT NULL,
  `id_role` BIGINT NULL DEFAULT NULL,
  PRIMARY KEY (`coach_number`),
  INDEX `FKdvl05y1ohyrghwjnnq6veyeb9` (`id_club` ASC) VISIBLE,
  INDEX `FK1kv5u34ey2rd0foaxe209oxdo` (`id_role` ASC) VISIBLE,
  CONSTRAINT `FK1kv5u34ey2rd0foaxe209oxdo`
    FOREIGN KEY (`id_role`)
    REFERENCES `clubapp`.`roles` (`id_role`),
  CONSTRAINT `FKdvl05y1ohyrghwjnnq6veyeb9`
    FOREIGN KEY (`id_club`)
    REFERENCES `clubapp`.`clubs` (`id_club`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clubapp`.`employees`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubapp`.`employees` (
  `employee_number` BIGINT NOT NULL AUTO_INCREMENT,
  `user_address` VARCHAR(255) NOT NULL,
  `user_dni` VARCHAR(255) NOT NULL,
  `user_email` VARCHAR(255) NOT NULL,
  `user_lastname` VARCHAR(255) NOT NULL,
  `user_name` VARCHAR(255) NOT NULL,
  `user_password` VARCHAR(255) NOT NULL,
  `id_club` BIGINT NULL DEFAULT NULL,
  `id_role` BIGINT NULL DEFAULT NULL,
  PRIMARY KEY (`employee_number`),
  INDEX `FKjy06m8chv0vvrbnkp4h2yv7jg` (`id_club` ASC) VISIBLE,
  INDEX `FK68aktnyjhs9ix3dqmou9xd8w4` (`id_role` ASC) VISIBLE,
  CONSTRAINT `FK68aktnyjhs9ix3dqmou9xd8w4`
    FOREIGN KEY (`id_role`)
    REFERENCES `clubapp`.`roles` (`id_role`),
  CONSTRAINT `FKjy06m8chv0vvrbnkp4h2yv7jg`
    FOREIGN KEY (`id_club`)
    REFERENCES `clubapp`.`clubs` (`id_club`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clubapp`.`fixtures`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubapp`.`fixtures` (
  `id_fixture` BIGINT NOT NULL AUTO_INCREMENT,
  `name_fixture` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id_fixture`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clubapp`.`team`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubapp`.`team` (
  `id_team` BIGINT NOT NULL AUTO_INCREMENT,
  `team_daytraining` VARCHAR(255) NOT NULL,
  `team_fee` VARCHAR(255) NOT NULL,
  `team_name` VARCHAR(255) NOT NULL,
  `team_schedule` VARCHAR(255) NOT NULL,
  `id_category` BIGINT NULL DEFAULT NULL,
  `coach_coach_number` BIGINT NULL DEFAULT NULL,
  PRIMARY KEY (`id_team`),
  INDEX `FKca7ka11ylumnj1xgg6knkxsgx` (`id_category` ASC) VISIBLE,
  INDEX `FK4wy61suxjtsv66j2efp0s0yj6` (`coach_coach_number` ASC) VISIBLE,
  CONSTRAINT `FK4wy61suxjtsv66j2efp0s0yj6`
    FOREIGN KEY (`coach_coach_number`)
    REFERENCES `clubapp`.`coaches` (`coach_number`),
  CONSTRAINT `FKca7ka11ylumnj1xgg6knkxsgx`
    FOREIGN KEY (`id_category`)
    REFERENCES `clubapp`.`categories` (`id_category`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clubapp`.`games`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubapp`.`games` (
  `id_game` BIGINT NOT NULL AUTO_INCREMENT,
  `game_day` VARCHAR(255) NOT NULL,
  `game_islocal` BIT(1) NOT NULL,
  `game_localgoals` INT NULL DEFAULT NULL,
  `game_rivalgoals` INT NULL DEFAULT NULL,
  `game_teamrival` VARCHAR(255) NOT NULL,
  `game_time` VARCHAR(255) NOT NULL,
  `id_category` BIGINT NULL DEFAULT NULL,
  `id_fixture` BIGINT NULL DEFAULT NULL,
  `id_team` BIGINT NULL DEFAULT NULL,
  PRIMARY KEY (`id_game`),
  INDEX `FKn46ysvsxphqhhjcubkmrmcmt9` (`id_category` ASC) VISIBLE,
  INDEX `FKch72d2xxm5jdit960k528w1hm` (`id_fixture` ASC) VISIBLE,
  INDEX `FKnjvrx7ft9lphgvok6k8udy7v` (`id_team` ASC) VISIBLE,
  CONSTRAINT `FKch72d2xxm5jdit960k528w1hm`
    FOREIGN KEY (`id_fixture`)
    REFERENCES `clubapp`.`fixtures` (`id_fixture`),
  CONSTRAINT `FKn46ysvsxphqhhjcubkmrmcmt9`
    FOREIGN KEY (`id_category`)
    REFERENCES `clubapp`.`categories` (`id_category`),
  CONSTRAINT `FKnjvrx7ft9lphgvok6k8udy7v`
    FOREIGN KEY (`id_team`)
    REFERENCES `clubapp`.`team` (`id_team`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clubapp`.`players`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubapp`.`players` (
  `id_player` BIGINT NOT NULL AUTO_INCREMENT,
  `user_address` VARCHAR(255) NOT NULL,
  `user_dni` VARCHAR(255) NOT NULL,
  `user_email` VARCHAR(255) NOT NULL,
  `user_lastname` VARCHAR(255) NOT NULL,
  `user_name` VARCHAR(255) NOT NULL,
  `user_password` VARCHAR(255) NOT NULL,
  `player_birthdate` VARCHAR(255) NOT NULL,
  `id_club` BIGINT NULL DEFAULT NULL,
  `id_role` BIGINT NULL DEFAULT NULL,
  `id_team` BIGINT NULL DEFAULT NULL,
  PRIMARY KEY (`id_player`),
  INDEX `FKpxkipa962ec5jgqqckv27lh6w` (`id_club` ASC) VISIBLE,
  INDEX `FKps13rryr94awm2bx2i1bbwvo3` (`id_role` ASC) VISIBLE,
  INDEX `FKe1r69e1p21eua43bej6nkr386` (`id_team` ASC) VISIBLE,
  CONSTRAINT `FKe1r69e1p21eua43bej6nkr386`
    FOREIGN KEY (`id_team`)
    REFERENCES `clubapp`.`team` (`id_team`),
  CONSTRAINT `FKps13rryr94awm2bx2i1bbwvo3`
    FOREIGN KEY (`id_role`)
    REFERENCES `clubapp`.`roles` (`id_role`),
  CONSTRAINT `FKpxkipa962ec5jgqqckv27lh6w`
    FOREIGN KEY (`id_club`)
    REFERENCES `clubapp`.`clubs` (`id_club`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clubapp`.`payments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubapp`.`payments` (
  `id_payment` BIGINT NOT NULL AUTO_INCREMENT,
  `amount` INT NULL DEFAULT NULL,
  `player_id_player` BIGINT NULL DEFAULT NULL,
  PRIMARY KEY (`id_payment`),
  INDEX `FK2mby1lyo9pt5t9hrsd77vdweb` (`player_id_player` ASC) VISIBLE,
  CONSTRAINT `FK2mby1lyo9pt5t9hrsd77vdweb`
    FOREIGN KEY (`player_id_player`)
    REFERENCES `clubapp`.`players` (`id_player`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clubapp`.`statistics`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubapp`.`statistics` (
  `id_statistic` BIGINT NOT NULL AUTO_INCREMENT,
  `goal_assisted` INT NOT NULL,
  `goal_scored` INT NOT NULL,
  `id_team` BIGINT NULL DEFAULT NULL,
  PRIMARY KEY (`id_statistic`),
  UNIQUE INDEX `UK_8ytki779ehb8fg781vo27hj0n` (`id_team` ASC) VISIBLE,
  CONSTRAINT `FK92iaci2uyvccvwcs3cdqv8ldi`
    FOREIGN KEY (`id_team`)
    REFERENCES `clubapp`.`team` (`id_team`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
