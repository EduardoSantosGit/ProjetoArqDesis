package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import TO.ListarLocacoesTO;

public abstract class ListarLocacoesDAO {

	public abstract void desconectar(Connection conn) throws SQLException;
	
	
	public abstract ListarLocacoesTO listarLocacoes(int loca);
	
	public abstract ListarLocacoesTO listarLocacoes();
		
	
	

}
