<%@page import=" com.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script></head>
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
<h1 style = "text-align:center; color: green;">Store Products for Sale!</h1>
	<div id = "container">
	<%List<Product> products = (List<Product>) request.getAttribute("products"); %>
		<ul class="list-group">
			<li class="list-group-item list-group-item-warning"> <h4>
			<% for(Product prod:products) {
				out.println(prod.getPid()+ "---------------" + prod.getPname() + " ----------------	" + prod.getPprice()+ "<br/> <br/>");
				out.println("<hr>");
			} %>
			</h4>
			</li>
		</ul>
	</div>
</body>

</html>