USE classicmodels;
SELECT  customers.customerNumber,customerName,phone, paymentDate,amount,city FROM customers  JOIN payments
ON customers.customerNumber = payments.customerNumber
WHERE city = "Las Vegas";

SELECT customers.customerNumber, customerName, orderNumber, status
FROM customers
LEFT JOIN orders
ON customers.customerNumber = orders.customerNumber;

select customers.customerNumber, customerName, orderNumber, status
from customers LEFT JOIN orders
on customers.customerNumber = orders.customerNumber
where orderNumber is null