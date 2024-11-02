-- Task Start --

SELECT branch_name,branch_city
FROM branch
WHERE assets > 1000000; -- 1


SELECT account_number,balance
FROM account
WHERE branch_name = 'Downtown' or balance BETWEEN 600 and 750; -- 2


SELECT account_number
FROM account a,branch b
WHERE a.branch_name = b.branch_name AND b.branch_city = 'Rye'; -- 3


SELECT l.loan_number
FROM loan l,borrower b,customer c
WHERE l.amount >= 1000 AND l.loan_number = b.loan_number AND b.customer_name = c.customer_name AND c.customer_city = 'Harrison'; -- 4


SELECT * 
FROM account 
ORDER BY balance desc; -- 5


SELECT * 
FROM customer
ORDER BY customer_city; -- 6


SELECT c.customer_name
FROM account a,depositor d,customer c
WHERE a.account_number = d.account_number AND d.customer_name = c.customer_name
INTERSECT
SELECT c.customer_name
FROM loan l,borrower b,customer c
WHERE l.loan_number = b.loan_number AND b.customer_name = c.customer_name; -- 7


SELECT c.*
FROM account a,depositor d,customer c
WHERE a.account_number = d.account_number AND d.customer_name = c.customer_name
UNION
SELECT c.*
FROM loan l,borrower b,customer c
WHERE l.loan_number = b.loan_number AND b.customer_name = c.customer_name; -- 8


SELECT c.customer_name,c.customer_city
FROM loan l,borrower b,customer c
WHERE l.loan_number=b.loan_number AND b.customer_name=c.customer_name

MINUS

SELECT c.customer_name,c.customer_city
FROM account a,depositor d,customer c
WHERE a.account_number=d.account_number AND d.customer_name=c.customer_name; -- 9

select branch_name,SUM(assets) AS Total_Assets
from branch
GROUP BY branch_name; -- 10

SELECT branch_name, AVG(balance) AS Average_balance
FROM account
GROUP by branch_name;-- 11

SELECT branch_city, AVG(balance) AS Average_balance
FROM account a,branch b
WHERE a.branch_name=b.branch_name
GROUP BY branch_city; --12

SELECT branch_name, MIN(amount)
FROM loan
GROUP BY branch_name; -- 13

SELECT branch_name, COUNT(loan_number) AS TOTAL_NUMBER_OF_LOAN
from loan
GROUP BY branch_name; -- 14

SELECT d.customer_name,d.account_number
FROM customer c,depositor d,account a
WHERE c.customer_name = d.customer_name and d.account_number = a.account_number and
a.balance = (SELECT MAX(balance) FROM account); -- 15