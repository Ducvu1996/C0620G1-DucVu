drop database  if exists fee_tution;
create database fee_tution;
create table fees (
	id int,
    `name` varchar(30),
    age int,
    course varchar(30),
    fee int 
    );
insert into fees(id,`name`,age,course,fee)
values (1,'Hoang',21,'CNTT',400000),
	 (2,'Viet',19,'DTVT',320000),
	 (3,'Thanh',18,'KTDN',400000),
	 (4,'Nhan',19,'CK',450000),
	 (5,'Huong',20,'TCNH',500000),
	 (5,'Huong',20,'TCNH',200000)
     ;
select * from fees where `name`='Huong';
select sum(fee) from fees where `name`='Huong';
select * from fees group by `name`;