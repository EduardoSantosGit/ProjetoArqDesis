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

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import DAO.VeiculoDAOMySQL;
import Model.ListarVeiculo;
import Model.Veiculo;
import TO.ClienteTO;
import TO.ListarVeiculoTO;
import Controller.ServiceLookup;


/**
 * Servlet implementation class ConsultarVeiculoController
 */
@WebServlet("/ConsultaVeiculoController")
public class ConsultarVeiculoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void service (HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException {
		
		Veiculo veiculo = new Veiculo();
		VeiculoDAOMySQL dao = new VeiculoDAOMySQL();
		
		String destino = "ConsultaVeiculo.jsp";

	   String button = request.getParameter("botaoPesquisarVeiculo");
		
	   
		
		
		if(button != null){	
        	try {
    			String chassi = request.getParameter("chassi");
    			String placa = request.getParameter("placa");
    			String fabricante = request.getParameter("fabricante");
    		
    			
    		/*	veiculo.setChassi(chassi);
    			veiculo.setPlaca(placa);
    			veiculo.setFabricante(fabricante);*/
    			
    			veiculo = dao.pesquisar(chassi,placa,fabricante);
    			request.setAttribute("ListaVeiculos", veiculo);
    			destino = "ConsultaVeiculo.jsp";
    			
        	}	 catch (Exception e) {
    			e.printStackTrace();
    			}		
        	}
		else {
			destino = "ConsultaVeiculo.jsp";
		}
        	
    		//	List <String> carro = veiculo.getChassi()request.getAttribute("chassi");

				RequestDispatcher rd = request.getRequestDispatcher(destino);
				rd.forward(request, response);
    			
    			
    			
    		/*	try {
    				List listaVeiculo = (List) dao.pesquisar(chassi,placa,fabricante);
    				request.setAttribute("ListaVeiculos", listaVeiculo);
    				RequestDispatcher rd = request.getRequestDispatcher("ConsultaVeiculo.jsp");
    				rd.forward(request, response);
    				
    			}   catch (Exception e) {
        			e.printStackTrace();
        			}
    		*/	
    			
        	}

	/*public void init(ServletConfig config){
		//todos os servlets do menu devem conter este metodo
		ServiceLookup.setupDB();
	}*/
}
