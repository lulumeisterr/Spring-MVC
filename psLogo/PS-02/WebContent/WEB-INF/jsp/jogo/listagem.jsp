<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<tags:template titulo="Listagem">

<table class="table">

	
	<tr>
		<th>Nome</th>
		<th>Plataforma</th>
		<th>Genero</th>
		<th>Data de Lancamento</th>
		<th>Disponibilidade</th>
	</tr>
	
	<c:forEach var="x" items="${exibejogos}">
	
		<tr>
			<td>${x.nome}</td>
			<td>${x.plataforma}</td>
			<td>${x.genero.nome}</td>
			<td> <fmt:formatDate value="${x.dataLancamento.time}" pattern="dd/MM/YYYY"/> </td>
			<td>${x.disponivel?"Sim":"Nao"}</td>
			<td>
			<!-- Recuperando o ID Criado No Modal abaixo -->
			
				<c:if test="${!x.disponivel}">
					<button onclick="DisponibilizarID.value = ${x.codigo}" type="button" class="btn btn-outline-success btn-sm" data-toggle="modal" data-target="#modalDisponibilizar">
						  Disponibilizar
					</button>
					
					 <!-- 3 - Passar o id para o botao -->
					<!--  Removendo , Para Remover você deve ter uma variavel do tipo hidden no seu html recuperando o codigo do que vc deseja removel -->
					<button onclick="ExcluirCodigo.value = ${x.codigo}" type="button" class="btn btn-outline-danger btn-sm" data-toggle="modal" data-target="#modalRemover">
						  Remover
					</button>
				</c:if>
			</td>
		</tr>
	</c:forEach>



	<!-- Modal Disponibilizar -->
	<div class="modal fade" id="modalDisponibilizar" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Confirmação</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
	        Deseja realmente disponibilizar o jogo?
	      </div>
	      <div class="modal-footer">
	      
	      <!-- Url sera passada no PostMapping -->
	      <c:url value="/jogo/disponibilizar" var="acaoRemover"></c:url>
	      
	      	<form action="${acaoRemover}" method="post">
	      		
	      		<!-- Campo Hidden para ser recuperado -->
	      		<input type="hidden" name="codigo" id="DisponibilizarID"><br>
	      		
		        <button type="button" class="btn btn-secondary" data-dismiss="modal">Não</button>
		        <button type="submit" class="btn btn-success">Sim</button>
	        </form>
	      </div>
	    </div>
	  </div>
	</div>
	
	<!-- ================================================================================================================== -->
	
	<!-- Modal Exluir -->
	<div class="modal fade" id="modalRemover" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Confirmação</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
	        Deseja realmente apagar o jogo?
	      </div>
	      <div class="modal-footer">
	      
	      <!-- AQUI VOCÊ CRIA UM FORM QUE REFERENCIARÁ UM LINK PARA QUE O VALOR SEJA REMOVIDO  -->
	      <c:url value="/jogo/remover" var="acao"></c:url>
	      
	        <!-- 1 - Criar um campo oculto -->
	      	<form action="${acao}" method="post">
	      	
	      	<!-- O ID QUE SERA RECUPERADO ADENTRO DA TABLE E O ID=CODIGOREMOVER E PASSAREMOS NA TABLE COMO 1 ATRIBUTO JAVASCRIPT -->
	      	<!--  VOCÊ DEVE CRIAR UM INPUT DO TIPO HIDDEN PARA SER RECUPEARDO -->
	      	
	      		<!-- Campo Hidden a Ser Recuperado -->
	      		<input type="hidden" name="codigo" id="ExcluirCodigo"><br>
	      		
		        <button type="button" class="btn btn-secondary" data-dismiss="modal">Não</button>
		        <button type="submit" class="btn btn-danger ">Sim</button>
	        </form>
	      </div>
	    </div>
	  </div>
	</div>



</table>








</tags:template>