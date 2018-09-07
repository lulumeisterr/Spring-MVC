<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--  Formatação de data  -->
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<tags:template titulo="Lista">

<jsp:body>

<c:if test="${not empty msg}">
		<div class="alert alert-sucess">
			${msg}
		</div>
	</c:if>
	

	<table class="table">
	
	<tr>
		<th>Nome da bebida</th>
		<th>Data de validade</th>
		<th>Alcoolico</th>
		<th>Editar</th>
	</tr>
	
	
		<c:forEach var="i"  items="${msgLista}">
		<tr>
				<td>${i.nome}</td>
				
				<td>
					<f:formatDate value="${i.validade.time}" pattern="dd/MM/yyyy"/>
				</td>
				
				<td>${i.alcoolico}</td>
				
				<td>
					<a class="btn btn-primary"  href='<c:url value="/inicio/listar${i.codigo}"></c:url>'> Editar </a>
					<!-- Button trigger modal -->
					<!--  Passar o id do click do batao feito no modal -->
					<button onclick="codigoBebida.value = ${i.codigo}" type="button" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal">
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
        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
      
      <!--  Excluindoooooooooooooooooooooooooooooooooooooooooooooo -->
      <c:url value="/bebida/remover/" var="a"/>
      <form action="${a}" method="post"> 
      
      		<!--  Criar um ID para enviar para o sv -->
      		<input type="hidden" name="codigo" id="codigoBebida">
      		
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
        <button type="submit" class="btn btn-primary">Excluir</button>
        
      </form>
      </div>
    </div>
  </div>
</div>

</jsp:body>

</tags:template>


