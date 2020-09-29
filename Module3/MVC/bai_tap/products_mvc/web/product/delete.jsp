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
    <title>Deleting product</title>
</head>
<body>
    <h1>Delete product</h1>
    <p>
        <a href="/products">Back to product list</a>
    </p>
    <form method="post">
    <h3>Are you sure?</h3>
        <fieldset>
            <p>
                Are you sure you want to delete ${product.getNameProduct()}?<br>


            </p>
                  <input type="radio" name="confirm" value="yes">  Yes <br>
                  <input type="radio" name="confirm" value="no"> No<br>
                  <input type="submit" value="Delete customer"><br>
                 <a href="/products">Back to customer list</a>

            </table>
        </fieldset>
    </form>
</body>
</html>