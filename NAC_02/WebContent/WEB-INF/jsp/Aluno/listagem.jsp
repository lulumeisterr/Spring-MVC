<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<tags:template titulo="Listagem">

<c:if test="${not empty msg}">
		<div class="alert alert-sucess">
			${msg}
		</div>
	</c:if>

<table class="table">

	<tr>
		
		<th>codigo</th>
		<th>Nome</th>
		<th>Senha</th>
		<th>Data</th>
		<th>Descrição</th>
		<th>Dogs</th>
	
	</tr>


	<c:forEach var="is" items="${variavel }" >
		<tr>
			<td>${is.codigo}</td>
			<td>${is.nome}</td>
			<td>${is.senha}</td>
			<td><f:formatDate value="${is.data.time}" pattern="dd/MM/yyyy"/></td>
			<td>${is.descricao}</td>
			<td>${is.aprovado}</td>
			
			<td>
			<a class="btn btn-outline-primary" href="<c:url value="/Inicial/editar/${is.codigo}"/>">Editar</a>
			
				<button onclick="Excluir.value = ${is.codigo}" type="button" class="btn btn-outline-danger" data-toggle="modal" data-target="#exampleModal">
					 Excluir
				</button>
				

			</td>
		</tr>
	
	</c:forEach>


</table>


<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Confirmação</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
       Apagar
      </div>
      <div class="modal-footer">
     
      <!-- Criar um link para remover-->
      <c:url value="/Inicial/remover" var="acao"></c:url>
      
      <!-- Criar um formulario com method post -->
      <form action="${acao}" method="post">
    	
    	   <!-- 3 - Passar o id para o botao -->
    		<!-- 2 - Passar o name na assinatura do metodo -->
    		 <!-- 1 - Criar um campo oculto -->
	      	<input type="hidden" name="codigo" id="Excluir">
	      
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">Não</button>
	        <button type="submit" class="btn btn-primary">Ok</button>
        </form>
      </div>
    </div>
  </div>
</div>

</tags:template>