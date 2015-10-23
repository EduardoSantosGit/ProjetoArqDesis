package DAO;

import java.sql.Connection;
import java.sql.SQLException;

import TO.ListarClienteTO;

public abstract class ListarClienteDAO {
	
	public abstract void desconectar(Connection conn) throws SQLException;
	
	public abstract ListarClienteTO listarClientes (int cli);
	
	public abstract ListarClienteTO listarClientes ();

}
