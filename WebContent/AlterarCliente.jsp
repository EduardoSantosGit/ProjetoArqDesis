<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
 
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="description" content="Aprenda a criar um site completo que usa formulários em HTML">
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
 <title>Alterar Veiculos</title>
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
					href="PesquisarVeiculo.do" class="pure-menu-link">Pesquisar Veiculos</a></li>
				<li class="pure-menu-item"><a href="EfetuarLocacao.do" class="pure-menu-link">Efetuar
				 Locacao</a></li>
				<li class="pure-menu-item"><a href="VeiculosAlocados.do" class="pure-menu-link">Consultar 
				Alocados</a></li>
				<li class="pure-menu-item"><a href="Locacoes.json" class="pure-menu-link">Gerar Arquivo JSON</a></li>
			</ul>
		</div>
	</div>
	
	
	<div class="content-wrapper">
		<div class="content">
			<div class="content">
				<h2 class="content-head is-center">Alterar Cliente</h2>
				
				
<fieldset>
 
  <form class="pure-form">
       <div class="pure-control-group">
             <input id="Nome" type="text" placeholder="Nome">
             <input id="CPF" type="text" placeholder="CPF">
             <input id="RG" type="text" placeholder="RG">
             <input id="DataNascimento" type="date" placeholder="Data de Nascimento">
             <input id="NumHab" type="text" placeholder="Numero Habilitacao">
             <input id="CatHab" type="text" placeholder="Categoria Habilitacao">
             <input id="EstadoEmissor" type="text" placeholder="EstadoEmissor">
             <input id="Validade" type="text" placeholder="Validade">           
			 <input id="Endereco" type="text" placeholder="Endereco">
             <input id="Telefone" type="text" placeholder="Telefone">
             <input id="Email" type="email" placeholder="Email">
</div>
</form>
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

<a class="pure-button pure" href="AlterarCli.do">Salvar</a>
<a class="pure-button pure" href="AlterarCli.do">Cancelar</a>

</div>
</div>
</div>

</body>
</html>