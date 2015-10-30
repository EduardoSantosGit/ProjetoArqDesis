<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- DADOS DE LOGIN -->

<!DOCTYPE html>
 
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="description" content="Aprenda a criar um site completo que usa formulários em HTML">
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
 <title>Efetuar Locacao</title>
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
	
<form action = "IncluirLocacaoController">	
<div class="content-wrapper">
		<div class="content">
			<div class="content">
				<h2 class="content-head is-center">Efetuar Locacao</h2>
				
				<div class="pure-g">
					<div class="l-box-lrg pure-u-1">
					<table class="pure-table">
					<thead>					
			<tr>
				<th>Chassi</th><th>Placa</th><th>Modelo</th><th>Fabricante</th><th>Estado</th><th>Cidade</th>
				<th>KM Rodados</th><th>KM Livres</th>
			</tr>
				</thead><tbody>
			</tbody></table>
			</div>
			</div>
			
			
<fieldset>


 
 <div class="pure-form">
       <div class="pure-control-group">
             <input name="cpf" type="text" placeholder="CPF">
             <input name="nome" type="text" placeholder="Nome">
		</div>
</div>
</fieldset>	

	
<div class="alert alert-success">
					<h1>${mensagem}</h1>
                    <h2>${Codcliente}</h2>
                </div>

<p>			
<input type="submit" class="pure-button pure" name= "PesquisarCliente" value="PesquisarCliente"/>
<a class="pure-button pure" href="IncluirCliente.jsp">Incluir</a>
<a class="pure-button pure" href="AlterarCliente.jsp">Alterar</a>
<a class="pure-button pure" href="ExcluirCliente.jsp">Excluir</a>
<a class="pure-button pure" href="DadosCliente.jsp">Detalhar</a>
<input type="submit" class="pure-button pure" name= "SelecionarCliente" value="SelecionarCliente"/>
<p>
			
			
<fieldset>
 
 <div class="pure-form">
       <div class="pure-control-group">
             <input name="DataRetirada"   type="text" placeholder="DataDeRetirada">
             <input name="DataDevolucao"  type="text" placeholder="DataDeDevolucao">
             <input name="LocalRetirada"  type="date" placeholder="LocalDaRetirada">
             <input name="LocalDevolucao" type="date" placeholder="DataDeDevolucao">
                 
		</div>
</div>
</fieldset>	

<p>
		<label>Selecione o tipo de Tarifa</label>

<fieldset>
    <label for="Livre" class="pure-radio">
        <input id="Livre" type="radio" name="Livre" value="Livre">
        KM Livre
    </label>	
    
    <label for="Contro" class="pure-radio">
        <input id="Contro" type="radio" name="Contro" value="Contro">
        KM Controlado
    </label>
    
</fieldset>    


<p>			

<input type="submit" class="pure-button pure" name= "ConfirmarLocacao" value="ConfirmarLocacao"/>  
<a class="pure-button pure" href="Alterar.do">Cancelar</a>  	
			</div>
		</div>
	</div>			
</form>
</body>
</html>