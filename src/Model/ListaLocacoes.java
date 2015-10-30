package Model;

import Factory.DAOFactory;
import TO.ListarLocacoesTO;

public class ListaLocacoes {
	
	public ListarLocacoesTO listarLocacoes() {
		return DAOFactory.getListarLocacoesDAO().listarLocacoes();
	}
	
/*	public ListarLocacoesTO listarLocacoes(int loc) {
		return DAOFactory.getListarLocacoesDAO().listarLocacoes(loc);
	}
*/
}
