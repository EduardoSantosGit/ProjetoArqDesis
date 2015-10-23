package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Factory.ConnFactory;
import TO.ListarLocacoesTO;
import TO.LocacaoTO;
import Factory.TOFactory;

public class ListarLocacoesDAOMySQL extends ListarLocacoesDAO {
	
	
	@Override
	public void desconectar(Connection conn) throws SQLException {
		conn.close();
		
	}

	@Override
	public ListarLocacoesTO listarLocacoes(int loca) {
		ListarLocacoesTO lista = TOFactory.getListarLocacoesTO();
		String selecao = "select l.codLocacao,l.codVeiculo,l.codCliente,l.localRetirada,l.localDevolucao" +
				"l.tipoTarifa,l.agenciaLocacao,l.agenciaPrevDevolucao,l.dataRetirada,l.dataDevolucao" +
				"l.acrescimo,l.kmLocacao,l.kmDevolucao" +
				"from Locacao l " +
				"inner join Veiculo v on (v.codVeiculo = l.codVeiculo)" +
				"inner join Cliente c on (c.codCliente = l.codCliente)" +
				"where l.codLocacao= ?";
				Connection conn = null;
				PreparedStatement pst = null;
				ResultSet rs = null;
				try {
					conn = ConnFactory.conectar();
					pst = conn.prepareStatement(selecao);
					pst.setInt(1, loca);
					rs = pst.executeQuery();
					while(rs.next()){
						LocacaoTO locacao = TOFactory.getLocacaoTO();
						locacao.codVeiculo = rs.getInt(1);
						locacao.codCliente = rs.getInt(2);
						locacao.localRetirada = rs.getString(3);
						locacao.localDevolucao = rs.getString(4);
						locacao.tipoTarifa = rs.getString(5);
						locacao.agenciaLocacao = rs.getString(6);
						locacao.agenciaPrevDevolucao = rs.getString(7);	
						locacao.dataRetirada = rs.getDate(8);
						locacao.dataDevolucao = rs.getDate(9);
						locacao.acrescimo = rs.getDouble(10);
						locacao.kmLocacao = rs.getDouble(11);
						locacao.kmDevolucao = rs.getDouble(12);			
						lista.add(locacao);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				finally {
					if(rs != null){
						try {
							rs.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if(pst != null){
						try {
							pst.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if(conn != null){
						try {
							desconectar(conn);
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
				return lista;
			}

	@Override
	public ListarLocacoesTO listarLocacoes() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
