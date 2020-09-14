USE classicmodels;
SELECT `status`, count(*) AS 'number of status'
from orders
 group by `status`
order by status DESC;
-- DESC sắp xếp giảm dần 
-- ASC sắp xếp tăng dần 
select status, sum(quantityOrdered * priceEach) as amount
from orders 
inner join orderdetails on orders.ordernumber = orderdetails.ordernumber
group by status;
select orderNumber, sum(quantityOrdered * priceEach) as total
from orderdetails
group by orderNumber;

--  GROUP BY với mệnh đề HAVING
-- Để lọc các nhóm được trả về bởi mệnh đề GROUP BY, chúng ta sử dụng mệnh đề HAVING. Truy vấn sau đây sử dụng mệnh đề HAVING để bao gồm tổng doanh thu của những năm lớn hơn năm 2003.

select year(orderDate) as year, sum(quantityOrdered * priceEach) as total
from orders 
inner join orderdetails on orders.orderNumber = orderdetails.orderNumber
where status = 'shipped'
group by year
having year > 2003;
select status from orders  where length(status)<10 group by status;