use lis;

/*Q1*/

CREATE VIEW VIEW_book_sub_title AS (
SELECT 
T.title_id, 
S.subject_id, 
S.subject_nm 
FROM titles T 
LEFT JOIN subjects S ON T.subject_id = S.subject_id
);


SELECT 
VIEW_book_sub_title.subject_id, 
VIEW_book_sub_title.subject_nm, 
COUNT(VIEW_book_sub_title.subject_nm) AS `NO Of books Purchased`
FROM VIEW_book_sub_title 
RIGHT JOIN 
	books ON VIEW_book_sub_title.title_id = books.title_id 
GROUP BY VIEW_book_sub_title.subject_nm
ORDER BY VIEW_book_sub_title.subject_nm;

INSERT INTO book_issue(issue_dt,accession_no,member_id,due_dt) VALUES ('2014/08/21',2,2,'2014/011/29');

/*Q2*/

SELECT * 
FROM book_issue 
WHERE TIMESTAMPDIFF(MONTH,issue_dt,due_dt) >= 2;
    
/*Q3*/

CREATE VIEW title_view AS (
SELECT 
titles.title_nm,books.price 
FROM books LEFT JOIN titles ON books.title_id = titles.title_id);

SELECT * 
FROM title_view 
WHERE title_view.price > ( SELECT MIN(price) FROM books);
    

