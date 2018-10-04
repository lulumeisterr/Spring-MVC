<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!-- Chamando meu template -->   
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tags:template titulo="Cadastro">


<c:if test="${not empty msg}">
		<div class="alert alert-success">${msg }</div>
	</c:if>

<form action="cadastrar" method="post">

	<div>
		<label class="form-group">Nome</label>
		<input class="form-control" type="text" name="nome" placeholder="Digite o nome">
	</div>
	
	<div>
		<label class="form-group">Senha</label>
		<input class="form-control" type="password" name="senha" placeholder="Digite a senha">
	</div>

	<!-- Por Data em Texto -->
	<div>
		<label class="form-group">Data</label>
		<input class="form-control" type="text" name="data" placeholder="dd/MM/yyyy">
	</div>
	
	<!-- Campo -->
	<br>
	<div>
		<textarea name="descricao" rows="4" cols="50"></textarea>
	</div>
	
	
	<!-- Campo Boolean -->
	
	<div>
		<label class="form-group">Are you dogMal ?</label>
		<input type="radio" name="aprovado" placeholder="Digite se vc é um dogmal">
	</div>
	

	<div>
		<input type="submit" value="Enviar" class="btn btn-primary"/>
	</div>
	
</form>

</tags:template>
