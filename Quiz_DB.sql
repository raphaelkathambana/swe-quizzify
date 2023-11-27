CREATE DATABASE IF NOT EXISTS `QuizzifyDB`;
    
USE `QuizzifyDB`;
SELECT DATABASE();

DROP TABLE IF EXISTS `Result`;  
DROP TABLE IF EXISTS `Questions`;
DROP TABLE IF EXISTS `Quiz`;  
DROP TABLE IF EXISTS `Student`;
DROP TABLE IF EXISTS `Teacher`;
DROP TABLE IF EXISTS `Subject`;


CREATE TABLE IF NOT EXISTS `Student` (
    `Student_ID` int(4) NOT NULL AUTO_INCREMENT,
    `Name` varchar(70),
    `Email` varchar(80),
    `Password` varchar(25),
    PRIMARY KEY (`Student_ID`)
)AUTO_INCREMENT=0001;

CREATE TABLE IF NOT EXISTS `Teacher` (
    `Teacher_ID` int(4) NOT NULL AUTO_INCREMENT,
    `Name` varchar(70),
    `Email` varchar(80),
    `Password` varchar(25),
    PRIMARY KEY (`Teacher_ID`)
)AUTO_INCREMENT=0001;

CREATE TABLE IF NOT EXISTS `Subject` (
    `Subject_ID` int(4) NOT NULL AUTO_INCREMENT,
    `Name` varchar(40),
    PRIMARY KEY (`Subject_ID`)
)AUTO_INCREMENT=0001;

INSERT INTO `Subject` (`Name`) VALUES ("English");
INSERT INTO `Subject` (`Name`) VALUES ("Science");
INSERT INTO `Subject` (`Name`) VALUES ("Social Studies");

CREATE TABLE IF NOT EXISTS `Quiz` (
    `Quiz_ID` int(4) NOT NULL AUTO_INCREMENT,
    `Title` varchar(200),
    `Subject_ID` int(4),
    `Teacher_ID` int(4),
    `Complete` boolean,
    
    PRIMARY KEY (`Quiz_ID`),
    
    CONSTRAINT FK_0
	FOREIGN KEY (`Subject_ID`)
	REFERENCES `Subject` (`Subject_ID`),

    CONSTRAINT FK_1
	FOREIGN KEY (`Teacher_ID`)
	REFERENCES `Teacher` (`Teacher_ID`)
)AUTO_INCREMENT=0001;

CREATE TABLE IF NOT EXISTS `Questions`(
	`Quiz_ID` int(4) NOT NULL,
	`Question` varchar(255),
    `Option-A` varchar(255),
    `Option-B` varchar(255),
    `Option-C` varchar(255),
    `Answer` varchar(255),
    
     CONSTRAINT FK_2
	FOREIGN KEY (`Quiz_ID`)
	REFERENCES `Quiz` (`Quiz_ID`)
);

CREATE TABLE IF NOT EXISTS `Result` (
    `Result_ID` int(4) NOT NULL AUTO_INCREMENT,
    `Quiz_ID` int(4),
    `Student_ID` int(4),
    `Result` float(6),
    PRIMARY KEY (`Result_ID`),
    
    CONSTRAINT FK_3
	FOREIGN KEY (`Quiz_ID`)
	REFERENCES `Quiz` (`Quiz_ID`),
    
    CONSTRAINT FK_4
	FOREIGN KEY (`Student_ID`)
	REFERENCES `Student` (`Student_ID`)
)AUTO_INCREMENT=0001;

CREATE TABLE IF NOT EXISTS `TeacherCache` (
	`ID` int(1)
);

CREATE TABLE IF NOT EXISTS `StudentCache` (
	`ID` int(1)
);