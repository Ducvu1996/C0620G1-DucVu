<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Product</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="../css/product.css">
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
            $('#productTable').DataTable({
                "ordering": false,
                "dom": 'lrtip',
                "lengthChange":false,
                "displayLength": 5
            } );


        });

    </script>
    <style>
        .greenText{ background-color:green; }

        .blueText{ background-color:blue; }

        .redText{ background-color:red; }

        .blackText{ background-color:black
                    ;
                    color: white}

        .whiteText{ background-color:white; }

    </style>
</head>
<body>

<div class="container-lg">
    <div class="table-responsive">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-9">
                        <div class="row">
                            <div class="col-sm-4">
                                <h2><b>Product Details</b></h2>
                            </div>
                            <div class="col-sm-8">
                                <div class="row">
                                    <div class="col-sm-4">
                                        <a href="/" class="btn btn-success"><i class="material-icons">&#xe84f;</i><span >&nbsp;Home</span></a>
                                    </div>
                                    <div class="col-sm-4">
                                        <a href="#searchProductModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xe8b6;</i> <span >&nbsp;Search</span></a>
                                    </div>
                                    <div class="col-sm-4">
                                        <a href="#addProductModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span >&nbsp;Add</span></a>
                                    </div>

                                </div>

                            </div>
                        </div>
                    </div>
                    <div class="col-sm-3">
                        <div class="search-box">
                            <div class="input-group">
                                <input type="text" id="search" class="form-control" placeholder="Search by Name">
                                <span class="input-group-addon"><i class="material-icons">&#xE8B6;</i></span>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
            <table class="table table-striped"  id="productTable">
                <thead>
                <tr >
                    <th>ID</th>
                    <th style="width: 17%;">Product Name </th>
                    <th style="width: 10%;">Price</th>
                    <th style="width: 10%;">Quantity</th>
                    <th style="width: 15%;">Color</th>
                    <th style="width: 23%;">Description</th>
                    <th style="width: 15%;">Category</th>

                    <th>ACTIONS</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="product" items="${productList}">
                    <tr >
                        <td><c:out value="${product.getProduct_id()}"/></td>
                        <td><c:out value="${product.getProduct_name()}" /></td>
                        <td><c:out value="${product.getProduct_price()}" /></td>
                        <td><c:out value="${product.getProduct_quantity()}" /></td>

                        <td><c:out value="${product.getProduct_color()}"/></td>
                        <td><c:out value="${product.getProduct_description()}" /></td>
                        <td><c:out value="${product.getProduct_category()}" /></td>

                        <td>
                            <a data-toggle="modal" data-target="#editProductModal"
                               onclick="setProductInfor('${product.getProduct_id()}','${product.getProduct_name()}','${product.getProduct_price()}','${product.getProduct_quantity()}','${product.getProduct_color()}','${product.getProduct_category()}')"
                               href="#"   class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                            <a data-toggle="modal" data-target="#deleteProductModal" href="#" onclick="setProductId('${product.getProduct_id()}')" class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                        </td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </div>
    </div>
</div>

<!-- Add Modal HTML -->
<div id="addProductModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="/product" method="post" id="target">
                <input type="hidden" name="action"  value="create">
                <div class="modal-header">
                    <h4 class="modal-title">Add Product</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label>Product Name </label>
                        <input type="text" name="product_name"  class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Price</label>
                        <input type="number" name="product_price" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Quantity</label>
                        <input type="number" name="product_quantity" class="form-control" required>
                    </div>

                    <div class="form-group">
                        <label>Color</label>
<%--                        <input type="text" name="product_color" class="form-control" required>--%>
                        <select name="product_color"
                                onchange="this.className=this.options[this.selectedIndex].className"
                                >
                            <option class="whiteText" value="White" >White</option>
                            <option class="greenText" value="Green">Green</option>
                            <option class="redText"   value="Red" >Red</option>
                            <option class="blueText" value="Blue" >Blue</option>
                            <option class="blackText" value="Black" >Black</option>
                        </select>

                    </div>
                    <div class="form-group">
                        <label>Description</label>
                        <input type="text" name="product_description" class="form-control" required>
                    </div>

                    <div class="form-group">
                        <label>Category</label>
                        <select class="custom-select" name="product_category_id">
                            <c:forEach var="category" items="${categoryList}">
                                <option value="${category.getCategory_id()}"> ${category.getCategory_name()} </option>
                            </c:forEach>

                        </select>
                    </div>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-success"  value="Add Product">
                </div>
            </form>
        </div>
    </div>
</div>

<!-- Edit Modal HTML -->
<div id="editProductModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="/product" method="post">
                <input type="hidden" name="action" value="edit">
                <input id="product_id_edit" type="hidden" name="product_id" />
                <div class="modal-header">
                    <h4 class="modal-title">Edit Product</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label>Product Name </label>
                        <input type="text"  id="product_name" name="product_name"  class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Price</label>
                        <input type="number" id="product_price" name="product_price" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Quantity</label>
                        <input type="number" id="product_quantity" name="product_quantity" class="form-control" required>
                    </div>

                    <div class="form-group">
                        <label>Color</label>
                        <select name="product_color" id="product_color"
                                onchange="this.className=this.options[this.selectedIndex].className"
                        >
                            <option class="whiteText" value="White" >White</option>
                            <option class="greenText" value="Green">Green</option>
                            <option class="redText"   value="Red" >Red</option>
                            <option class="blueText" value="Blue" >Blue</option>
                            <option class="blackText" value="Black" >Black</option>
                        </select>
                    </div>
<%--                    <div class="form-group">--%>
<%--                        <label>Description</label>--%>
<%--                        <input type="text" name="product_description" class="form-control" required>--%>
<%--                    </div>--%>

                    <div class="form-group">
                        <label>Category</label>
                        <select class="custom-select" name="product_category_id">
                            <c:forEach var="category" items="${categoryList}">
                                <option id="${category.getCategory_name()}" value="${category.getCategory_id()}"> ${category.getCategory_name()} </option>
                            </c:forEach>

                        </select>
                    </div>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-success" value="Edit Product">
                </div>
            </form>
        </div>
    </div>
</div>
<!-- Delete Modal HTML -->
<div id="deleteProductModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form method="post" action="/product" id="formDelete">
                <input type="hidden" name="action" value="delete">
                <input id="product_id" type="hidden" name="product_id" />
                <div class="modal-header">
                    <h4 class="modal-title">Delete Customer</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <p>Are you sure you want to delete this customer?</p>
                    <p class="text-warning"><small>This action cannot be undone.</small></p>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit"  class="btn btn-danger" value="Delete">
                </div>
            </form>
        </div>
    </div>
</div>
<div id="searchProductModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form method="get"  >
                <input type="hidden" name="action" value="search">
                <div class="modal-header">
                    <h4 class="modal-title">Search Product By Name</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <input type="text" name="product_name" class="form-control" placeholder="Search" >
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
    function setProductId(product_id) {
        document.getElementById("product_id").value = product_id;

    }
    function setProductInfor(product_id , product_name, product_price , product_quantity , product_color , product_category) {
        document.getElementById("product_id_edit").value = product_id;
        document.getElementById("product_name").value = product_name;
        document.getElementById("product_price").value = product_price;
        document.getElementById("product_quantity").value = product_quantity;
        document.getElementById("product_color").value = product_color;
        document.getElementById(product_category).selected = true;

    }


</script>
<script>
    if ( window.history.replaceState ) {
        window.history.replaceState( null, null, window.location.href );
    }
</script>
</body>
</html>