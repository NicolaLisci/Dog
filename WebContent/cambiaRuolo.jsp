<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<title>Cambia ruolo</title>
</head>
<body>


	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-sm-6 col-sm-offset-3">
								<h3>cambia ruolo</h3>
							</div>
								<div class="col-sm-6 col-sm-offset-3">
								
							</div>
							<div class="col-sm-6 col-sm-offset-3">
								<h4>Ruolo</h4>
								<select name="idRuolo" class="form-control"
									placeholder="idRuolo">
									<option value="0">Admin</option>
									<option value="1">Dipendente</option>
									<option value="2">Utente</option>
									<option value="3">Dogsitter</option>
									<option value="4">Toelettatore</option>
									<option value="5">Addestratore</option>

									<div class="form-group"></div>
									<div class="row">
										<div class="col-sm-6 col-sm-offset-3">
								</select> <input type="submit" value="INVIA"
									class="form-control btn btn-register" />
							</div>

						</div>
</body>
</html>

<style>
body {
	padding-top: 90px;
}

.panel-login {
	border-color: #ccc;
	-webkit-box-shadow: 0px 2px 3px 0px rgba(0, 0, 0, 0.2);
	-moz-box-shadow: 0px 2px 3px 0px rgba(0, 0, 0, 0.2);
	box-shadow: 0px 2px 3px 0px rgba(0, 0, 0, 0.2);
}

.panel-login>.panel-heading {
	color: #00415d;
	background-color: #fff;
	border-color: #fff;
	text-align: center;
}

.panel-login>.panel-heading a {
	text-decoration: none;
	color: #666;
	font-weight: bold;
	font-size: 15px;
	-webkit-transition: all 0.1s linear;
	-moz-transition: all 0.1s linear;
	transition: all 0.1s linear;
}

.panel-login>.panel-heading a.active {
	color: #029f5b;
	font-size: 18px;
}

.panel-login>.panel-heading hr {
	margin-top: 10px;
	margin-bottom: 0px;
	clear: both;
	border: 0;
	height: 1px;
	background-image: -webkit-linear-gradient(left, rgba(0, 0, 0, 0),
		rgba(0, 0, 0, 0.15), rgba(0, 0, 0, 0));
	background-image: -moz-line
}
</style>

</body>
</html>