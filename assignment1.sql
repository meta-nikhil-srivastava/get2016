USE LIS;

/*Q1*/
INSERT INTO members(member_nm,addressline1,adddessline2,category) VALUES ("John Snow","North","Winter Fell","S");

SELECT member_nm FROM members WHERE category IN ( SELECT DISTINCT category FROM members WHERE member_nm="John Snow");


/*Q2*/

SELECT 
bi.issue_dt AS Issue_Date, t.title_nm AS Title,
m.member_nm AS Member, bi.due_dt AS Due_Date FROM book_issue bi
INNER JOIN members m ON bi.member_id = m.member_id
INNER JOIN books b ON bi.accession_no = b.accession_no
INNER JOIN titles t ON b.title_id = t.title_id
WHERE (bi.issue_dt, bi.accession_no, bi.member_id) IN
(SELECT br.issue_dt, br.accession_no, br.member_id FROM book_return br
WHERE TIMESTAMPDIFF(DAY, bi.due_dt, br.return_dt) > 0);


/*Q3*/


SELECT t.title_nm AS Title, m.member_nm AS Member,bi.issue_dt AS Issue_Date,bi.due_dt AS Due_Date FROM book_issue bi
INNER JOIN members m ON bi.member_id = m.member_id
INNER JOIN books b ON bi.accession_no = b.accession_no
INNER JOIN titles t ON b.title_id = t.title_id
WHERE (
bi.issue_dt, bi.accession_no, bi.member_id) NOT IN
(
SELECT br.issue_dt, br.accession_no, br.member_id FROM book_return br
);




/*Q4*/

SELECT title_nm AS TITTLE
FROM titles WHERE title_id
IN (SELECT title_id FROM books WHERE price=
(SELECT max(price) FROM books)
);

/*Q5*/

SELECT MAX(price) FROM books WHERE price NOT IN (SELECT MAX(price) FROM books);
