<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 10/14/2020
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
    <form action="/result">
        <h3>Sandwich Condiments</h3>
        <input type="checkbox" id="lettuce" name="condiment" value="lettuce">
        <label for="lettuce">lettuce</label><br>
        <input type="checkbox" id="tomato" name="condiment" value="tomato">
        <label for="tomato">Tomato</label><br>
        <input type="checkbox" id="mustard" name="condiment" value="mustard">
        <label for="mustard">Mustard</label><br>
        <input type="checkbox" id="sprouts" name="condiment" value="sprouts">
        <label for="sprouts">Sprouts</label> <br>
        <input type="hidden" name="condiment">
         <input type="submit" value="Save">

    </form>

</body>
</html>
