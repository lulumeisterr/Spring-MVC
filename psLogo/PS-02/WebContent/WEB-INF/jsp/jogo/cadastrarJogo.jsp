<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@taglib prefix="tags" tagdir="/WEB-INF/tags"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   
  
  <tags:template titulo="Cadastrar Jogo">
  
  <c:if test="${not empty msg}">
  		<div class="alert alert-success">${msg}</div>
  </c:if>
   
   <!--  Form  -->
   <form:form action="CadastroTipojogo" method="post" commandName="jogo">
   
	<div class="form-group">
		<label for="idNomeJogo">Nome</label>
		<input class="form-control" type="text" name="nome" placeholder="Digite o nome do jogo">
	</div>
	
	<div class="form-group">
		<label for="idData">Data de Lançamento</label>
		<input class="form-control" type="text" name="dataLancamento" placeholder="dd/MM/YYYY">
	</div>
		
	<!--  Carregando a lista de generos -->
	<!--  Nos Campos Path deve por o atributo que esta co-relacionado no bean -->
	<!--  Items Variavel que sera recuperada no controller -->
	<!-- Como se fosse o var para recuperar o atributo do forEach entao passar o atributo que esta co-relacionado no bean -->
	
	<div class="form-group">
			<form:label path="genero">Gênero</form:label>
			<!--  For Each  -->
			<form:select path="genero.codigo" cssClass="form-control">
				<option>Selecione</option>
					<form:options items="${generos }" itemLabel="nome" itemValue="codigo"/>
			</form:select>
		</div>
		
	<!--  Exibindo um Enum  -->	
	<!--  Nos Campos Path deve por o atributo que esta co-relacionado no bean -->
	<!--  Items Variavel que sera recuperada no controller -->
	<!-- Como se fosse o var para recuperar o atributo do forEach entao passar o atributo que esta co-relacionado no bean -->
	
	<div class="form-group">
			<form:label path="plataforma">Plataforma</form:label>
			<!--  For Each  -->
			<form:select path="plataforma" cssClass="form-control">
				<option>Selecione</option>
					<form:options items="${plataforma }" itemLabel="label"/>
			</form:select>
		</div>
		
		
		<input type="submit" class="btn btn-primary" value="Cadastrar"/>
   
 </form:form>
   
   
   </tags:template>