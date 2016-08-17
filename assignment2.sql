/* CREATE DATABASE LIS */
CREATE DATABASE IF NOT EXISTS LIS;

/* SELECT DATABSE TO USE */
USE LIS;

/* CREATE TABLE members */
CREATE TABLE IF NOT EXISTS members (
member_id int PRIMARY KEY AUTO_INCREMENT,
member_nm VARCHAR(50),
addressline1 VARCHAR(50),
adddessline2 VARCHAR(50),
category VARCHAR(50)
);

/* CREATE TABLE subjects */
CREATE TABLE IF NOT EXISTS subjects
(
subject_id int PRIMARY KEY AUTO_INCREMENT,
subject_nm VARCHAR(50)
);

/* CREATE TABLE publishers */
CREATE TABLE IF NOT EXISTS publishers
(
publisher_id int PRIMARY KEY AUTO_INCREMENT,
publisher_nm VARCHAR(50)
);

/* CREATE TABLE authors */
CREATE TABLE IF NOT EXISTS authors
(
author_id int PRIMARY KEY AUTO_INCREMENT,
author_nm VARCHAR(50)
);

/* CREATE TABLE titles */
CREATE TABLE IF NOT EXISTS titles
(
title_id int PRIMARY KEY AUTO_INCREMENT,
title_nm VARCHAR(50),
subject_id int NOT NULL,FOREIGN KEY(subject_id) REFERENCES subjects(subject_id),
publisher_id int NOT NULL,FOREIGN KEY (publisher_id) REFERENCES publishers(publisher_id)
);

/* CREATE TABLE books */
CREATE TABLE IF NOT EXISTS books
(
accession_no int PRIMARY KEY AUTO_INCREMENT,
title_id int NOT NULL,FOREIGN KEY (title_id) REFERENCES titles(title_id),
purchase_dt DATE,price int(10),status VARCHAR(15)
);

/* CREATE TABLE book_issue */
CREATE TABLE IF NOT EXISTS book_issue
(
issue_dt DATE ,
accession_no int NOT NULL,FOREIGN KEY (accession_no) REFERENCES books(accession_no),
member_id int NOT NULL,FOREIGN KEY (member_id) REFERENCES members(member_id),
due_dt DATE,
PRIMARY KEY(issue_dt,member_id,accession_no)
);

/* CREATE TABLE title_author */
CREATE TABLE IF NOT EXISTS title_author
(
title_id int NOT NULL,FOREIGN KEY (title_id) REFERENCES titles(title_id),
author_id int NOT NULL,FOREIGN KEY (author_id) REFERENCES authors(author_id),
PRIMARY KEY(title_id,author_id)
);

/* CREATE TABLE book_return */
CREATE TABLE IF NOT EXISTS book_return
(
return_dt DATE,accession_no int NOT NULL,FOREIGN KEY (accession_no) REFERENCES books(accession_no),
member_id int NOT NULL,FOREIGN KEY (member_id) REFERENCES members(member_id),
issue_dt DATE,FOREIGN KEY (issue_dt) REFERENCES book_issue(issue_dt),
PRIMARY KEY(return_dt,accession_no,member_id)
);

/* SHOW ALL TABLES IN DATABASE */
SHOW tables;

/* remove the foriegn key constraints */
SET foreign_key_checks = 0;

/* DROP TABLE members */
DROP TABLE members;

/* re-implement the foriegn key constraints */
SET foreign_key_checks = 1;

/* SHOW ALL TABLES IN DATABASE */
SHOW tables;

/* CREATE TABLE members */
CREATE TABLE IF NOT EXISTS members (
member_id int PRIMARY KEY AUTO_INCREMENT,
member_nm VARCHAR(50),
addressline1 VARCHAR(50),
adddessline2 VARCHAR(50),
category VARCHAR(50)
);

/* SHOW ALL TABLES IN DATABASE */
SHOW tables;