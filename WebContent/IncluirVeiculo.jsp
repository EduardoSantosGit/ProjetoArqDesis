<%@ page language="java" contentType="text/html; charset=UTF-8"
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
	
<!--  <form method="post" action="IncluirVeiculoController">-->
 <form action = "IncluirVeiculoController">	
	<div class="content-wrapper">
		<div class="content">
			<div class="content">
				<h2 class="content-head is-center">Incluir Veiculo</h2>
				
<fieldset>
 
 <div class="pure-form">
       <div class="pure-control-group">
             <input name="chassi" type="text" placeholder="Chassi">
             <input name="placa" type="text" placeholder="Placa">
             <input name="modelo" type="text" placeholder="Modelo">
             <input name="fabricante" type="text" placeholder="Fabricante">
             <input name="cidade" type="text" placeholder="Cidade">
             <input name="estado" type="text" placeholder="Estado">
             <input name="kmRodado" type="text" placeholder="Km Rodado">
             <input name="grupo" type="text" placeholder="Grupo">
			 <input name="acessorio" type="text" placeholder="Acessorio">
             <input name="tarifaKmLivre" type="text" placeholder="TarifaKmLivre">
             <input name="tarifaKmControlado" type="text" placeholder="TarifaKmControlado">
        </div>
</div>	

</fieldset>

<p>			

<button type="submit" class="pure-button pure"  value = "botaoSalvar">Salvar</button>
<button type="reset" class="pure-button pure"  value = "botaoCancelar">Cancelar</button>
<a class="pure-button pure" href="ConsultaVeiculo.jsp">Voltar</a>
	
			</div>
		</div>
	</div>			
</form>	
</body>
</html>
	