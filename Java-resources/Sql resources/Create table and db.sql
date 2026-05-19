CREATE TABLE employees (
emp_id INT,
emp_first_name VARCHAR(50),
emp_last_name varchar(50),
hourly_rate decimal(5, 2),
hire_date date
);

ALTER table employees
ADD phone_number varchar(15);

SELECT * FROM employees;

ALTER TABLE employees 
RENAME column phone_number TO contact;

ALTER TABLE employees
ADD email varchar(50);

SELECT * FROM employees;

ALTER TABLE employees
MODIFY column email varchar(100);

ALTER TABLE employees
MODIFY email VARCHAR(100)
AFTER emp_last_name;

SELECT * FROM employees;

alter table employees
DROP COLUMN email;

SELECT * FROM employees

