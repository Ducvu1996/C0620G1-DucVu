<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 10/15/2020
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mail Box</title>
</head>
<body>
    <table border="1px">
        <tr>
            <th>Id</th>
            <th>Language</th>
            <th>Page size</th>
            <th>Spams filter</th>
            <th>Signature</th>
            <th>Action</th>
        </tr>
        <c:forEach var="mail" items="${listMail}">
            <tr>
                <td>${mail.id}</td>
                <td>${mail.language}</td>
                <td>${mail.pageSize}</td>

                <td><c:if test="${mail.spamFilter==true}"> enable </c:if>

                    <c:if test="${mail.spamFilter==false}"> disable </c:if></td>


                <td>${mail.signature}</td>
                <td><a href="/mail/update/${mail.id}">edit</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
