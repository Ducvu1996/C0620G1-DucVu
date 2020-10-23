<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 10/15/2020
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Update</title>
</head>
<body>
    <form:form action="/mail/create" method="post" modelAttribute="mail">
        <p>Language</p>
        <form:hidden path="id"></form:hidden>
        <form:select path="language" >
            <form:option value="English">English</form:option>
            <form:option value="Vietnamese">Vietnamese</form:option>
            <form:option value="Japanese">Japanese</form:option>
            <form:option value="Chinese">Chinese</form:option>
        </form:select>
        <br>
        <br>
        <p>Page Size</p>
        <form:select path="pageSize" >
            <form:option value="1">1</form:option>
            <form:option value="5">5</form:option>
            <form:option value="10">10</form:option>
        </form:select>
        <p>Emails per page</p>
        <br>
        <br>
        <c:if test="${mail.spamFilter==true}">
            <form:checkbox path="spamFilter" checked="checked"></form:checkbox>
        </c:if>
        <c:if test="${mail.spamFilter==false}">
            <form:checkbox path="spamFilter" ></form:checkbox>
        </c:if>
        <p>enable spams filter</p>
        <br>
        <br>
        <form:textarea path="signature" value="${mail.signature}" ></form:textarea>
        <input type="submit" value="Update" />
    </form:form>

</body>

<script>
    document.getElementById("language").value=${mail.language};
    document.getElementById("pageSize").value=${mail.pageSize};
</script>
</html>
