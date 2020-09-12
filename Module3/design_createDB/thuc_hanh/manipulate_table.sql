create database manipulate;
-- tạo bảng contacts 
CREATE TABLE contacts
( contact_id INT(11) NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(30) NOT NULL,
  first_name VARCHAR(25),
  birthday DATE,
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);
-- tạo bảng suppliers 
CREATE TABLE suppliers
( supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);	
 -- thêm cột last_name vào bảng contacts sau cột contact_id
 -- có thể thêm nhiều cột 
ALTER TABLE contacts
  ADD last_name varchar(40) NOT NULL
    AFTER contact_id;
--   ADD first_name varchar(35) NULL
--     AFTER last_name;
-- chỉnh sửa mô tả của 1 cột 
ALTER TABLE contacts
  MODIFY last_name varchar(50) NULL;    
--  xóa 1 cột
ALTER TABLE contacts
  DROP COLUMN contact_type;
		
--  thay đổi tên cột	 
  ALTER TABLE contacts		
  CHANGE COLUMN contact_type ctype
    varchar(20) NOT NULL;
    
    -- Cú pháp để đổi tên bảng
ALTER TABLE contacts
RENAME TO people;
SELECT *FROM people;
  