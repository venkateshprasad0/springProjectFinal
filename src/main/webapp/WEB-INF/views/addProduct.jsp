<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Shopping App</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="home">Home</a></li>
				<li><a href="product">Get all products</a></li>
				<li><a href="addProduct">Add Product</a></li>
				<li><a href="updateProduct">Update Product</a></li>
				<li><a href="deleteProduct">Delete Product</a></li>
			</ul>
			<form class="navbar-form navbar-left" action="/action_page.php">
				<div class="input-group">
					<input type="text" class="form-control" placeholder="Search"
						name="search">
					<div class="input-group-btn">
						<button class="btn btn-default" type="submit">
							<i class="glyphicon glyphicon-search"></i>
						</button>
					</div>
				</div>
			</form>
		</div>
	</nav>
	<h1 style="text-align: center; color: green;">Add Product</h1>
	<div style="padding: 20px;">
		<form class="form-horizontal" action="added">
			<div class="form-group">
				<label class="control-label col-sm-2" for="pid">Product ID:</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" name="pid"
						placeholder="Enter Product ID">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="pname">Product
					Name:</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" name="pname"
						placeholder="Product Name">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="pprice">Product
					Price:</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" name="pprice"
						placeholder="Product Price">
				</div>
			</div>
			<br>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-success">Submit</button>
				</div>
			</div>
		</form>
	</div>
</body>
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
	crossorigin="anonymous"></script>
</html>