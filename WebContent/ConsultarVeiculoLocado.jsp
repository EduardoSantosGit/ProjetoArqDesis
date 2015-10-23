<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
 
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="description" content="Aprenda a criar um site completo que usa formulários em HTML">
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
 <title>Pesquisar Veiculos Locados</title>
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
				href="ConsultaVeiculo.jsp" class="pure-menu-link">Pesquisar Veiculos</a></li>
				<li class="pure-menu-item"><a href="EfetuarLocacao.jsp" class="pure-menu-link">Efetuar Locacao</a></li>
				<li class="pure-menu-item"><a href="ConsultarVeiculoLocado.jsp" class="pure-menu-link">Consultar Alocados</a></li>
				<li class="pure-menu-item"><a href="Locacoes.json" class="pure-menu-link">Gerar Arquivo JSON</a></li>
			</ul>
		</div>
	</div>
	
	<div class="content-wrapper">
		<div class="content">
			<div class="content">
				<h2 class="content-head is-center">Dados Veiculo</h2>
				
				
				
				
<fieldset>
 
  <form class="pure-form">
       <div class="pure-control-group">
             <input id="Marca" type="text" placeholder="Marca">
             <input id="Modelo" type="text" placeholder="Modelo">
             <input id="AnoAutomovel" type="text" placeholder="AnoAutomovel">
             <input id="NomeCliente" type="date" placeholder="Nome do Cliente">
             <input id="DataDevol" type="text" placeholder="Data Devolucao">
             <input id="ValorEstimado" type="text" placeholder="Valor Estimado">
             <input id="NomeCliente" type="text" placeholder="Nome Cliente">
             <input id="CPFCliente" type="text" placeholder="CPF Cliente">           
</div>
</form>
</fieldset>			

<p>

<a class="pure-button pure" href="PesquisarLocado.do">Pesquisar</a>
	
				<div class="pure-g">
					<div class="l-box-lrg pure-u-1">
					<table class="pure-table">
					<thead>
			<tr>
				<th>Modelo</th><th>KMRodado</th><th>ValorPago</th>
			</tr>
				</thead><tbody>
			</tbody>
			</table>
			</div>
			</div>
			
<p>

<a class="pure-button pure" href="Incluir.do">ok</a>
<a class="pure-button pure" href="Incluir.do">Cancelar</a>			
			</div>
		</div>
	</div>	
	
</body>
</html>