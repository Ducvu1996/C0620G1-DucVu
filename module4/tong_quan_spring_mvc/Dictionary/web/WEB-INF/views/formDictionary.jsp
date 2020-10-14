<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 10/14/2020
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
    <form action="/translate">
        <input type="text" name="word" PLACEHOLDER="input a word" >
        <input type="submit" value="Translate">
    </form>
    <h2>${result}</h2>
</body>
</html>
