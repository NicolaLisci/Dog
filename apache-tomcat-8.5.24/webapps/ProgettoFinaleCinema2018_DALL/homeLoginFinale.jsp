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

	<div class="container-fluid bg">
		<div class="row">



			<div class="col-md-4 col-sm-4 col-xs-12"></div>

			<div class="col-md-4 col-sm-4 col-xs-12">

				<form class="formContainer" action="Login" method="post">

					<h1>Login Form</h1>


					<div class="label">
						<label for="username">Email</label> <input type="text"
							class="form-control" name="username" placeholder="Email">


						<label for="password">Password</label> <input type="password"
							class="form-control" name="password" placeholder="Password">
					</div>

					<button type="submit" class="btn btn-success btn-block"
						value="LOGIN">Login</button>
				</form>


				<jsp:include page="errori.jsp" />

			</div>
			<div class="col-md-4 col-sm-4 col-xs-12"></div>
		</div>
	</div>




</body>
</html>