drop database if exists case_study_database;
create database case_study_database;
use case_study_database;

create table staff(
id int primary key not null auto_increment,
name_staff varchar(30) not null,
birth_day date not null,
id_card varchar(45) not null,
phone varchar(45) not null,
email varchar(45) not null,
address varchar(45) not null,
id_position int not null,
foreign key (id_position) references position (id),
id_level int not null,
foreign key (id_level) references level (id),
id_department int not null,
foreign key (id_department) references department (id)
); 
create table position (
id int primary key not null auto_increment,
name_position varchar(45) not null
);
create table `level`(
id int primary key not null auto_increment,
name_level varchar(45) not null
);
create table department(
id int primary key not null auto_increment,
name_department varchar(45) not null
);
create table contract (
id int primary key not null auto_increment,
contract_sign_date date,
contract_end_date date not null,
deposits int not null,
total_money int not null,
id_staff int not null,
foreign key (id_staff) references staff (id),
id_customer int not null,
foreign key (id_customer) references customers(id),
id_service int not null,
foreign key (id_service) references service(id)
);
create table customers (
id int primary key not null auto_increment,
id_type_customer int not null,
name_customer varchar(30) not null,
birth_day date not null,
id_card varchar(30) not null,
phone varchar(10) not null,
email varchar(45) not null,
address varchar(45) not null,
foreign key (id_type_customer) references type_customer(id)
);
create table type_customer(
id int primary key not null auto_increment,
name_type_customer varchar(50)
);

create table service (
id int primary key not null auto_increment,
name_service varchar(45) not null,
area int not null,
number_of_floor int not null,
maximum_people int not null,
status_service varchar(45) not null,
price_rent varchar(45) not null,
id_type_service int not null,
foreign key (id_type_service) references type_service(id),
id_type_rent int not null,
foreign key (id_type_rent) references type_rent(id)
);
create table type_rent (
id int primary key not null auto_increment,
name_type_rent varchar(45) not null,
price int not null
);
create table type_service(
id int primary key not null auto_increment,
name_type_service varchar(45) not null
);
create table contract_detail(
id int primary key not null auto_increment,
id_contract int not null,
id_accompanied_service int not null,
amount int not null,
foreign key (id_contract) references contract(id),
foreign key (id_accompanied_service) references accompanied_service(id)
);
create  table accompanied_service(
id int primary key not null auto_increment,
name_accompanied_service varchar(50) not null,
price int,
unit varchar(20),
`status` varchar(50)
);
insert into position (name_position) values('progamer'),('Human resources'),('manager');

insert into level (name_level) values('engineer'),('master'),('doctor');

insert into department (name_department) values('training'),('reception'),('design');

insert into type_customer (name_type_customer) values('vip'),('normal'),('businessman');

insert into type_rent (name_type_rent,price) values('week',1000),('day',200),('month',3500);

insert into type_service (name_type_service) values('massage'),('golf'),('pool');

insert into accompanied_service (name_accompanied_service ,price ,unit,`status`) 
	values('bonus',500,1,'available'),
			('travel',1000,2,'unavailable')
            ;

insert into staff (name_staff,birth_day ,id_card ,phone ,email ,address,id_position ,id_level ,id_department) 
values
	('Nguyen Duc Vu','1997-09-06','184305455','0345000014','johnducvu1996@gmail.com','Danang',1,2,1),
	('Nguyen Thi Thu','1997-09-06','184305455','0345000014','johnducvu1996@gmail.com','Danang',2,2,2),
	('Nguyen Vu Thu','1997-09-06','184305455','0345000014','johnducvu1996@gmail.com','Danang',1,2,1)
;
insert into customers (id_type_customer,name_customer,birth_day ,id_card ,phone ,email ,address )
 values
	(1,'Trinh Quoc Khanh','1997-09-06','184305455','0345000014','johnducvu1996@gmail.com','Danang'),
	(2,'Nguyen Anh Phap','1997-09-06','184305455','0345000014','johnducvu1996@gmail.com','Danang'),
	(3,'Nguyen Gia Hoa','1997-09-06','184305455','0345000014','johnducvu1996@gmail.com','Danang')
;
insert into contract_detail(id_contract,id_accompanied_service,amount)
values (3,1,3),
		(4,1,4);

insert into contract(id_staff, id_customer,id_service,contract_sign_date ,contract_end_date,deposits,total_money)
values (1,1,1, '2020-06-07','2020-12-09',100,150),
	(2,2,2, '2020-06-07','2020-12-09',100,150);
    
insert into service(name_service ,area,number_of_floor,maximum_people,status_service ,price_rent,id_type_service ,id_type_rent)
values('villa',100,2,7,'availabel','1000',1,1),
		('house',100,1,4,'availabel','500',2,1),
		('room',30,1,2,'availabel','200',2,2);
-- yêu cầu 2 
 select * from staff where (name_staff like 'H%' or name_staff like 'T%' or name_staff like 'K%') and length(name_staff)<=15;
 -- yêu cầu 3 
select* from customers
where datediff(now(),birth_day)/365 >=18
	and (address='Danang' or address='Quang Tri');
