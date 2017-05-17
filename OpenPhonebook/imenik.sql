DROP DATABASE IF EXISTS `imenik`;
CREATE DATABASE IF NOT EXISTS `imenik` DEFAULT CHARACTER SET latin1;
USE `imenik`;

CREATE SCHEMA IF NOT EXISTS `imenik` DEFAULT CHARACTER SET utf8 ;
USE `imenik` ;

CREATE TABLE user (
    name VARCHAR(50) PRIMARY KEY NOT NULL,
    password VARCHAR(50)
);

CREATE TABLE contact (
    contactID INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(50),
    lastName VARCHAR(50),
    phone VARCHAR(50),
    email VARCHAR(50),
    city VARCHAR(50),
    userName VARCHAR(50)
);

INSERT INTO user (name, password) VALUES ('user', 'pass');

INSERT INTO contact (
	name, lastName, phone, email, city, userName)
    VALUES (
    'Prvi',
    'Kontakt1',
    '063/111-000',
    'prvi@gmail.com',
    'grad',
    'user'
);

INSERT INTO contact (
	name, lastName, phone, email, city, userName)
    VALUES (
    'Drugi',
    'Kontakt2',
    '063/111-111',
    'drugi@gmail.com',
    'grad',
    'user'
);