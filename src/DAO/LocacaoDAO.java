package DAO;

import java.sql.Connection;
import java.sql.SQLException;

import Model.Locacao;
import TO.LocacaoTO;

public abstract class LocacaoDAO {
	
	public abstract void desconectar(Connection conn) throws SQLException;
	
	public abstract Locacao incluir (Locacao to);
	
	public abstract void fechar(Locacao to);
	
	public abstract Locacao listarLocacoes(Locacao to);
	
	//public abstract ListarLocacoesTO listarLocacoes();

}
