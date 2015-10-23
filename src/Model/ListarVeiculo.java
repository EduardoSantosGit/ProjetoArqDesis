package Model;

import Factory.DAOFactory;
import TO.ListarVeiculoTO;

public class ListarVeiculo {
	
	public ListarVeiculoTO listarVeiculos(){
		return DAOFactory.getListarVeiculoDAO().listarVeiculos();
	}
	
	public ListarVeiculoTO listarVeiculos(int vei) {
		return DAOFactory.getListarVeiculoDAO().listarVeiculos(vei);
	}

}
