<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 9/25/2020
  Time: 9:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
    <form action="/Calculation" method="get">
      Product Name:<input type="text" name="nameProduct"> <br>
      List Price:<input type="text" name="listPrice"><br>
      Discount Percent:<input type="text" name="discountPercent"><br>
      <input type="submit" value="submit" >
    </form>
  </body>
</html>
