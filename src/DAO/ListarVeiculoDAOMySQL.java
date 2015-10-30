package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Factory.ConnFactory;
import Factory.TOFactory;
import TO.ListarVeiculoTO;
import TO.VeiculoTO;

public class ListarVeiculoDAOMySQL extends ListarVeiculoDAO{

	@Override
	public void desconectar(Connection conn) throws SQLException {
		conn.close();
		
	}

	@Override
	public ListarVeiculoTO listarVeiculos(int vei) {
		ListarVeiculoTO lista = TOFactory.getListarVeiculoTO();
		String selecao = "select chassi,placa,fabricante,cidade,estado,kmRodado,acessorio,tarifaKmLivre"
				+ ",kmControlado,grupo,codModelo,codMarca,codAcessorio from Veiculo where codVeiculo=?";
				Connection conn = null;
				PreparedStatement pst = null;
				ResultSet rs = null;
				try {
					conn = ConnFactory.conectar();
					pst = conn.prepareStatement(selecao);
					pst.setInt(1, vei);
					rs = pst.executeQuery();
					while(rs.next()){
						VeiculoTO veiculo = TOFactory.getVeiculoTO();
						veiculo.chassi = rs.getString(1);
						veiculo.placa = rs.getString(2);
						veiculo.fabricante = rs.getString(3);
						veiculo.cidade = rs.getString(4);
						veiculo.estado = rs.getString(5);
						veiculo.kmRodado = rs.getDouble(6);
						veiculo.acessorio = rs.getString(7);	
						veiculo.tarifaKmLivre = rs.getDouble(8);
						veiculo.kmControlado = rs.getDouble(9);
						veiculo.grupo = rs.getString(10);
						veiculo.modelo = rs.getString(11);
						veiculo.codMarca = rs.getInt(12);
						veiculo.codAcessorio = rs.getInt(13);
						lista.add(veiculo);
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
	public ListarVeiculoTO listarVeiculos() {
		ListarVeiculoTO lista = TOFactory.getListarVeiculoTO();
		String selecao = "select chassi,placa,fabricante,cidade,estado,kmRodado,acessorio,tarifaKmLivre"
				+ ",kmControlado,grupo,codModelo,codMarca,codAcessorio from Veiculo where codVeiculo=?";
				Connection conn = null;
				PreparedStatement pst = null;
				ResultSet rs = null;
				try {
					conn = ConnFactory.conectar();
					pst = conn.prepareStatement(selecao);
					rs = pst.executeQuery();
					while(rs.next()){
						VeiculoTO veiculo = TOFactory.getVeiculoTO();
						veiculo.chassi = rs.getString(1);
						veiculo.placa = rs.getString(2);
						veiculo.fabricante = rs.getString(3);
						veiculo.cidade = rs.getString(4);
						veiculo.estado = rs.getString(5);
						veiculo.kmRodado = rs.getDouble(6);
						veiculo.acessorio = rs.getString(7);	
						veiculo.tarifaKmLivre = rs.getDouble(8);
						veiculo.kmControlado = rs.getDouble(9);
						veiculo.grupo = rs.getString(10);
						veiculo.modelo = rs.getString(11);
						veiculo.codMarca = rs.getInt(12);
						veiculo.codAcessorio = rs.getInt(13);
						lista.add(veiculo);
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


}
