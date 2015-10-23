package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.xml.internal.ws.wsdl.writer.document.Types;

import Factory.ConnFactory;
import Model.Veiculo;

public class VeiculoDAOMySQL extends VeiculoDAO{

	@Override
	public void desconectar(Connection conn) throws SQLException {
		conn.close();
		
	}

	@Override
	public Veiculo incluir(Veiculo veiculo) {
		String inclusao = "insert into Veiculo "
	    + "(chassi,placa,fabricante,cidade,estado,kmRodado,acessorio,tarifaKmLivre,kmControlado,grupo,modelo,codMarca,codAcessorio)"
		+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = ConnFactory.conectar();
			pst = conn.prepareStatement(inclusao);

			
			//configurar parametros
		//	pst.setNull(1, Types.INTEGER);
			pst.setInt(1, veiculo.chassi);
			pst.setString(2, veiculo.placa);
			pst.setString(3, veiculo.fabricante);
			pst.setString(4, veiculo.cidade);
			pst.setString(5, veiculo.estado);
			pst.setDouble(6, veiculo.kmRodado);
			pst.setString(7, veiculo.acessorio);
			pst.setDouble(8, veiculo.tarifaKmLivre);
			pst.setDouble(9,veiculo.kmControlado);
			pst.setString(10,veiculo.grupo);
			pst.setString(11, veiculo.modelo);
			pst.setInt(12, veiculo.codMarca);
			pst.setInt(13, veiculo.codAcessorio);
			pst.execute();
				//fim configurar parametros
				//pst.execute();
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
		return veiculo;
	}

	@Override
	public void excluir(int codVeiculo) {
		String delete = "delete from Veiculo where codVeiculo =?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
				conn = ConnFactory.conectar();
				pst = conn.prepareStatement(delete);
				pst.setInt(1,codVeiculo);
				pst.executeUpdate();
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
		
	}

	@Override
	public void alterar(Veiculo to) {
		String inclusao = "update Veiculo set chassi=?,placa=?,fabricante=?,cidade=?,estado=?,kmRodado=?,"+
				"acessorio=?,tarifaKmLivre=?,kmControlado=?,grupo=?,modelo=?,codMarca=?,codAcessorio=?"
				+ " where codVeiculo=?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = ConnFactory.conectar();
			pst = conn.prepareStatement(inclusao);
			pst.setInt(1, to.chassi);
			pst.setString(2, to.placa);
			pst.setString(3, to.fabricante);
			pst.setString(4, to.cidade);
			pst.setString(5, to.estado);
			pst.setDouble(6, to.kmRodado);
			pst.setString(7, to.acessorio);
			pst.setDouble(8, to.tarifaKmLivre);
			pst.setDouble(9,to.kmControlado);
			pst.setString(10,to.grupo);
			pst.setString(11, to.modelo);
			pst.setInt(12, to.codMarca);
			pst.setInt(13, to.codAcessorio);
			pst.executeUpdate();
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
		
	}

	@Override
	public ArrayList<Veiculo> listar(Veiculo to) {
		ArrayList <Veiculo> veiculo = new ArrayList <Veiculo> ();
		String listar = "select * from Veiculo order by codVeiculo";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = ConnFactory.conectar();
			pst = conn.prepareStatement(listar);
			ResultSet resultSet = pst.executeQuery();
			while(resultSet.next()) {
				pst.setInt(1, to.chassi);
				pst.setString(2, to.placa);
				pst.setString(3, to.fabricante);
				pst.setString(4, to.cidade);
				pst.setString(5, to.estado);
				pst.setDouble(6, to.kmRodado);
				pst.setString(7, to.acessorio);
				pst.setDouble(8, to.tarifaKmLivre);
				pst.setDouble(9,to.kmControlado);
				pst.setString(10,to.grupo);
				pst.setString(11, to.modelo);
				pst.setInt(12, to.codMarca);
				pst.setInt(13, to.codAcessorio);
				veiculo.add(to);
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
				
		return veiculo;
	}

	@Override
	public Veiculo pesquisar(String modelo) {
		Veiculo vei = null;
			String listar = "select * from Veiculo where chassi like=?";
			Connection conn = null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			try {
				conn = ConnFactory.conectar();
				pst = conn.prepareStatement(listar);
				pst.setString(1,modelo+"%");
				ResultSet resultSet = pst.executeQuery();
				if(resultSet.next()) {
				
					vei = new Veiculo();
				
					
				vei.setChassi(resultSet.getInt("chassi"));	
				vei.setPlaca(resultSet.getString("placa"));	
				vei.setModelo(resultSet.getString("modelo"));
				vei.setFabricante(resultSet.getString("fabricante"));

				}
			}	
			catch (SQLException e) {
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
			return vei;
		}

}
