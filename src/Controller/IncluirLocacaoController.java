package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClienteDAOMySQL;
import DAO.LocacaoDAOMySQL;
import Model.Cliente;
import Model.Locacao;

/**
 * Servlet implementation class IncluirLocacaoController
 */
@WebServlet("/IncluirLocacaoController")
public class IncluirLocacaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Locacao locacao = new Locacao ();
	LocacaoDAOMySQL dao = new LocacaoDAOMySQL();
	ClienteDAOMySQL daoCli = new ClienteDAOMySQL();
	Cliente cliente = new Cliente();
	String mensagem = "";
	String destino = "EfetuarLocacao.jsp";
	
/*	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
	    cliente = daoCli.pesquisar(nome, cpf);
	    int codCliente = cliente.getCodCliente();
  		request.setAttribute("Codcliente", codCliente);
  		
  		RequestDispatcher rd = request.getRequestDispatcher(destino);
		rd.forward(request, response);
  		
  		
	}
	
*/	
	
	
	protected void service (HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException {
		                    
		String botao = request.getParameter("PesquisarCliente");
		String botaoCon = request.getParameter("ConfirmarLocacao");
		

		try {
		if(botao != null) {
			String nome = request.getParameter("nome");
			String cpf = request.getParameter("cpf");
			
		    cliente = daoCli.pesquisar(nome, cpf);
		    int codCliente = cliente.getCodCliente();
		    
		    
		  	if(cliente != null) {
		  		request.setAttribute("mensagem", "Cliente existente!");
		  		request.setAttribute("Codcliente", codCliente);
		  		destino = "EfetuarLocacao.jsp";
		  	}
		  	else {
		  		request.setAttribute("mensagem", "Cliente não existe!");
		  		destino = "EfetuarLocacao.jsp";
		  	}
		    
			
		 }
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			if(botaoCon != null) {
				String nome = request.getParameter("nome");
				String cpf = request.getParameter("cpf");
				String dataRet = request.getParameter("DataRetirada");
				String dataDev = request.getParameter("DataDevolucao");
				String localRet = request.getParameter("LocalRetirada");
				String localDev = request.getParameter("LocalDevolucao");
				
				cliente.setNome(nome);
				cliente.setCPF(cpf);
				locacao.setDataRetirada(dataRet);
				locacao.setDataDevolucao(dataDev);
				locacao.setLocalRetirada(localRet);
				locacao.setLocalDevolucao(localDev);
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	    	
		RequestDispatcher rd = request.getRequestDispatcher(destino);
		rd.forward(request, response);
		
 
	
	}
	
	

}
