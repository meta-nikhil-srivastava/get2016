use lis;

/*Q1*/

SELECT 
group_concat(myview.category),
group_concat(myview.catCount)
FROM (select category,count(category) as catCount
FROM members GROUP BY(category)) as myview;


/*Q2*/

SELECT
T.title_id,T.title_nm
FROM titles T
LEFT JOIN books B ON T.title_id = B.title_id
LEFT JOIN book_issue BK ON  B.accession_no = BK.accession_no
GROUP BY(BK.accession_no)
HAVING COUNT(BK.accession_no) > 2;

/*Q3*/

SELECT
B.title_id AS `TITLE ID`, 
T.title_nm AS `TITTLE NAME`
FROM books B
INNER JOIN titles T ON B.title_id =T.title_id
INNER JOIN book_issue BK ON B.accession_no = BK.accession_no
INNER JOIN members M ON BK.member_id = M.member_id
WHERE category NOT IN(SELECT M1.category FROM members M1 WHERE M1.category = 'F');

/*Q4*/

SELECT
A.author_id,A.author_nm 
FROM authors A
INNER JOIN title_author TA ON A.author_id = TA.author_id 
INNER JOIN books B ON TA.title_id = B.title_id;

