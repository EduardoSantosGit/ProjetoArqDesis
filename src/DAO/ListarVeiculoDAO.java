package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import TO.ListarVeiculoTO;

public abstract class ListarVeiculoDAO {
	
	public abstract void desconectar(Connection conn) throws SQLException;
	
	public abstract ListarVeiculoTO listarVeiculos ();
	public abstract ListarVeiculoTO listarVeiculos (int vei);

}
