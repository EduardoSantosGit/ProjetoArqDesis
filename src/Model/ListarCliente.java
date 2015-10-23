package Model;

import Factory.DAOFactory;
import TO.ListarClienteTO;

public class ListarCliente {
	
	public ListarClienteTO listarClientes() {
		return DAOFactory.getListarClienteDAO().listarClientes();
	}
	
	public ListarClienteTO listarClientes(int cli) {
		return DAOFactory.getListarClienteDAO().listarClientes(cli);
	}


}
