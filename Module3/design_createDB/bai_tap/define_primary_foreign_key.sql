create database primary_foreign_key;
create table customers
	(customer_number int(10) primary key auto_increment,
	fullname varchar(50) not null,
	address varchar(50),
	email varchar(50),
	phone varchar(50)
)
;
create table accounts (
	account_number varchar(50)  primary key not null,
    account_type varchar(50),
    open_date date,
    balance varchar(50),
    customer_number int(10),
    foreign key(customer_number) references customers(customer_number)
);
create table transactions(
	tran_number int(10)  primary key,
	account_number varchar(50),
	tran_date date,
	amount varchar(50),
	`description` text(100),
    foreign key(account_number) references accounts(account_number)
);
