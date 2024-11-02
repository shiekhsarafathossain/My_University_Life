-- Task 1 Start --

-- account table start --
create table account(
account_no char(5),
balance number not null, -- not null 
constraint ac_pk primary key(account_no), -- Primary Key
constraint bl_ck check(balance > 0) -- Check Value
);

-- account table end --

-- customer table start --
create table customer(
customer_no char(5),
customer_name varchar2(20) not null, -- not null
customer_city varchar2(10),
constraint c_pk primary key(customer_no) -- Primary key
);

-- customer table end --

-- depositor table start --
create table depositor(
account_no char(5),
customer_no char(5),
constraint a_pk primary key(account_no,customer_no) -- Primary key
);
-- depositor table end --

-- Task 1 end --

-- Task 2 start --

alter table customer
add date_of_birth date; -- add date_of_birth

desc depositor;

alter table customer
drop column date_of_birth; -- drop date_of_birth

alter table depositor rename column account_no to a_no; -- rename
alter table depositor rename column customer_no to c_no; -- rename

alter table depositor add constraint depositor_fk1 foreign key(a_no)
references account(account_no); -- add constraint
alter table depositor add constraint depositor_fk2 foreign key(c_no)
references customer(customer_no); -- add constraint

-- Task 2 end --

-- Task 3 Start --

-- insert account --
insert into account values('A-101',12000);
insert into account values('A-102',6000);
insert into account values('A-103',2500);

-- insert customer --
insert into customer values('C-101','Alice','Dhaka');
insert into customer values('C-102','Annie','Dhaka');
insert into customer values('C-103','Bob','Chittagong');
insert into customer values('C-104','Charlie','Khulna');

-- insert depositor --
insert into depositor values('A-101','C-101');
insert into depositor values('A-103','C-102');
insert into depositor values('A-103','C-104');
insert into depositor values('A-102','C-103');
select * from depositor;

-- Task 4 --
select customer_name,customer_city from customer; -- 1

select distinct customer_city from customer; -- 2

select account_no from account
where balance > 7000; --3

select customer_no,customer_name from customer
where customer_city = 'Khulna'; -- 4

select customer_no,customer_name from customer
where not customer_city = 'Dhaka'; -- 5

SELECT c.customer_name, c.customer_city
FROM customer c
JOIN depositor d ON c.customer_no = d.c_no -- 6
JOIN account a ON d.a_no = a.account_no
WHERE a.balance > 7000;

SELECT c.customer_name, c.customer_city
FROM customer c
JOIN depositor d ON c.customer_no = d.c_no
JOIN account a ON d.a_no = a.account_no
WHERE a.balance > 7000 AND c.customer_city = 'Khulna'; -- 7

SELECT a.account_no, a.balance
FROM account a
JOIN depositor d ON a.account_no = d.a_no --8
WHERE d.c_no = 'C-102'; 

SELECT a.account_no, a.balance
FROM account a
JOIN depositor d ON a.account_no = d.a_no --9
JOIN customer c ON d.c_no = c.customer_no
WHERE c.customer_city IN ('Dhaka', 'Khulna');

SELECT customer_no, customer_name
FROM customer
WHERE customer_no NOT IN (SELECT c_no FROM depositor); -- 10