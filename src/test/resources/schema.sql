CREATE TABLE Person (
	ID int(11) NOT NULL AUTO_INCREMENT,
	Name varchar(255) DEFAULT NULL,
	Surname varchar(255) DEFAULT NULL,
	Dateofbirth varchar(8) DEFAULT NULL,
	Address varchar(255) DEFAULT NULL,
	Gender varchar(7) DEFAULT NULL,
	Email varchar(255) DEFAULT NULL,
	User varchar(255) NOT NULL,
	Password varchar(255) NOT NULL,
	PRIMARY KEY (ID)
);

