<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<tags:template titulo="bebida">

	<jsp:attribute name="scripts">
	</jsp:attribute>

	<jsp:body>
	
		<c:if test="${not empty msg}">
			<div class="alert alert-sucess">
				${msg}
			</div>
		</c:if>
	
		<h1>Cadastro de bebida</h1>
		
	
		<form action="cadastrar" method="post">
		
			<div class="container">
			
			<div class="form-group">
				<label for="nm_bebida">Nome da bebida</label>
					<input class="form-control" type="text" name="nome" id="nm_bebida" placeholder="Digite o nome da bebida">
			</div>
			
			<div class="form-group">
				<label for="id_alcoolico">Acoolico</label>
				<input type="checkbox" name="alcoolico" id="id_alcoolico" placeholder="Digite a lembrancinha">
			</div>
			
			
			<div class="form-group">
				<label for="id_validade">Validade</label>
				<input class="form-group" type="text" name="validade" id="id_validade">
			</div>
		
		
			<div class="form-group">
				<input type="submit" value="Enviar">
			</div>
	
			
			</div>
		
		</form>

	</jsp:body>

</tags:template>

</html>