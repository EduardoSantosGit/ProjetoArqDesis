package Factory;

import DAO.ClienteDAO;
import DAO.ClienteDAOMySQL;
import DAO.ListarClienteDAO;
import DAO.ListarClienteDAOMySQL;
import DAO.ListarLocacoesDAO;
import DAO.ListarLocacoesDAOMySQL;
import DAO.ListarVeiculoDAO;
import DAO.ListarVeiculoDAOMySQL;
import DAO.LocacaoDAO;
import DAO.LocacaoDAOMySQL;
import DAO.VeiculoDAO;
import DAO.VeiculoDAOMySQL;

public class DAOFactory {
	
	public static ClienteDAO getClienteDAO() {
		switch (ConnFactory.getBanco()) {
		case ConnFactory.MYSQL:
			return new ClienteDAOMySQL();
		default:
			return null;
		}
	}
	
	public static VeiculoDAO getVeiculoDAO() {
		switch (ConnFactory.getBanco()) {
		case ConnFactory.MYSQL:
			return new VeiculoDAOMySQL();
		default:
			return null;
		}
	}
	
	public static LocacaoDAO getLocacaoDAO() {
		switch (ConnFactory.getBanco()) {
		case ConnFactory.MYSQL:
			return new LocacaoDAOMySQL();
		default:
			return null;
		}
	}
	
	public static ListarLocacoesDAO getListarLocacoesDAO() {
		switch (ConnFactory.getBanco()) {
		case ConnFactory.MYSQL:
			return new ListarLocacoesDAOMySQL();
		default:
			return null;
		}
	}	
	
	public static ListarClienteDAO getListarClienteDAO() {
		switch (ConnFactory.getBanco()) {
		case ConnFactory.MYSQL:
			return new ListarClienteDAOMySQL();
		default:
			return null;
		}
	}
	
	public static ListarVeiculoDAO getListarVeiculoDAO() {
		switch (ConnFactory.getBanco()) {
		case ConnFactory.MYSQL:
			return new ListarVeiculoDAOMySQL();
		default:
			return null;
		}
	}
	

}
