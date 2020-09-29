<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 9/28/2020
  Time: 8:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
    <h1>Product</h1>
    <p>
        <a href="/products?action=create">Create new product</a>
    </p>
    <form  method="post">
        <input type="text" name="nameProduct" placeholder="Search product by name" /> <br>
        <input type="submit" value="search">
    </form>
    <table border="1">
        <tr>

            <td>Name</td>
            <td>Code</td>
            <td>Price</td>
            <td>Country</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach items='${listProduct}' var="product">
            <tr>
                <td><a href="/products?action=view&id=${product.getId()}">${product.getNameProduct()}</a></td>
                <td>${product.getCodeProduct()}</td>
                <td>${product.getPrice()}</td>
                <td>${product.getCountry()}</td>
                <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
                <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>