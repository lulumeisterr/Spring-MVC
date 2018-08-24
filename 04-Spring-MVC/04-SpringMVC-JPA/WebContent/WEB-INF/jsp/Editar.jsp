<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<tags:template titulo="Edição de bebida">


	<h1>Editar bebida</h1>
	<c:url value="/inicio/editar" var="indice"></c:url>
	
		
		<form:form action="${indice}" method="post" commandName="bebida">
		
		<div class="form-group">
			<form:label path="nome"> Nome </form:label>
			<form:input path="nome" cssClass="form-control" />
		</div>
		
		<div class="form-group">
			<form:label path="validade"> Validade </form:label>
			<form:input path="validade" cssClass="form-control" />
		</div>
		
		<div class="form-group">
			<form:label path="alcoolico"> Alcoolico </form:label>
			<form:input path="alcoolico" cssClass="form-control" />
		</div>
		
	
		<form:hidden path="codigo" />
		<input type="submit" value="Atualizar">
		
		
		</form:form>
	


</tags:template>