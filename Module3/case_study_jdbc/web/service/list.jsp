<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Service</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="../css/customer.css">
    <link rel="stylesheet" href=" https://cdn.datatables.net/1.10.22/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="  https://cdn.datatables.net/1.10.22/css/jquery.dataTables.min.css">

    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.22/js/dataTables.bootstrap4.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>

    <script>
        $(document).ready(function(){
            // Activate tooltips
            $('[data-toggle="tooltip"]').tooltip();

            // Filter table rows based on searched term
            $("#search").on("keyup", function() {
                let term = $(this).val().toLowerCase();
                $("table tbody tr").each(function(){
                    $row = $(this);
                    let name = $row.find("td:nth-child(2)").text().toLowerCase();
                    console.log(name);
                    if(name.search(term) < 0){
                        $row.hide();
                    } else{
                        $row.show();
                    }
                });

            });

             $('#serviceTable').DataTable({
                "lengthChange":false,
                "displayLength": 5
            } );





        });

    </script>
</head>
<body>

<div class="container-lg">
    <div class="table-responsive">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-6">
                                <h2>Customer <b>Details</b></h2>
                            </div>
                            <div class="col-sm-6">
                                <div class="row">
                                    <div class="col-sm-6">
                                        <a href="/" class="btn btn-success"><i class="material-icons">&#xe84f;</i> <span>Home</span></a>
                                    </div>
                                    <div class="col-sm-6">
                                        <a href="#addCustomerModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add</span></a>
                                    </div>

                                </div>

                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6">
<%--                        <div class="search-box">--%>
<%--                            <div class="input-group">--%>
<%--                                <input type="text" id="search" class="form-control" placeholder="Search by Name">--%>
<%--                                <span class="input-group-addon"><i class="material-icons">&#xE8B6;</i></span>--%>
<%--                            </div>--%>
<%--                        </div>--%>
                    </div>
                </div>
            </div>
            <table class="table table-striped" id="serviceTable" >
                <thead>
                <tr>
                    <th>ID</th>
                    <th style="width: 15%;">NAME</th>
                    <th style="width: 15%;">COST</th>
                    <th style="width: 15%;">NUMBER OF FLOOR</th>
                    <th style="width: 15%;">RENT TYPE</th>
                    <th style="width: 15%;">SERVICE TYPE</th>

                </tr>
                </thead>
                <tbody>
                <c:forEach var="service" items="${serviceList}">
                    <tr>
                        <td><c:out value="${service.getService_id()}"/></td>
                        <td><c:out value="${service.getService_name()}" /></td>
                        <td><c:out value="${service.getService_cost()}" /></td>

                        <td><c:out value="${service.getNumber_of_floors()}" /></td>
                        <td><c:out value="${service.getRent_type_name()}" /></td>
                        <td><c:out value="${service.getService_type_name()}" /></td>

                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </div>
    </div>
</div>

<!-- Add Modal HTML -->
<div id="addCustomerModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="/service" method="post" >
                <input type="hidden" name="action"  value="create">
                <div class="modal-header">
                    <h4 class="modal-title">Add Service</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label>Name Service</label>
                        <input type="text" name="service_name"  class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Service area</label>
                        <input type="number" name="service_area" class="form-control" required>
                    </div>

                    <div class="form-group">
                        <label>Service cost</label>
                        <input type="number" name="service_cost" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Service max people</label>
                        <input type="number" name="service_max_people" class="form-control" required>
                    </div>

                    <div class="form-group">
                        <label>Standard room</label>
                        <input type="text" name="standard_room" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Description</label>
                        <input type="text" name="description_other_convenience" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Pool area</label>
                        <input type="number" name="pool_area" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Number of floor</label>
                        <input type="number" name="number_of_floors" class="form-control" required>
                    </div>

                    <div class="form-group">
                        <label>Service type</label>
                        <select class="custom-select" name="rent_type_id">
                            <c:forEach var="rentType" items="${rentTypeList}">
                                <option value="${rentType.getRent_type_id()}"> ${rentType.getRent_type_name()} </option>
                            </c:forEach>

                        </select>
                    </div>

                    <div class="form-group">
                        <label>Service type</label>
                        <select class="custom-select" name="service_type_id">
                            <c:forEach var="serviceType" items="${serviceTypeList}">
                                <option value="${serviceType.getService_type_id()}"> ${serviceType.getService_type_name()} </option>
                            </c:forEach>

                        </select>
                    </div>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-success"  value="Add Customer">
                </div>
            </form>
        </div>
    </div>
</div>

<script>


</script>
<script>
    if ( window.history.replaceState ) {
        window.history.replaceState( null, null, window.location.href );
    }
</script>
</body>
</html>