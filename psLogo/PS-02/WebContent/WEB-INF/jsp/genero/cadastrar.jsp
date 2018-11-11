<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Chamando o meu template -->
<%@taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tags:template titulo="Pagina de Cadastro">


<c:if test="${not empty msg}">
		<div>
			<div class="alert alert-sucess">${msg}</div>
		</div>
</c:if>

	<h1>Cadastro de Genero</h1>


	<form action="cadastrar" method="post">
		
		 	<div class="form-group">
		 		<label for="idNome">Nome</label>
				<input class="form-control" type="text" name="nome" placeholder="Digite o nome do genero"/>		 	
		 	</div>
		 	
		 	
		 	<input type="submit" class="btn btn-primary" value="Cadastrar">
		 	
	</form>



</tags:template>
