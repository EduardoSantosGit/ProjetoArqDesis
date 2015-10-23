package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Factory.ConnFactory;
import Model.Locacao;
import TO.LocacaoTO;

public class LocacaoDAOMySQL extends LocacaoDAO{
	
	@Override
	public void desconectar(Connection conn) throws SQLException {
		conn.close();
	}

	@Override
	public Locacao incluir (Locacao to){
		String inclusao = "insert into Locacao () values ()";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = ConnFactory.conectar();
			pst = conn.prepareStatement(inclusao);
			//configurar parametros
			//pst.setNull(1, Types.INTEGER);
			pst.setInt(1, to.codCliente);
			pst.setInt(2, to.codVeiculo);
			pst.setString(3, to.localRetirada);
			pst.setString(4, to.localDevolucao);
			pst.setString(5, to.tipoTarifa);
			pst.setString(6, to.agenciaLocacao);
			pst.setString(7, to.agenciaPrevDevolucao);
			pst.setDate(8, to.dataRetirada);
			pst.setDate(9,to.dataDevolucao);
			pst.setDouble(10,to.acrescimo);
			pst.setDouble(11, to.kmLocacao);
			pst.setDouble(12, to.kmDevolucao);
				//fim configurar parametros
				pst.execute();
				//funcao do MySQL para pegar o ultimo id inserido nesta secao"
				if(pst != null){
					try {
						pst.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				String selecao = "select LAST_INSERT_ID()";
				pst = conn.prepareStatement(selecao);
				rs = pst.executeQuery();
				if(rs.next()){
					to.codLocacao = rs.getInt(1);
				}
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
			/*	selecao = "select codLocacao from Locacao where codLocacao = ?";
				pst = conn.prepareStatement(selecao);
				pst.setInt(1, to.codLocacao);
				rs = pst.executeQuery();
				if(rs.next()){
					to.codCliente = rs.getInt(1);
				}*/

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
			return to;
		}

		@Override
		public void fechar(Locacao to){
			String alteracao = "update Locacao set dataDevolucao=?, acrescimo=?, kmDevolucao"
					+ "localDevolucao=?" + "where codLocacao =?";
			Connection conn = null;
			PreparedStatement pst = null;
			try {
				conn = ConnFactory.conectar();
				pst = conn.prepareStatement(alteracao);
				pst.setInt(5,to.codLocacao);
				pst.setString(4, to.localDevolucao);
				pst.setDouble(3, to.kmDevolucao);
				pst.setDouble(2,to.acrescimo);
				pst.setDate(1, to.dataDevolucao);
				pst.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
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
		}
		
		@Override
		public Locacao listarLocacoes (Locacao to){
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
				pst.setInt(1, to.codLocacao);
				rs = pst.executeQuery();
				if(rs.next()){
					to.codVeiculo = rs.getInt(2);
					to.codCliente = rs.getInt(3);
					to.localRetirada = rs.getString(4);
					to.localDevolucao = rs.getString(5);
					to.tipoTarifa = rs.getString(6);
					to.agenciaLocacao = rs.getString(7);
					to.agenciaPrevDevolucao = rs.getString(8);
					to.dataRetirada = rs.getDate(9);
					to.dataDevolucao = rs.getDate(10);
					to.acrescimo = rs.getDouble(11);
					to.kmLocacao = rs.getLong(12);
					to.kmDevolucao = rs.getFloat(13);
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
			return to;
		}

	

}
