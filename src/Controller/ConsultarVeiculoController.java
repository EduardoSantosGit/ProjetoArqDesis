package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.VeiculoDAOMySQL;
import Model.ListarVeiculo;
import Model.Veiculo;
import TO.ClienteTO;
import TO.ListarVeiculoTO;


/**
 * Servlet implementation class ConsultarVeiculoController
 */
@WebServlet("/ConsultaVeiculoController")
public class ConsultarVeiculoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}	
	}
/*		String pesquisar = request.getParameter("botaoPesquisar");
		String alocar = request.getParameter("botaoAlocarVeiculo");
		String alocados = request.getParameter("botaoVeiculosAlocados");
		ArrayList <Veiculo> listaVeiculo;
		
		Veiculo veiculo = new Veiculo();
		VeiculoDAOMySQL dao = new VeiculoDAOMySQL();
		
		
		try {
			if(pesquisar.equalsIgnoreCase("botaoPesquisar")){
		//	veiculo.setChassi(Integer.parseInt(request.getParameter("chassi")));
		//	veiculo.setPlaca(request.getParameter("Placa"));
		//	veiculo.setModelo(request.getParameter("Modelo"));
		//	veiculo.setFabricante(request.getParameter("Fabricante"));
			Veiculo pesquiVei = dao.pesquisar(request.getParameter("Modelo"));
				if(pesquiVei != null){
					pesquiVei.getChassi();
					pesquiVei.getPlaca();
					pesquiVei.getModelo();
					pesquiVei.getFabricante();
				}
			}
			
		//	if (alocar.equalsIgnoreCase("botaoAlocarVeiculo")){
				
	//		}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	  */
/*	
	@Override
	public void init(ServletConfig config){
		ServiceLookup.setupDB();
	}
*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
       
/*
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}	
		
	protected void doPost(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			
			int vei = Integer.parseInt(request.getParameter("vei"));

			ListarVeiculo liv = new ListarVeiculo();
			ListarVeiculoTO lista = liv.listarVeiculos(vei);
	
		
	}
	*/

