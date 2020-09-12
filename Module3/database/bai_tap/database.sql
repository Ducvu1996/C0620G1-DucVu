SELECT * FROM classicmodels.customers;
SELECT customerName, phone, city, country FROM customers ;
SELECT * FROM customers WHERE customerName = 'Atelier Graphique';
SELECT * FROM customers WHERE customername like '%A%' and city in ('NYC') ;
SELECT * FROM customers WHERE city IN ('Nantes',' Las Vegas',' Warszawa','NYC') ;
SELECT * FROM customers WHERE country IN ('USA') ;
SELECT * FROM customers WHERE country IN ('USA') and city in ('NYC');