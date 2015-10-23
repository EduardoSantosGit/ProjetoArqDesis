package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.VeiculoDAOMySQL;
import Model.Veiculo;


@WebServlet("/IncluirVeiculoController")
public class IncluirVeiculoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}


//	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
//			throws ServletException, IOException {
	
	protected void service (HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException {
		
		//String destino = "ConsultaVeiculo.jsp";
		String acao = request.getParameter("botaoSalvar");
		ArrayList <Veiculo> listaVeiculo;
		
		
		Veiculo veiculo = new Veiculo();
		VeiculoDAOMySQL dao = new VeiculoDAOMySQL();
		

        	try {
			//if(acao.equalsIgnoreCase("botaoSalvar"));		
		/*	veiculo.setChassi(Integer.parseInt(request.getParameter("chassi")));
			veiculo.setPlaca("placa");
			veiculo.setModelo("modelo");
			veiculo.setFabricante("fabricante");
			veiculo.setCidade("cidade");
			veiculo.setEstado("estado");
			veiculo.setKmRodado(Integer.parseInt(request.getParameter("KmRodado")));
			veiculo.setGrupo("grupo");
			veiculo.setAcessorio("acessorio");
			veiculo.setTarifaKmLivre(Integer.parseInt(request.getParameter("tarifaKmLivre")));
			veiculo.setKmControlado(Integer.parseInt(request.getParameter("tarifaKmControlado")));
			dao.incluir(veiculo);
			*/
			
        	
			String chassi = request.getParameter("chassi");
			String placa = request.getParameter("placa");
			String modelo = request.getParameter("modelo");
			String fabricante = request.getParameter("fabricante");
			String cidade = request.getParameter("cidade");
			String estado = request.getParameter("estado");
			String kmRodado = request.getParameter("kmRodado");
			String grupo = request.getParameter("grupo");
			String acessorio = request.getParameter("acessorio");
			String tarifaKmLivre = request.getParameter("tarifaKmLivre");
			String kmControlado = request.getParameter("tarifaKmControlado");
			
			veiculo.setChassi(Integer.parseInt(chassi));
			veiculo.setPlaca(placa);
			veiculo.setModelo(modelo);
			veiculo.setFabricante(fabricante);
			veiculo.setCidade(cidade);
			veiculo.setEstado(estado);
			veiculo.setKmRodado(Integer.parseInt(kmRodado));
			veiculo.setGrupo(grupo);
			veiculo.setAcessorio(acessorio);
			veiculo.setTarifaKmLivre(Integer.parseInt(tarifaKmLivre));
			veiculo.setKmControlado(Integer.parseInt(kmControlado));
			dao.incluir(veiculo);
			
			
			
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	//	RequestDispatcher rd = request.getRequestDispatcher(destino);
	//	rd.forward(request, response);
		
//	}
	}		

}
