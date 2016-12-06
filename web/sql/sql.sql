/*
Copyright (c) 2016 Christy Smith
Campus Box 7915, Elon University, Elon, NC 27244

Copyright (c) 2016 Charles Kim
Campus Box 8462, Elon University, Elon, NC 27244
*/

CREATE DATABASE IF NOT EXISTS tellingtales;
USE tellingtales;

DROP TABLE IF EXISTS Library;

CREATE TABLE Library (
Id INT NOT NULL AUTO_INCREMENT,
firstName VARCHAR(50),
lastName VARCHAR(50),
emailAddress VARCHAR(50),
bookTitle VARCHAR(50),
dueDate VARCHAR(50),

PRIMARY KEY (Id)
);

