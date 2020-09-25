<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 9/24/2020
  Time: 1:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/login.css">

</head>
<body>
  <form action="/loginServlet" method="post">
      <div class="imgcontainer">
          <img src="1.jpg" alt="Avatar" class="avatar">
      </div>

      <div class="container">
          <label for="uname"><b>Username</b></label>
          <input type="text" placeholder="Enter Username" name="username" required>

          <label for="psw"><b>Password</b></label>
          <input type="password" placeholder="Enter Password" name="password" required>

          <button type="submit">Login</button>
          <label>
              <input type="checkbox" checked="checked" name="remember"> Remember me
          </label>
      </div>

      <div class="container" style="background-color:#f1f1f1">
          <button type="button" class="cancelbtn">Cancel</button>
          <span class="psw">Forgot <a href="#">password?</a></span>
      </div>
  </form>

<script src="js/bootstrap.min.js"></script>
</body>

</html>
