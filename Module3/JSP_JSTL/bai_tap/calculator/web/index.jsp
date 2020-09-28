<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 9/25/2020
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
  <h2>Simple Calculator</h2>
  <form action="/calculatorServlet" method="get">
      <fieldset>
            <label>First Operand</label>
            <input type="number" name="firstOperand" /> <br>
            <label>Operator</label>
            <select name="operator">
                <option value="+">Addition</option>
                <option value="-">Subtraction</option>
                <option value="*">multiplication</option>
                <option value="/">division</option>
            </select>
               <br>
            <label>Second Operand</label>
            <input type="number" name="secondOperand" /> <br>

          <input type="submit" value="calculator" name="submit"/>

      </fieldset>
  </form>
  </body>
</html>
