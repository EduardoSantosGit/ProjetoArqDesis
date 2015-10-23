package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import TO.ClienteTO;
import Factory.ConnFactory;
import Model.Cliente;

public class ClienteDAOMySQL extends ClienteDAO{

	@Override
	public void desconectar(Connection conn) throws SQLException {
		conn.close();
		
	}

	@Override
	public Cliente incluir(Cliente to) {
		String inclusao = "insert into Cliente (nome,CPF,RG,dataNasc,numHabi,estadoEmi,"
				+ "cateHabi,validade,sexo,endereco,telefone,email) values (?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = ConnFactory.conectar();
			pst = conn.prepareStatement(inclusao);
			//configurar parametros
		//	pst.setNull(1, Types.INTEGER);
			pst.setString(1, to.nome);
			pst.setString(2, to.CPF);
			pst.setString(3, to.RG);
			pst.setString(4, to.dataNasc);
			pst.setString(5, to.numHabi);
			pst.setString(6, to.estadoEmi);
			pst.setString(7, to.cateHabi);
			pst.setString(8, to.validade);
			pst.setString(9,to.sexo);
			pst.setString(10,to.endereco);
			pst.setInt(11, to.telefone);
			pst.setString(12, to.email);
				//fim configurar parametros
				pst.execute();
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
	public void  excluir(int CodCliente) {
		String delete = "delete from Cliente where CodCliente =?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
				conn = ConnFactory.conectar();
				pst = conn.prepareStatement(delete);
				pst.setInt(1,CodCliente);
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
	public void alterar(Cliente to) {
		String inclusao = "update Cliente set nome=?,CPF=?,RG=?,dataNasc=?,numHabi=?,estadoEmi=?,"+
				"cateHabi=?,validade=?,sexo=?,endereco=?,telefone=?,email=? where CodCliente=?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = ConnFactory.conectar();
			pst = conn.prepareStatement(inclusao);
			pst.setString(1, to.nome);
			pst.setString(2, to.CPF);
			pst.setString(3, to.RG);
			pst.setString(4, to.dataNasc);
			pst.setString(5, to.numHabi);
			pst.setString(6, to.estadoEmi);
			pst.setString(7, to.cateHabi);
			pst.setString(8, to.validade);
			pst.setString(9,to.sexo);
			pst.setString(10,to.endereco);
			pst.setInt(11, to.telefone);
			pst.setString(12, to.email);
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

	public ArrayList <Cliente> listar(Cliente to) {
		ArrayList <Cliente> cliente = new ArrayList <Cliente> ();
		String listar = "select * from Cliente order by CodCliente";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = ConnFactory.conectar();
			pst = conn.prepareStatement(listar);
			ResultSet resultSet = pst.executeQuery();
			while(resultSet.next()) {
				pst.setString(1, to.nome);
				pst.setString(2, to.CPF);
				pst.setString(3, to.RG);
				pst.setString(4, to.dataNasc);
				pst.setString(5, to.numHabi);
				pst.setString(6, to.estadoEmi);
				pst.setString(7, to.cateHabi);
				pst.setString(8, to.validade);
				pst.setString(9,to.sexo);
				pst.setString(10,to.endereco);
				pst.setInt(11, to.telefone);
				pst.setString(12, to.email);
				cliente.add(to);
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
				
		return cliente;
		
	}

	
	
	
}
