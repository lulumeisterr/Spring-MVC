<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1> CADASTRO DE CARRO </h1>

<form action="cadastrar" method="post">

	<fieldset>
		
		<div>
			<label for="ID_PLACA"> Placa </label>
				<input type="text" name="tPlaca" id="ID_PLACA" , placeholder =  "Digite a placa">
			</div>
			
		<div>
			<label for="ID_PRECO"> Preço </label>
				<input type="text" name="tPreco" id="ID_PRECO" , placeholder =  "Digite o preço">
			</div>
			
		<div>
			<input type="checkbox" name="vehicle"> automatico <br>
			</div>
			
			<div>
			
				<select name="Carros">
					  <option value="ford">Ford</option>
					  	<option value="fiat">Fiat</option>
					 		 <option value="tesla">Tesla</option>
					</select>
			</div>
			
			<input type="submit" value="OK">
			
		</fieldset>


</form>


<!-- Deixar os atributos name do HTML igual a classe Model -->

${key.tPlaca }
${key.tPreco }
${key.vehicle }
${key.Carros }
</body>
</html>
