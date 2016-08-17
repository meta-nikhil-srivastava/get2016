USE LIS;

/* DISPLAY ALL COLUMNS OF MEMEBER TABLE*/
SELECT * FROM members;

/* DISPLAY MEMBER NAME, ID, CATEGORY*/
SELECT member_nm, member_nm, category FROM members;

/* DISPLAY MEMBER NAME, ID, CATEGORY WHERE CATEGORY IS  "F"*/
SELECT member_nm, member_nm, category FROM members WHERE category = "F";

/*DISPLAY VARIOUS CATREGORIES OF MEMBERS */
SELECT DISTINCT category FROM members;

/*DISPLAY MEMBER NAME AND CATEGORY IN DECENDING ORDER OF MEMBER NAME */
SELECT member_nm, category FROM members ORDER BY member_nm DESC; 

/* DISPLAY ALL TITLES THEIR SUBJECTS AND PUBLISHERS*/
SELECT T.title_nm, S.subject_nm as subject, P.publisher_nm as publisher FROM titles T 
LEFT JOIN subjects S  ON T.subject_id = S.subject_id 
LEFT JOIN publishers P  ON T.publisher_id = P.publisher_id ;

/*DISPLAY NUMBER OF MEMBERS IN EACH CATEGORY */
SELECT COUNT(member_nm), category
FROM members
GROUP BY category;

/*DISPLAY NAME OF MEMBERS BELONGING TO CATEGORY SAME AS 'Nikhil' */
SELECT M1.member_nm FROM members M1 LEFT JOIN members M2 ON M1.category = M2.category where M2.member_nm = 'Nikhil';

/*DISPLAY ALL INFORMATION ABOUT ALL THE ISSUED BOOKS */
SELECT book_issue.issue_dt AS ISSUE_DATE, book_issue.accession_no AS ACCESSION_NUMBER, book_issue.member_id AS MEMBER_ID,
IFNULL(book_return.return_dt," ") AS RETURN_DATE FROM book_issue 
LEFT JOIN book_return ON book_issue.accession_no = book_return.accession_no 
AND book_issue.member_id = book_return.member_id
AND book_issue.issue_dt = book_return.issue_dt ;
