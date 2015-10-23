<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!-- DADOS DE LOGIN -->

<!DOCTYPE html>
 
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="description" content="Aprenda a criar um site completo que usa formulários em HTML">
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
 <title>Devolver Veiculos</title>
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
				<h2 class="content-head is-center">Devolver Veiculo</h2>

<fieldset>				
  <form class="pure-form">
       <div class="pure-control-group">
             <input id="CPF" type="text" placeholder="CPF">
       </div>
</form>
</fieldset>

<p>

<a class="pure-button pure" href="Incluir.do">Pesquisar</a>      

<P>

				<div class="pure-g">
					<div class="l-box-lrg pure-u-1">
					<table class="pure-table">
					<thead>
			<tr>
				<th>LocalRetirada</th><th>Cliente</th><th>CPF</th><th>DataRetirada</th>
				<th>DataDevolucao</th><th>DataRetirada</th>
			</tr>
				</thead><tbody>
			</tbody>
			</table>
			</div>
			</div>
			
<p>

<label>Dados de Pagamento</label>		
<p>

<label>Valor a Pagar R$</label>

<p>
		<label>Cartao de Credito</label>

<fieldset>
    <label for="Credito" class="pure-radio">
        <input id="Credito" type="radio" name="Credito" value="Credito">
        Cartao de credito
    </label>
</fieldset>     
          
<fieldset>
 
  <form class="pure-form">
       <div class="pure-control-group">               
                <div class="pure-u-1 pure-u-md-1-3">
                <label for="Bandeira">Bandeira</label>
                <select id="state" class="pure-input-1-2">
                    <option>Visa</option>
                    <option>MasterCard</option>
                </select>
            </div>
 
<p>            

            
<input id="Titular" type="text" placeholder="Titular">
<input id="Numero" type="text" placeholder="Numero">
<input id="CodSeg" type="text" placeholder="CodSeg">

</div>
</form>
</fieldset>   

<p>
		<label>Cartao de Debito</label>

<fieldset>
    <label for="Debito" class="pure-radio">
        <input id="Debito" type="radio" name="Credito" value="Debito">
        Cartao de Debito
    </label>
</fieldset>   

<p>  

<fieldset>
 
  <form class="pure-form">
       <div class="pure-control-group">             
            
<input id="Banco" type="text" placeholder="Banco">
<input id="Nome" type="text" placeholder="Nome">
<input id="Agencia" type="text" placeholder="Agencia">    
<input id="Conta" type="text" placeholder="Conta">
<input id="CPF" type="text" placeholder="CPF">    
</div>
</form>
</fieldset>

<p>

<a class="pure-button pure" href="Incluir.do">Confirmar</a>
<a class="pure-button pure" href="Alterar.do">Cancelar</a>
								
</div>
</div>
</div>

</body>
</html>				
				