-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema libraryGames
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema libraryGames
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `libraryGames` DEFAULT CHARACTER SET utf8 ;
USE `libraryGames` ;

-- -----------------------------------------------------
-- Table `libraryGames`.`games`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `libraryGames`.`games` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(145) NULL,
  `type` VARCHAR(30) NULL,
  `isOnline` TINYINT(1) NULL,
  `isPaid` TINYINT(1) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `libraryGames`.`games`
-- -----------------------------------------------------
START TRANSACTION;
USE `libraryGames`;
INSERT INTO `libraryGames`.`games` (`id`, `name`, `type`, `isOnline`, `isPaid`) VALUES (1, 'Path of Exile', 'ARPG', true, false);
INSERT INTO `libraryGames`.`games` (`id`, `name`, `type`, `isOnline`, `isPaid`) VALUES (2, 'Call of Duty', 'Shooter', true, true);
INSERT INTO `libraryGames`.`games` (`id`, `name`, `type`, `isOnline`, `isPaid`) VALUES (3, 'World of Warcraf', 'MMORPG', true, true);
INSERT INTO `libraryGames`.`games` (`id`, `name`, `type`, `isOnline`, `isPaid`) VALUES (4, 'FInal Fantasy', 'RPG', true, true);
INSERT INTO `libraryGames`.`games` (`id`, `name`, `type`, `isOnline`, `isPaid`) VALUES (5, 'The Binding of Isaac', 'Indie', false, true);

COMMIT;
