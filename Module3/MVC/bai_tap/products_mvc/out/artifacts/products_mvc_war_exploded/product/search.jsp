<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 9/28/2020
  Time: 11:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <table border="1">
        <tr>

            <td>Name</td>
            <td>Code</td>
            <td>Price</td>
            <td>Country</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
            <tr>
                <td><a href="/products?action=view&id=${product.getId()}">${product.getNameProduct()}</a></td>
                <td>${product.getCodeProduct()}</td>
                <td>${product.getPrice()}</td>
                <td>${product.getCountry()}</td>
                <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
                <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
            </tr>
    </table>
</body>
</html>
