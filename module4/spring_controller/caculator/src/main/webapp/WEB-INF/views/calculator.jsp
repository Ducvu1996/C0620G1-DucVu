<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 10/14/2020
  Time: 5:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <form action="/result">
        <input type="number" name="number1" placeholder="input a number"><br>
        <input type="number" name="number2" placeholder="input a number"><br>
        <input type="radio" id="addition" name="operator" value="+">
        <label for="addition">Addition</label><br>
        <input type="radio" id="subtraction" name="operator" value="-">
        <label for="subtraction">Subtraction</label><br>
        <input type="radio" id="multiplication" name="operator" value="*">
        <label for="multiplication">multiplication</label><br>
        <input type="radio" id="division" name="operator" value="/">
        <label for="division">Division</label><br>

        <input type="submit" value="submit">
    </form>
    <h2>${result}</h2>
</body>
</html>
