
create table products(
	productCode varchar(15) not null primary key,
	productName varchar(70) not null,
	productScale varchar(10) not null,
	productVendor varchar(50) not null,
	productDescription text not null,
	quantityInStock int not null,
	buyprice float not null,
	MSRP float not null,
    productLine varchar(50) not null,
    foreign key (productLine) references productlines(productLine)
    
);
create table productlines(
	productLine varchar(50) not null primary key,
    textDescription text,
    image varchar(50) 
);
select productCode,productName,buyprice, quantityInStock from products
where buyprice >56.76 and quantityInStock >10;

select productCode,productName,buyprice, quantityInStock from products
inner join productlines
on products.productline = productlines.productline
where buyprice >56.76 and buyprice < 95.59;
