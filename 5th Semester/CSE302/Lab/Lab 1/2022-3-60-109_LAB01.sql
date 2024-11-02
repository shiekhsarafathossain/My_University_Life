-- Lab Task 1 --
-- Creating Table For Instructor --
create table instructor109(
    id number,
    name varchar2(30),
    dept_name varchar2(20),
    salary number
);
-- Creating Table For Course --
create table course109(
    course_id varchar2(10),
    title varchar2(30),
    dept_name varchar2(20),
    credits number
);

-- Lab Task 2 --

-- a --
Insert into instructor109 values(10101,'Srinivasan','Comp.Sci.',65000);
Insert into instructor109 values(12121,'Wu','Finance',90000);
Insert into instructor109 values(15151,'Mozart','Music',40000);
Insert into instructor109 values(22222,'Einstein','Physics',95000);
Insert into instructor109 values(32343,'El Said','History',60000);
Insert into instructor109 values(33456,'Gold','Physics',87000);
Insert into instructor109 values(45565,'Katz','Comp.Sci.',75000);
Insert into instructor109 values(58583,'Califieri','History',62000);
Insert into instructor109 values(76543,'Singh','Finance',80000);
Insert into instructor109 values(76766,'Crick','Biology',72000);
Insert into instructor109 values(83821,'Brandt','Comp.Sci.',92000);
Insert into instructor109 values(98345,'Kim','Elec.Eng.',80000);
-- End --
desc instructor109;
select * from instructor109;
-- b --
Insert into course109 values('BIO-101','Intro. to Biology','Biology',4);
Insert into course109 values('BIO-301','Genetics','Biology',4);
Insert into course109 values('BIO-399','Computational Biology','Biology',3);
Insert into course109 values('CS-101','Intro. to Computer Science','Comp.Sci.',4);
Insert into course109 values('CS-190','Game Design','Comp.Sci.',4);
Insert into course109 values('CS-315','Robotics','Comp.Sci.',3);
Insert into course109 values('CS-319','Image Processing','Comp.Sci.',3);
Insert into course109 values('CS-347','Database System Concepts','Comp.Sci.',3);
Insert into course109 values('CS-190','Game Design','Comp.Sci.',4);
Insert into course109 values('EE-181','Intro. to Digital Systems','Elec.Eng.',3);
Insert into course109 values('FIN-201','Investment Banking','Finance',3);
Insert into course109 values('His-351','World History','History',3);
Insert into course109 values('MU-199','Music Video Production','Music',3);
Insert into course109 values('PHY-101','Physical Principles','Physics',4);
-- End --
select * from course109;
-- Lab Task 3 --
select name from instructor109;

select course_id, title from course109;

select name, dept_name from instructor109
WHERE id=22222;

select title, credits from course109
WHERE dept_name = 'Comp.Sci.';

select name, dept_name from instructor109
WHERE salary > 70000;

select title from course109
WHERE credits >= 4;

select name, dept_name from instructor109
WHERE salary >= 80000 and salary <= 100000;

select title, credits from course109
WHERE NOT(dept_name = 'Comp.Sci.');

select * from instructor109;

select * from course109
WHERE dept_name = 'Biology' and credits != 4;