
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 9/29/2020
  Time: 10:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<!DOCTYPE html>--%>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Employee manager</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="../css/employee.css">
<%--    <link rel="stylesheet" href="bootstrap413/css/bootstrap.min.css">--%>
<%--    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css">--%>

    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

    <script>
        $(document).ready(function(){
            // Activate tooltip
            $('[data-toggle="tooltip"]').tooltip();

            // Select/Deselect checkboxes
            let checkbox = $('table tbody input[type="checkbox"]');
            $("#selectAll").click(function(){
                if(this.checked){
                    checkbox.each(function(){
                        this.checked = true;
                    });
                } else{
                    checkbox.each(function(){
                        this.checked = false;
                    });
                }
            });
            checkbox.click(function(){
                if(!this.checked){
                    $("#selectAll").prop("checked", false);
                }
            });
            // $('#tableEmployee').dataTable(
            //     {
            //         "dom":'lrtip',
            //         'lengthChange':false,
            //         "pageLength":5
            //     }
            // );
        });

    </script>
</head>
<body>

<div class="container-xl">
    <div class="table-responsive">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-6">
                        <h2>Manage <b>Employees</b></h2>
                    </div>
                    <div class="col-sm-6">

                        <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add</span></a>
                        <a href="#searchEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xe8b6;</i> <span>Search</span></a>
                        <a href="/" class="btn btn-success"><i class="material-icons">&#xe84f;</i> <span>Home</span></a>
                    </div>
                </div>
            </div>
            <table class="table table-striped table-hover" id="tableEmployee">
                <thead>
                <tr>

                    <th>ID</th>
                    <th>NAME</th>
                    <th>BIRTHDAY</th>
                    <th>EMAIL</th>
                    <th>ADDRESS</th>
                    <th>USER_NAME</th>
                    <th>ACTION</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="employee" items="${listEmployee}">
                    <tr>
                        <td><c:out value="${employee.employee_id}"/></td>
                        <td><c:out value="${employee.employee_name}"/></td>
                        <td><c:out value="${employee.employee_birthday}"/></td>
                        <td><c:out value="${employee.employee_email}"/></td>
                        <td><c:out value="${employee.employee_address}"/></td>
                        <td><c:out value="${employee.user_name}"/></td>
                        <td>

                            <a href="/employee?action=edit&employee_id=${employee.employee_id}" class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>

                            <a data-toggle="modal" data-target="#deleteEmployeeModal" href="#" onclick="setEmployeeId('${employee.employee_id}')" class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div class="clearfix">
<%--                <div class="hint-text">Showing <b>5</b> out of <b>25</b> entries</div>--%>
                <ul class="pagination">
                    <li class="page-item disabled"><a href="#">Previous</a></li>
                    <li class="page-item active"><a href="#" class="page-link">1</a></li>
                    <li class="page-item"><a href="#" class="page-link">2</a></li>
                    <li class="page-item "><a href="#" class="page-link">3</a></li>
                    <li class="page-item"><a href="#" class="page-link">4</a></li>
                    <li class="page-item"><a href="#" class="page-link">5</a></li>
                    <li class="page-item"><a href="#" class="page-link">Next</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!-- Add Modal HTML -->
<div id="addEmployeeModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="/employee" method="post">
                <input type="hidden" name="action" value="create">
                <div class="modal-header">
                    <h4 class="modal-title">Add Employee</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label>Name</label>
                        <input type="text" name="employee_name" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Birthday</label>
                        <input type="text" name="employee_birthday" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>ID card</label>
                        <input type="text" name="employee_id_card" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Salary</label>
                        <input type="text" name="employee_salary" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Phone</label>
                        <input type="text" name="employee_phone" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Email</label>
                        <input type="text" name="employee_email" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Address</label>
                        <input type="text" name="employee_address" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Position</label>
                        <select class="custom-select" name="position_id">
                            <c:forEach var="position" items="${positionList}" >
                                <option value="${position.getPosition_id()}">${position.getPosition_name()} </option>
                            </c:forEach>
                        </select>

                    </div>
                    <div class="form-group">
                        <label>education degree </label>
                        <select class="custom-select" name="education_degree_id">
                            <c:forEach var="education_degree" items="${educationDegreeList}" >
                                <option value="${education_degree.getEducation_degree_id()}">${education_degree.getEducation_degree_name()}</option>
                            </c:forEach>
                        </select>

                    </div>
                    <div class="form-group">
                        <label>Division</label>
                        <select class="custom-select" name="division_id">
                            <c:forEach var="division" items="${divisionList}" >
                                <option value="${division.getDivision_id()}"> ${division.getDivision_name()} </option>
                            </c:forEach>
                        </select>

                    </div>
                    <div class="form-group">
                        <label>User name</label>
                        <input type="text" name="user_name" class="form-control" placeholder="User name" required>
                    </div>
                    <div class="form-group">
                        <label>Password</label>
                        <input type="password"  class="form-control" placeholder="Password" id="password" required>
                    </div>
                    <div class="form-group">
                        <label>Confirm password</label>
                        <input type="password" name="password"  class="form-control" placeholder="Confirm Password" id="confirm_password" required>
                    </div>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-success" value="Add Employee">
                </div>
            </form>
        </div>
    </div>
</div>
<!-- Edit Modal HTML -->



<!-- Delete Modal HTML -->
<div id="deleteEmployeeModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form method="post" action="/employee" id="formDelete">
                <input type="hidden" name="action" value="delete">
                <input id="employee_id" type="hidden" name="employee_id" />
                <div class="modal-header">
                    <h4 class="modal-title">Delete Employee</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <p>Are you sure you want to delete this employee?</p>
                    <p class="text-warning"><small>This action cannot be undone.</small></p>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-danger" value="Delete">
                </div>
            </form>
        </div>
    </div>
</div>
<!-- Search Modal HTML -->
<div id="searchEmployeeModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form method="get"  >
                <input type="hidden" name="action" value="search">
                <div class="modal-header">
                    <h4 class="modal-title">Search Employee</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <input type="text" name="employee_name" class="form-control" placeholder="Search" >
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-danger" value="Search">
                </div>
            </form>
        </div>
    </div>
</div>
<script>
    let password = document.getElementById("password")
        , confirm_password = document.getElementById("confirm_password");

    function validatePassword(){
        if(password.value != confirm_password.value) {
            confirm_password.setCustomValidity("Passwords Don't Match");
        } else {
            confirm_password.setCustomValidity('');
        }
    }

    password.onchange = validatePassword;
    confirm_password.onkeyup = validatePassword;

    function setEmployeeId(employee_id) {
        document.getElementById("employee_id").value = employee_id;

    }

    // function submitFormDelete() {
    //     document.getElementById("formDelete").submit();
    // }
</script>
<script>
    if ( window.history.replaceState ) {
        window.history.replaceState( null, null, window.location.href );
    }
</script>
<script>
    $(document).ready(function() {
        $('#tableEmployee').dataTable( {
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        } );
    } );
</script>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
</body>
</html>