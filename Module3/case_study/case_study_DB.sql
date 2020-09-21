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
insert into type_customer (name_type_customer) values('Diamond');

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
values (1,1,1, '2019-02-07','2020-12-09',100,150),
	(2,2,2, '2019-01-07','2020-12-09',100,150);
    
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
-- yêu cầu 4
select customers.id, customers.name_customer,contract_sign_date,contract_end_date,name_type_customer, count(contract.id_customer) as numberOfOrder
from customers
left join contract on customers.id = contract.id_customer
left join type_customer on type_customer.id = customers.id_type_customer
where name_type_customer = 'Diamond'
group by name_customer
order by  numberOfOrder;
-- yêu cầu 5 
select customers.id, customers.name_customer,name_type_customer,service.name_service,
contract_sign_date,contract_end_date ,sum(service.price_rent+accompanied_service.price*accompanied_service.unit) as total_pay
from customers
left join contract on customers.id = contract.id_customer
left join type_customer on type_customer.id = customers.id_type_customer
left join service on contract.id_service= service.id
left join contract_detail on contract.id= contract_detail.id_contract
left join accompanied_service on contract_detail.id_accompanied_service= accompanied_service.id
group by name_customer;

-- yêu cầu 6 
select id_service,name_type_service,area,maximum_people,price_rent,type_service.name_type_service,contract.id_customer,contract_sign_date
from service
left join type_service on type_service.id = service.id_type_service
left join contract  on contract.id_service = service.id
where id_service not in (
	select service.id from service
    left join contract on service.id = contract.id_service
    where datediff(contract_sign_date, '2019-01-01') >0
);
-- yêu cầu 7
select id_service,name_type_service,area,maximum_people,price_rent,type_service.name_type_service,contract.id_customer,contract_sign_date
from service
left join type_service on type_service.id = service.id_type_service
left join contract  on contract.id_service = service.id
where contract_sign_date > '2017-12-31' and contract_sign_date < '2019-01-01' 
and id_service not in (
	select service.id from service
    left join contract on service.id = contract.id_service
    where contract_sign_date > '2018-12-31' and contract_sign_date < '2020-01-01' 
)
group by id_service;
-- yêu cầu 8
-- cách 1
select distinct name_customer
from  customers;
-- Cách 2
select name_customer
from customers 
group by name_customer;
-- cách 3
select name_customer
from customers
union
select name_customer
from customers;
 -- yêu cầu 9
 select month(contract_sign_date) as `month`, count( id_customer) as numberOfContract
 from contract
 where year(contract_sign_date) = 2019
 group by  month(contract_sign_date)
 order by month ;
 -- yêu cầu 10
 select contract.id, contract_sign_date, contract_end_date, deposits, count(id_accompanied_service)
from contract 
left join contract_detail on contract.id = contract_detail.id_contract
group by contract.id ;
-- yêu cầu 11
 select name_accompanied_service, name_customer,type_customer.name_type_customer, address
from accompanied_service 
left join contract_detail on accompanied_service.id = contract_detail.id_contract
left join contract on contract.id = contract_detail.id_contract
left join customers on customers.id = contract.id_customer
left join type_customer on type_customer.id = customers.id_type_customer
where type_customer.name_type_customer ='Diamond' and ( address = 'Vinh' or address = 'Quang Ngai');
-- yêu cầu 12



