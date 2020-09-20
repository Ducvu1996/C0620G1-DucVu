CREATE VIEW CUSTOMERS_VIEW AS
SELECT customerName, city
FROM  CUSTOMERS;
SELECT * FROM CUSTOMERS_VIEW;
drop view classicmodels.customers_view;
CREATE VIEW CUSTOMERS_VIEW AS
SELECT customerName, city
FROM  CUSTOMERS
WHERE city IS NOT NULL
WITH CHECK OPTION;
 SELECT * FROM CUSTOMERS_VIEW where customerName like 'A%' and city like 'M%';
 SELECT * FROM customers WHERE customerNumber = 175; 
 EXPLAIN SELECT * FROM customers WHERE customerNumber = 175;
 ALTER TABLE customers ADD INDEX idx_customerNumber(customerNumber);

EXPLAIN SELECT * FROM customers WHERE customerNumber = 175;