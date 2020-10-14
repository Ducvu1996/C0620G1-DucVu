<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 9/30/2020
  Time: 8:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<!DOCTYPE html>--%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Edit</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="../css/employee.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <style>
        form {
            width: 500px;
            margin-left: 100px;
            margin-top: 30px;
        }
    </style>
</head>
<body>

    <form method="post">
        <fieldset>
             <h4 class="modal-title">Edit Employee</h4>
            <c:if test="${employee != null}">
                <input type="hidden" name="employee_id" value="<c:out value='${employee.employee_id}' />"/>
            </c:if>
            <div class="form-group">
                <label >Name</label>
                <input type="text"  name="employee_name" value="${employee.employee_name}" class="form-control"  >
            </div>

            <div class="form-group">
                <label >Name</label>
                <input type="text"  name="employee_birthday" value="${employee.employee_birthday}" class="form-control"  >
            </div>

             <div class="form-group">
                <label >Name</label>
                <input type="text"  name="employee_email" value="${employee.employee_email}" class="form-control"  >
            </div>

             <div class="form-group">
                <label >Name</label>
                <input type="text"  name="employee_address" value="${employee.employee_address}" class="form-control"  >
            </div>


            <div class="modal-footer">
                <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                <input type="submit" class="btn btn-info" value="Save">
            </div>
        </fieldset>

    </form>

</body>
</html>
