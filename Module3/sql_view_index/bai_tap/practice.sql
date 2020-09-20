drop database if exists view_index_practice;
create database view_index_practice;
use view_index_practice;
create table product(
Id int primary key auto_increment,
productCode varchar(30),
productName varchar (30),
productPrice int,
productAmount int,
productDescription text,
productStatus varchar(10)
	) ;
insert into product(productCode,productName,productPrice,productAmount,productDescription, productStatus) 
values ('SP0001',"iphone 6",100,3,'good', 'availabel'),
		('SP0002',"iphone 7",500,2,'very good', 'availabel'),
		('SP0003',"iphone 8",800,4,'perfect', 'availabel'),
		('SP0004',"iphone x",900,5,'perfect', 'availabel'),
		('SP0005',"iphone 11",1000,10,'good', 'availabel'),
		('SP0006','iphone 12',1200,20,'good', 'availabel')
        ;
