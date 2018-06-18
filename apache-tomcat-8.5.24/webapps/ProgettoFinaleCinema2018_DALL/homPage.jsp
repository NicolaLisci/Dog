<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Cinema 4Rum</title>

<meta charset="utf-8" />


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="stile.css">


<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>


<meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>

<body>

	<header class="logo">
	<h1 id="id">Logo</h1>
	</header>

	<div class="container-fluid">
		<!-- Second navbar for categories -->
		<nav class="navbar navbar-default">
		<div class="container">
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="navbar-collapse-3">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Home</a></li>
					<li><a href="#">About</a></li>
					<li><a href="#">Services</a></li>
					<li><a href="#">Works</a></li>
					<li><a href="#">News</a></li>
					<li><a href="#">Contact</a></li>
					<li><a
						class="btn btn-default btn-outline btn-circle collapsed"
						data-toggle="collapse" href="#nav-collapse3" aria-expanded="false"
						aria-controls="nav-collapse3">Search</a></li>
				</ul>
				<div class="collapse nav navbar-nav nav-collapse slide-down"
					id="nav-collapse3">
					<form class="navbar-form navbar-right" role="search">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search" />
						</div>
						<button type="submit" class="btn btn-danger">
							<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
						</button>
					</form>
				</div>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container --> </nav>
		<!-- /.navbar -->
</body>
</html>