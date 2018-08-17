<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>


<tags:template titulo="Home">

			<fieldset class="alert alert-success">
					${msg}
			</fieldset>
			
			<p> Pessoa ${key.qtdPessoa} 
					 Endereço do plano ${key.end}
					 Lembracinha ${key.lembra}
			</p>
					 
					 
				
			
</tags:template>