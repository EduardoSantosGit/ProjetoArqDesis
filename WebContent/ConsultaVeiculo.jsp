<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@page import="java.text.*, java.util.*, TO.*"%>  


<!DOCTYPE html>

 
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="description" content="Aprenda a criar um site completo que usa formulários em HTML">
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
 <title>Pesquisar Veiculos</title>
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
	

<form method="post" action="ConsultaVeiculoController"> 

	
		<div class="content-wrapper">
		<div class="content">
			<div class="content">
				<h2 class="content-head is-center">Pesquisar Veiculo</h2>
				
						 
 
 <div class="pure-form"> 
       <div class="pure-control-group">
            <input id="Chassi" type="text" placeholder="Chassi" value ="${veiculo.chassi}">
            <input id="Placa" type="text" placeholder="Placa" value ="${veiculo.placa}">
            <input id="Modelo" type="text" placeholder="Modelo" value="${veiculo.modelo}">
            <input id="Fabricante" type="text" placeholder="Fabricante" value ="${veiculo.fabricante}">
        </div>
 </div>


				
<br />

<button type="submit" class="pure-button pure"   name = "botaoPesquisar">Pesquisar</button>
<a class="pure-button pure"  href="EfetuarLocacao.jsp">Alocar Veiculo</a>
<a class="pure-button pure"  href="ConsultarVeiculoLocado.jsp">Veiculos Alocados</a>


<p>

<table class="pure-table">
    <thead>
        <tr>
            <th>Chassi</th>
            <th>Placa</th>
            <th>Modelo</th>
            <th>Fabricante</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>${pesquiVei.getChassi()}</td>
            <td>${pesquiVei.getPlaca()}</td>
            <td>${pesquiVei.getModelo()}</td>
            <td>${pesquiVei.getFabricante()}</td>
        </tr>
    </tbody>
  </table>     


<p>

<a class="pure-button pure" href="IncluirVeiculo.jsp">Incluir</a>
<a class="pure-button pure" href="AlterarVeiculo.jsp">Alterar</a>
<a class="pure-button pure" href="ExcluirVeiculo.jsp">Excluir</a>
<a class="pure-button pure" href="DadosVeiculo.jsp">Detalhar</a>				
				
			</div>
		</div>
   </div>		
</form>

 </body>
</html>