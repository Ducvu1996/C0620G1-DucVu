<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 9/25/2020
  Time: 9:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show</title>
</head>
<body>
    <h2>Name Product</h2> <%=request.getAttribute("nameProduct")%>
    <h2>Discount Amount</h2> <%=request.getAttribute("discountAmount")%>
    <h2>Discount price</h2> <%=request.getAttribute("discountPrice")%>

</body>
</html>
