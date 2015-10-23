package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Cliente;
import TO.ClienteTO;

public abstract class ClienteDAO {
	
	public abstract void desconectar(Connection conn) throws SQLException;
	
	public abstract Cliente incluir(Cliente to);

	public abstract void excluir(int CodCliente);
	
	public abstract void alterar(Cliente to);
	
	public abstract ArrayList <Cliente> listar(Cliente to);
}
