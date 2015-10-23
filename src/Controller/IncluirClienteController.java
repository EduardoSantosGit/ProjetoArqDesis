package Controller;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClienteDAOMySQL;
import Model.Cliente;

/**
 * Servlet implementation class IncluirClienteController
 */
@WebServlet("/IncluirClienteController")
public class IncluirClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service (HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException {
	
	String destino = "ConsultaVeiculo.jsp";	
	Cliente cliente = new Cliente();
	ClienteDAOMySQL dao = new ClienteDAOMySQL();
	

	try {
			
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String rg = request.getParameter("rg");
		String dataNascimento = request.getParameter("dataNascimento");
		String numHab = request.getParameter("numHab");
		String catHab = request.getParameter("cateHab");
		String estadoEmissor = request.getParameter("estadoEmissor");
		String validade = request.getParameter("validade");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String sexof = request.getParameter("fm");
		String sexom = request.getParameter("ma");
		
		
		cliente.setNome(nome);
		cliente.setCPF(cpf);
		cliente.setRG(rg);
		cliente.setDataNasc(dataNascimento);
		cliente.setNumHabi(numHab);
		cliente.setCateHabi(catHab);
		cliente.setEstadoEmi(estadoEmissor);
		cliente.setValidade(validade);
		cliente.setEndereco(endereco);
		cliente.setTelefone(Integer.parseInt(telefone));
		cliente.setEmail(email);
		
		
		/*
		try {
			
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date dataN = (Date) df.parse(dataNascimento);
		cliente.setDataNasc(dataN);
		
		}catch (Exception e) {
			e.printStackTrace();
			}*/
       dao.incluir(cliente);
       destino = "ConsultaVeiculo.jsp";
	}
	catch (Exception e) {
		e.printStackTrace();
		}
}
	
	
	
}
