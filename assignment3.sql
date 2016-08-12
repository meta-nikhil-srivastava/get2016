/* SELECT DATABSE TO USE */
USE LIS;

/* insert data into table members */
INSERT INTO members(member_nm,addressline1,adddessline2,category) VALUES ("Nikhil","Lucknow","Uttar Pradesh","S");
INSERT INTO members(member_nm,addressline1,adddessline2,category) VALUES ("Shobhit","Jaipur","Rajasthan","F");
INSERT INTO members(member_nm,addressline1,adddessline2,category) VALUES ("Pranav","Jaipur","Rajasthan","S");

/* insert data into table subjects */
INSERT INTO subjects(subject_nm) VALUES ("Science");
INSERT INTO subjects(subject_nm) VALUES ("Maths");
INSERT INTO subjects(subject_nm) VALUES ("English");
INSERT INTO subjects(subject_nm) VALUES ("Hindi");

/* insert data into table publishers */
INSERT INTO publishers(publisher_nm) VALUES ("Sanjeev Publications");
INSERT INTO publishers(publisher_nm) VALUES ("S.Chand Publications");
INSERT INTO publishers(publisher_nm) VALUES ("TMH Publications");

/* insert data into table authors */
INSERT INTO authors(author_nm) VALUES ("V. Ramchandran");
INSERT INTO authors(author_nm) VALUES ("Kuldeep Chakraborty");
INSERT INTO authors(author_nm) VALUES ("Rashmi Bansal");

/* insert data into table titles */
INSERT INTO titles(title_nm,subject_id,publisher_id) VALUES ("IN THIN AIR",2,3);
INSERT INTO titles(title_nm,subject_id,publisher_id) VALUES ("THE SECRET",4,2);
INSERT INTO titles(title_nm,subject_id,publisher_id) VALUES ("STAY HUNGRY",1,1);

/* insert data into table books */
INSERT INTO books(title_id,purchase_dt,price,status) VALUES (1,'2014/05/18',599,"available");
INSERT INTO books(title_id,purchase_dt,price,status) VALUES (2,'2014/06/11',235,"not available");
INSERT INTO books(title_id,purchase_dt,price,status) VALUES (1,'2015/02/18',485,"available");

/* insert data into table book_issue */
INSERT INTO book_issue(issue_dt,accession_no,member_id,due_dt) VALUES ('2014/05/21',1,2,'2014/05/29');
INSERT INTO book_issue(issue_dt,accession_no,member_id,due_dt) VALUES ('2014/06/20',2,2,'2014/07/29');
INSERT INTO book_issue(issue_dt,accession_no,member_id,due_dt) VALUES ('2015/03/18',3,1,'2015/03/28');

/* insert data into table title_author */
INSERT INTO title_author(title_id,author_id) VALUES (1,2);
INSERT INTO title_author(title_id,author_id) VALUES (2,1);
INSERT INTO title_author(title_id,author_id) VALUES (3,2);

/* insert data into table book_return */
INSERT INTO book_return(return_dt,accession_no,member_id,issue_dt) VALUES ('2014/05/27',1,2,'2014/05/21');
INSERT INTO book_return(return_dt,accession_no,member_id,issue_dt) VALUES ('2014/07/29',2,2,'2014/06/20');
 
/* update data of column adddessline2 of table members */
SET SQL_SAFE_UPDATES = 0;
UPDATE members SET adddessline2="Jaipur";

/* update data of column adddessline1 of table members WHERE category = ''*/
UPDATE members SET addressline1 = 'EPIP, Sitapura' WHERE category = 'F';

/* remove the foriegn key constraints */
SET foreign_key_checks = 0;

/* delete all rows from publishers table */
TRUNCATE TABLE publishers;

/* re-implement the foriegn key constraints */
SET foreign_key_checks = 1;

/* Insert the sample data back in Publishers table using substitution variables */
SET @name="Oxford Publications";
INSERT INTO publishers(publisher_nm) VALUES (@name);

SET @name="Raining Publications";
INSERT INTO publishers(publisher_nm) VALUES (@name);

SET @name="Meta Publications";
INSERT INTO publishers(publisher_nm) VALUES (@name);

/* remove the foriegn key constraints */
SET foreign_key_checks = 0;

/* Delete those rows of Titles table belonging to Publisher with publisher_id = 1 */
DELETE FROM titles WHERE publisher_id = 1;

/* re-implement the foriegn key constraints */
SET foreign_key_checks = 1;