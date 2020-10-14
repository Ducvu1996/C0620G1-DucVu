<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 10/14/2020
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert</title>
</head>
<body>
    <form action="/convert">
        <input type="text" name="mount" PLACEHOLDER="USD" >
        <input type="submit" value="Convert">
    </form>
    <h2>${result}</h2>
</body>
</html>
