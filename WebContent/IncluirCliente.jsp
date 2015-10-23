<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!-- DADOS DE LOGIN -->

<!DOCTYPE html>
 
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="description" content="Aprenda a criar um site completo que usa formulários em HTML">
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
 <title>Incluir Veiculos</title>
	<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
	<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.6.0/grids-responsive-min.css">
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
<link rel="stylesheet" href="css/layouts/marketing.css">

 </head>

 <body>
 
 
 	<div class="header">
		<div class="home-menu pure-menu pure-menu-horizontal pure-menu-fixed">
			<a class="pure-menu-heading" href="index.html">Sistema de
				Veiculos</a>
			<ul class="pure-menu-list">
				<li class="pure-menu-item pure-menu-selected"><a
					href="Pesquisar.do" class="pure-menu-link">Pesquisar Veiculos</a></li>
				<li class="pure-menu-item"><a href="EfetuarL.do" class="pure-menu-link">Efetuar
				 Locacao</a></li>
				<li class="pure-menu-item"><a href="Alocados.do" class="pure-menu-link">Consultar 
				Alocados</a></li>
				<li class="pure-menu-item"><a href="chamados.json" class="pure-menu-link">Gerar Arquivo JSON</a></li>
			</ul>
		</div>
	</div>
	
 <form action = "IncluirClienteController">		
	<div class="content-wrapper">
		<div class="content">
			<div class="content">
				<h2 class="content-head is-center">Incluir Cliente</h2>
				
				
<fieldset>
 
  <div class="pure-form">
       <div class="pure-control-group">
             <input name="nome" type="text" placeholder="Nome" >
             <input name="cpf" type="text" placeholder="CPF">
             <input name="rg" type="text" placeholder="RG">
             <input name="dataNascimento" type="date" placeholder="Data de Nascimento">
             <input name="numHab" type="text" placeholder="Numero Habilitacao">
             <input name="catHab" type="text" placeholder="Categoria Habilitacao">
             <input name="estadoEmissor" type="text" placeholder="EstadoEmissor">
             <input name="validade" type="text" placeholder="Validade">           
			 <input name="endereco" type="text" placeholder="Endereco">
             <input name="telefone" type="text" placeholder="Telefone">
             <input name="email" type="email" placeholder="Email">
</div>
</div>
</fieldset>

<p>
		<label>Sexo</label>

<fieldset>
    <label for="fm" class="pure-radio">
        <input id="fm" type="radio" name="fm" value="fm">
        F
    </label>	
    
    <label for="ma" class="pure-radio">
        <input id="ma" type="radio" name="ma" value="ma">
        M
    </label>
    
</fieldset> 

<p>

<button type="submit" class="pure-button pure"  value = "botaoSalvar">Salvar</button>
<button type="reset" class="pure-button pure"  value = "botaoCancelar">Cancelar</button>
<a class="pure-button pure" href="EfetuarLocacao.jsp">Voltar</a>

</div>
</div>
</div>
</form>
</body>
</html>