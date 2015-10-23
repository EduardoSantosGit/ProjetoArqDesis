package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Veiculo;
import TO.VeiculoTO;

public abstract class VeiculoDAO {
	
	public abstract void desconectar(Connection conn) throws SQLException;
	
	public abstract Veiculo incluir(Veiculo to);

	public abstract void excluir(int codVeiculo);
	
	public abstract void alterar(Veiculo to);
	
	public abstract Veiculo pesquisar (String modelo);
	
	public abstract ArrayList <Veiculo> listar(Veiculo to);

}
