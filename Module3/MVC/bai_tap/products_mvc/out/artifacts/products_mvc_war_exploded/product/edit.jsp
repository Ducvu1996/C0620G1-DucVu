<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 9/28/2020
  Time: 8:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit customer</title>
</head>
<body>
<h1>Edit customer</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to customer list</a>
</p>
<form  method="post">
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="nameProduct" value="${product.getNameProduct()}"></td>
            </tr>
            <tr>
                <td>Code: </td>
                <td><input type="text" name="codeProduct"  value="${product.getCodeProduct()}"></td>
            </tr>
            <tr>
                <td>Price: </td>
                <td><input type="text" name="price"  value="${product.getPrice()}"></td>
            </tr>
            <tr>
                <td>Country: </td>
                <td><input type="text" name="country"  value="${product.getCountry()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update product"></td>

            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>