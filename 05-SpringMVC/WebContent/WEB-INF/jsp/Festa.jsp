<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<tags:template titulo="Festa">

	<jsp:attribute name="scripts">
		<p>Algum Script Jquery</p>
	</jsp:attribute>

	<jsp:body>
	
		<c:if test="${not empty msg}">
			<div class="alert alert-sucess">
				${msg}
			</div>
		</c:if>
		
		<form action="cadastrar" method="post">
		
			<div class="container">
			
			<div class="form-group">
				<label for="id_qtdPessoa">Quantidade de Pessoas</label>
					<input class="form-control" type="text" name="qtdPessoa" id="id_qtdPessoa" placeholder="Digite a quantidade">
			</div>
			
			
			
			<div class="form-group">
				<label for="id_end">Endereço</label>
					<input class="form-control" type="text" name="end" id="id_end" placeholder="Digite o Endereço">
			</div>
			
			
			<div class="form-group">
				<label for="id_lembra">Lembracinha</label>
				<input type="checkbox" name="lembra" id="id_lembra" placeholder="Digite a lembrancinha">
			</div>
			
			
			<div class="form-group">
			<textarea rows="4" cols="50" name="cardapio" id="id_cardapio"></textarea>
				<label for="id_cardapio">Cardapio</label>
					
			</div>
			
			<div class="form-group">
				<input type="submit" value="Enviar">
			</div>
			
			
			
			</div>
		
		</form>

	</jsp:body>

</tags:template>

</html>