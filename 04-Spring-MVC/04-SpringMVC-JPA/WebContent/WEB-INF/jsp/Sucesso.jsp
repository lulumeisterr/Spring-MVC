<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--  Formatação de data  -->
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<tags:template titulo="Lista">


<jsp:body>

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
					<a href='<c:url value="/inicio/editar/${i.codigo}"></c:url>'> Editar </a>
				</td>
				
				
		</tr>
		</c:forEach>
	
	
	</table>
	
	

</jsp:body>

</tags:template>


