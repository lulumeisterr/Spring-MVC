<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="cadastrar"  method="post">
	
	<fieldset>
		<legend>Plano</legend>
		
			<div class="container">
				
				<div>
					<label for="id_plano">Plano : </label>
					<select name="plano" id="id_plano">
						<option value="1">black</option>
						<option value="2">Simple</option>
					</select>
				</div>
				
				<div>
					<label for="id_valor">VALOR : </label>
					<input type="text" name="valor" id="id_valor" placeholder="DIGITE O VALOR">
				</div>
				
				<div>
				<label for="id_texto">Sobre</label>
				<textarea name="texto" rows="4" cols="50"></textarea>
				</div>
					
				<input type="submit" value="Ok">
				
				<br>
				
				<fieldset>
					${msg}
					<h1>Tipo plano ${key.plano} </h1>
					<h1>Valor do plano ${key.valor} </h1>
					<h1>Texto ${key.texto } </h1>
				</fieldset>
				
							
				</div>
		</fieldset>
	
	
	
	</form>

</body>
</html>