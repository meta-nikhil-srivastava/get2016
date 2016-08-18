USE LIS;

/*Q1*/

SELECT
M.member_id AS ID,
M.member_nm AS NAME,
T.title_nm AS TITTLE,
BI.accession_no AS ACCESSION_NO,
BI.issue_dt AS `ISSUE DATE`,
TIMESTAMPDIFF(MONTH,br.issue_dt,IFNULL(br.return_dt,CURRENT_TIMESTAMP)) AS MONTH
FROM book_issue bi
LEFT JOIN members m ON bi.member_id = m.member_id
LEFT JOIN books b ON b.accession_no = bi.accession_no
LEFT JOIN  titles t ON t.title_id = b.title_id
LEFT JOIN
    book_return br ON br.accession_no = BI.accession_no AND br.member_id = bi.member_id AND br.issue_dt = bi.issue_dt
WHERE 
    TIMESTAMPDIFF(MONTH,br.issue_dt,IFNULL(br.return_dt,CURRENT_TIMESTAMP))>2
ORDER BY M.member_nm,T.title_nm ;

/*Q2*/

SELECT 
member_nm AS NAME,
length(member_nm) AS LENGTH
FROM members
WHERE length(member_nm) >= (SELECT max(length(member_nm)) from members);

/*Q3*/

SELECT count(*) AS `NO OF BOOK ISSUED`
FROM book_issue;







