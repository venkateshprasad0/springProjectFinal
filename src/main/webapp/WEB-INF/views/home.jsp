<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Shopping App</title>
<style type="text/css">
/* Style the navigation menu */
.navbar {
	width: 100%;
	background-color: black;
	overflow: auto;
}

.navbar a {
	float: left;
	padding: 12px;
	color: white;
	text-decoration: none;
	font-size: 17px;
	width: 14%;
	text-align: center;
}

.banner {
	display: block;
	margin-left: auto;
	margin-right: auto;
	width: 100%;
}

h1 {
	display: inline;
	margin-left: auto;
	margin-right: auto;
	width: 100%;
	font-family: 'Times New Roman', Times, serif;
}

#abt {
	font-family: 'Times New Roman', Times, serif;
	font-style: italic;
}

p {
	font-family: 'Times New Roman', Times, serif;
}

.grid-container {
	display: grid;
	column-gap: 15px;
	grid-template-rows: 1fr 1fr 1fr 1fr;
	grid-template-columns: 1fr 1fr;
	background-color: gray;
	margin: 25px;
	padding: 15px;
	align-content: space-evenly;
	max-height: fit-content;
	width: 100%;
	margin-left: 0%;
}

.grid-container a {
	float: left;
	padding: 12px;
	color: white;
	text-decoration: none;
	font-size: 20px;
	width: 14%;
}

/* forms */
.signin, .register {
	width: 85%;
}

.signin input {
	width: 100%;
	padding: 10px;
	margin: 5px;
	border: 2px solid black;
	box-shadow: 0 10px 10px rgba(0, 0, 0, 0.22);
	width: 70%;
}

.register input {
	display: block;
	padding: 10px;
	margin: 5px;
	border: 2px solid black;
	box-shadow: 0 10px 10px rgba(0, 0, 0, 0.22);
	width: 70%;
}

.search {
	float: right;
	padding: 8px;
	margin: 5px;
	border: 2px solid black;
	box-shadow: 0 10px 10px rgba(0, 0, 0, 0.22);
	width: 40%;
}

.search input {
	width: 80%;
	padding: 3px;
}
</style>
</head>
<body>

	<nav class="navbar">
		<a href="addProduct"> Add Product</a> 
		<a href="updateProduct">Update
			Product</a> 
			<a href="deleteProduct">Delete Product</a> <a
			href=".\signin.html">Sign-in</a> <a href=".\registration.html">Get
			Customer Details</a> <a href="product">Get all products</a>


	</nav>
	<h1>Welcome to the store, the sale goes live today</h1>
	<div class="search">
		<label for="searchbar"><b>Search</b></label> <input type="text"
			placeholder="Search here..." name="searchbar">
	</div>
	<br>
	<br>
	<p>Lorem ipsum dolor sit amet consectetur adipisicing elit.
		Deserunt cum impedit id iusto laboriosam distinctio, aliquid, placeat
		saepe vel rerum, aperiam ad excepturi mollitia? Adipisci sunt
		repudiandae ipsum saepe architecto. Lorem ipsum dolor sit amet
		consectetur adipisicing elit. Quisquam commodi ipsum dignissimos eos
		rem mollitia, cumque unde atque sit harum recusandae nostrum
		aspernatur fugit, velit distinctio veniam veritatis et repudiandae?
		Lorem ipsum dolor, sit amet consectetur adipisicing elit. Unde maxime
		quod aut dolorem hic velit maiores quae ullam aliquid recusandae,
		cupiditate repellendus corporis temporibus laborum dicta at!
		Dignissimos, porro consequatur. Lorem ipsum dolor sit amet consectetur
		adipisicing elit. Aspernatur accusantium quia modi nobis laborum
		exercitationem, similique officiis quos quod nihil fugiat vel impedit
		ratione rem commodi tempore. Ipsam, voluptatum harum. Lorem ipsum
		dolor sit amet consectetur adipisicing elit. Voluptates optio
		quisquam, sint reiciendis cupiditate accusantium id modi numquam
		alias, temporibus nulla deserunt hic dolorem ducimus voluptatem fugiat
		doloremque quidem omnis.</p>
	<section id=abt>
		<h2>About Us</h2>
		<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Sed
			amet porro dolorum adipisci error, et perferendis exercitationem
			nulla eaque fuga obcaecati ad similique libero, quibusdam
			consequatur, veritatis laboriosam officia reiciendis. Lorem ipsum
			dolor sit amet consectetur adipisicing elit. Officia quo tempore
			optio? Sequi sit beatae voluptatum omnis placeat. Illo repellat iste
			beatae quis, harum eligendi suscipit recusandae sunt illum
			praesentium. Lorem ipsum dolor sit amet consectetur adipisicing elit.
			Deserunt similique eum quo reprehenderit obcaecati, iste, esse
			doloremque vitae fugit possimus deleniti consequuntur aliquid
			eligendi minima in? Sunt tempore error placeat!</p>

		<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Sequi
			illo quod sint numquam laborum voluptate, dolorum debitis nostrum
			aliquam, maiores dolorem veritatis quaerat consequatur eveniet sunt,
			pariatur amet aperiam excepturi! Lorem ipsum dolor sit, amet
			consectetur adipisicing elit. Praesentium, eum similique fuga
			architecto beatae eveniet magnam optio? Vero aspernatur, voluptates
			deleniti fugit unde ratione enim quidem necessitatibus eius suscipit
			labore! Lorem ipsum dolor sit amet, consectetur adipisicing elit.
			Assumenda nam molestias, fugiat ea quam aspernatur ipsa placeat,
			dicta corrupti quae et tempore, architecto nostrum quis. Obcaecati
			voluptatem suscipit veniam odio?</p>
	</section>

	<footer>
		<p style="text-align: center;">© 2022 Designed by Venkatesh Prasad
			V</p>
	</footer>
</body>

</html>