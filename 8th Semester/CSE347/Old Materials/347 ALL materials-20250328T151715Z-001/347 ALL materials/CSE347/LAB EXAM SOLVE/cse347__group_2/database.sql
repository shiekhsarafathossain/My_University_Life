-- create the database if it doesn't already exist
CREATE DATABASE IF NOT EXISTS cse347__lab_exam;

-- switch to the database
USE cse347__lab_exam;

-- create the table with corrected column definitions and proper naming
CREATE TABLE IF NOT EXISTS course_table (
  course_code VARCHAR(10) NOT NULL,
  course_name CHAR(100) NOT NULL,
  credit FLOAT NOT NULL,
  allocated_section INT(3) NOT NULL,
  PRIMARY KEY (course_code, allocated_section) -- Corrected primary key column names
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Insert data into the table
INSERT INTO course_table (course_code, course_name, credit, allocated_section) VALUES
('CSE347', 'Information System Analysis and Design', 4, 6),
('CSE412', 'Software Engineering', 4, 4),
('CSE430', 'Software Testing', 3, 3),
('CSE477', 'Data Mining', 4, 4),
('CSE479', 'Web Programming', 4, 5);
