<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<style>

body{

margin-left:10%;
margin-right:10%;
position: relative;
margin-top:10%;
background: #E0FFFF;

}


div{

margin-left: 30%;
margin-right:30%;

}

</style>

<!-- Definindo a url para a controller apos carregar a pagina -->

<form action="cadastrar" method="post">

<fieldset> 
	
	<legend class="EDIT">ACADEMIA</legend>
	<div>
	<label for="id_name"> NOME : </label>
		<input type="text" name="nome" id="id_name" placeholder="Digite o seu nome">
		</div>
		
		<div>
		<label for="id_plano"> PLANO </label>
		<select name="plano" id="id_plano">
			<option value="b">Black</option>
				<option value="w">White</option>
			</select>
		</div>
	
		<div>
		<label for="id_matriculado">Matriculado</label>
		<input type="checkbox" name="matricula" id="id_matriculado">
		</div>
		
		<div>
			<label>Masculino</label><input type="radio" name="genero" value="Masculino">
			<br>
			<label>Feminino</label><input type="radio" name="genero" value="Feminino">
		</div>
		
	</fieldset>
		<input type="submit" value="Enviar">
</form>

</body>
</html>