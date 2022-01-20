select * from employees;
select * from usertbl;
select * from gisatbl;
delete from gisatbl;
	
select * from dept;
select * from emp;

create table dept(
	dept_code	char(5) not null primary key,
	dept_name	varchar(20) not null,
	dept_loc	varchar(20) not null
);
	
create table emp(
	emp_code 		int auto_increment not null primary key,
	emp_name 		varchar(10) not null,
	emp_age 			int not null,
	emp_hiredate 	datetime not null default now(),
	emp_salary 		int not null default 3000,
	dept_code		char(5) not null,
	-- primary key(emp_code), 이 방법도 있음.
	foreign key (dept_code) references dept(dept_code)
);

-- dept(요소들)이 없는 것은 암묵적으로 전체 데이터를 순서대로 넣겠다는 의미.
insert into dept values('ABCDE', '개발', '강남');
insert into dept values('BCDEF', '설계', '강북');
insert into dept values('CDEFG', '분석', '강서');

-- default값이 없는데 not null이면 오류남. 무조건 값을 넣어줘야함.
insert into emp values(NULL, 'KIM', 30, DEFAULT, DEFAULT, 'CDEFG');
INSERT INTO emp values(null, 'LEE', 20, default, 5000, 'ABCDE');
INSERT INTO emp(dept_code, emp_name, emp_age) values('BCDEF', 'PARK', 25);
insert into emp(dept_code, emp_name, emp_age) values('ABCDE', 'CHOI', 26), ('BCDEF', 'SHIN', 24), ('CDEFG', 'SONG', 20);

UPDATE emp set emp_salary = 6000 where emp_name = 'CHOI';

-- delete, truncate는 데이터만 삭제
-- drop은 테이블 째로 삭제
delete from emp;
drop table emp;
truncate table emp;

