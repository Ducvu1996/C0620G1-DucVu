<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create gallery</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <style>
        h2,h4,p {
            font-family: "Times New Roman";
        }
        .card:hover {
            border: 1px solid #95999c;
        }
        .card {
            border-radius: 0%;
        }
        .card-img-top {
            border-radius: 0%;
        }
    </style>
</head>
<body>
    <div class="container-fluid">
       <div class="row">
            <div class="col-lg-12">
                <h2 class="font-weight-bold mt-3" style="font-size: 1.5em">Responsive Image Gallery</h2>
            </div>
       </div>
        <div class="row">
            <div class="col-lg-12">
                <h4  class="font-weight-bold mt-1" style="font-size: 1em" >Resize the browser window to see the effect.</h4>
            </div>
       </div>
        <div class="row">
            <div class="col-lg-3 col-sm-6">
                <div class="card" style="width: 20rem;">
                    <img src="img_fjords.jpg" class="card-img-top" alt="...">
                    <div class="card-body">
                        <p class="card-text">Add a description of the image here</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-sm-6">
                <div class="card" style="width: 20rem;">
                    <img src="img_forest.jpg" class="card-img-top" alt="...">
                    <div class="card-body">
                        <p class="card-text">Add a description of the image here</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-sm-6">
                <div class="card" style="width: 20rem;">
                    <img src="img_lights.jpg" class="card-img-top" alt="...">
                    <div class="card-body">
                        <p class="card-text">Add a description of the image here</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-sm-6">
                <div class="card" style="width: 20rem;">
                    <img src="img_mountains.jpg" class="card-img-top" alt="...">
                    <div class="card-body">
                        <p class="card-text">Add a description of the image here</p>
                    </div>
                </div>
            </div>



       </div>
        <div class="row">
            <div class="col-lg-12">
                <p class="text-justify mt-3">This example use media queries to re-arrange the images on different screen sizes: for screens larger than 700px wide, it will show four images side by side, for screens smaller than 700px, it will show two images side by side. For screens smaller than 500px, the images will stack vertically (100%).</p>
            </div>
       </div>

    </div>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>