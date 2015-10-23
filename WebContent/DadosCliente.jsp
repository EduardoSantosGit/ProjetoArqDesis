<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	

<!DOCTYPE html>
 
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="description" content="Aprenda a criar um site completo que usa formulários em HTML">
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
 <title>Pesquisar Clientes</title>
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
	
	<div class="content-wrapper">
		<div class="content">
			<div class="content">
				<h2 class="content-head is-center">Dados Cliente</h2>
				
				<div class="pure-g">
					<div class="l-box-lrg pure-u-1">
					<table class="pure-table">
					<thead>
			<tr>
				<th>Nome</th><th>CPF</th><th>RG</th><th>Endereco</th><th>Telefone</th>
			</tr>
				</thead><tbody>
			</tbody>
			</table>
			</div>
			</div>
			
<p>

<a class="pure-button pure" href="Incluir.do">Voltar</a>				
			</div>
		</div>
	</div>	
	
</body>
</html>