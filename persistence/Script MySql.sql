CREATE TABLE `registerstudents`.`tbstudent` (
  `enrollment` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `gender` VARCHAR(10) NULL,
  `grade1` DECIMAL(5,2) NULL,
  `grade2` DECIMAL(5,2) NULL,
  PRIMARY KEY (`enrollment`));