package Controller;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.ListaLocacoes;
import Model.ListarCliente;
import Model.ListarVeiculo;
import TO.ListarClienteTO;
import TO.ListarLocacoesTO;
import TO.ListarVeiculoTO;

/**
 * Servlet implementation class ListarLocacaoController
 */
@WebServlet("/Locacoes.json")
public class ListarItensJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ListaLocacoes loc = new ListaLocacoes();
		ListarLocacoesTO lista = loc.listarLocacoes();
		response.setCharacterEncoding("UTF-8");
		
		response.setContentType("application/octet-stream");
		response.setHeader("Content-disposition","attachment; filename=Locacoes.json");
		OutputStream out = response.getOutputStream();
		out.write(lista.toJSON().getBytes());
		out.flush();
/*		
		ListarVeiculo vei = new ListarVeiculo();
		ListarVeiculoTO listavei = vei.listarVeiculos();
		response.setCharacterEncoding("UTF-8");
		
		response.setContentType("application/octet-stream");
		response.setHeader("Content-disposition","attachment; filename=Locacoes.json");
		OutputStream outp = response.getOutputStream();
		outp.write(listavei.toJSON().getBytes());
		outp.flush();
		
	
		ListarCliente cli = new ListarCliente();
		ListarClienteTO listacli = cli.listarClientes();
		response.setCharacterEncoding("UTF-8");
		
		response.setContentType("application/octet-stream");
		response.setHeader("Content-disposition","attachment; filename=Locacoes.json");
		OutputStream outpu = response.getOutputStream();
		outpu.write(listacli.toJSON().getBytes());
		outpu.flush();
*/		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// alterar um chamado (no caso, fechar chamado)
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// deletar um chamado (nao sera implementado neste sistema)
	}
	
	@Override
	public void init(ServletConfig config){
		//todos os servlets do menu devem conter este metodo
		ServiceLookup.setupDB();
	}
}
