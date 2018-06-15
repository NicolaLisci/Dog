<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<title></title>
</head>
<body>


	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="#" class="active" id="Login-link">Login</a>
							</div>
							<div class="col-xs-6">
								<a href="#" class="active" id="Registrazione-link">Registrazione nuovo utente</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="Login-form" action="Login" method="post" role="form"
									style="display: block;">
									<div class="form-group">
										<input type="mail" name="email" id="email" tabindex="1"
											class="form-control" placeholder="Email" value="">
									</div>
									<div class="form-group">
										<input type="password" name="password" id="password"
											tabindex="2" class="form-control" placeholder="Password">
									</div>
									
									
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" id="login-submit"
													tabindex="4" class="form-control btn btn-login"
													value="Log In">
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
											</div>
										</div>
									</div>
									
                                	</form> 
								
								<form id="Registrazione-form" action="Registrazione" method="post"
									role="form" style="display: none;">
									<div class="form-group">
										<input type="text" name="username" id="username"
											tabindex="1" class="form-control" placeholder="Nome utente"
											value="">
									</div>
									<div class="form-group">
										<input type="text" name="nome" id="nome" tabindex="1"
											class="form-control" placeholder="Nome" value="">
									</div>

									<div class="form-group">
										<input type="text" name="cognome" id="cognome" tabindex="1"
											class="form-control" placeholder="Cognome" value="">
									</div>
									<div class="form-group">
									<label for="gender" class="cols-sm-2 control-label">Sesso</label>
									<div class=".radio-inline">
 									<label>
 									<input type="radio" name="gender" value="maschio">	Maschio</label>
									</div>
									<div class=".radio-inline">
 									<label>
 									<input type="radio" name="gender" value="femmina">	Femmina</label>
									</div>
									<div class=".radio-inline">
  									<label>
  									<input type="radio" name="gender" value="altro">	Altro</label>
									</div>
									<div class="form-group">
										<input type="email" name="email" id="email" tabindex="1"
											class="form-control" placeholder="Email" value="">
									</div>
									<div class="form-group">
										<input type="password" name="password" id="password"
											tabindex="2" class="form-control" placeholder="Password">
									</div>
									<div class="form-group">
										<p id="err"></p><!-- questo seve per fare il controllo della password non eliminatelo -->
									</div>
									<div class="form-group">
										<input type="password" name="confermaPassword"
											id="confermaPassword" tabindex="2" class="form-control"
											placeholder="Conferma Password">
									</div>
									<div class="form-group">
										<input type="data" name="nascita" id="nascita"
											tabindex="1" class="form-control" placeholder="Data Nascita"
											value="">
									</div>
									<div class="form-group">
										<input type="text" name="citta" id="citta" tabindex="1"
											class="form-control" placeholder="Citta" value="">
									</div>
									<div class="form-group">
										<input type="text" name="indirizzo" id="indirizzo"
											tabindex="1" class="form-control" placeholder="Indirizzo"
											value="">
									</div>
									<div class="form-group">
										<input type="text" name="numero" id="numero" tabindex="1"
											class="form-control" placeholder="Telefono"
											value="">
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<button onclick="controlloPass() "  name="registrati" id="registrati"	tabindex="4" class="form-control btn btn-register"
													value="Registrati">Registrati</button>
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
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
	<script type="text/javascript">
	$(function() {

	    $('#Login-link').click(function(e) {
			$("#Login-form").delay(100).fadeIn(100);
	 		$("#Registrazione-form").fadeOut(100);
			$('#Registrazione-link').removeClass('active');
			$(this).addClass('active');
			e.preventDefault();
		});
		$('#Registrazione-link').click(function(e) {
			$("#Registrazione-form").delay(100).fadeIn(100);
	 		$("#Login-form").fadeOut(100);
			$('#Login-link').removeClass('active');
			$(this).addClass('active');
			e.preventDefault();
		});

	});
	</script>
	<script>
	function controlloPass() {
	    var ps = document.getElementById("password").value;
	    var psc = document.getElementById("confermaPassword").value;
	   
	     if(ps==psc){
	    document.getElementById("Registrazione-form").submit();
	      }else{
	        document.getElementById("err").innerHTML = "Le password non corrispondono <br>";}
	}
	</script>

</body>
</html>

