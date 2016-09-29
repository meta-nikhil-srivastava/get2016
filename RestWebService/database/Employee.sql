CREATE DATABASE  IF NOT EXISTS employee ;

USE employee;

CREATE TABLE employee (
  id varchar(100) NOT NULL PRIMARY KEY,
  name varchar(100) NOT NULL,
  age int(11) NOT NULL,
  salary int NOT NULL
);


INSERT INTO employee VALUES
('1','Amit Sharma',21,310124),
('2','Simran Kapoor',21,412145),
('3','Ajinkya Pandey',22,521432),
('4','Nikhil Srivastava',23,280000);

SELECT * FROM employee;