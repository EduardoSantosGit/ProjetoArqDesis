package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Factory.ConnFactory;
import Factory.TOFactory;
import TO.ClienteTO;
import TO.ListarClienteTO;


public class ListarClienteDAOMySQL extends ListarClienteDAO{

	@Override
	public void desconectar(Connection conn) throws SQLException {
		conn.close();
		
	}

	@Override
	public ListarClienteTO listarClientes(int cli) {
		ListarClienteTO lista = TOFactory.getListarClienteTO();
		String selecao = "select nome,CPF,RG,dataNasc,numHabi,estadoEmi,cateHabi,validade,sexo,endereco" +
				"telefone,email from Cliente where codCliente =?";
				Connection conn = null;
				PreparedStatement pst = null;
				ResultSet rs = null;
				try {
					conn = ConnFactory.conectar();
					pst = conn.prepareStatement(selecao);
					pst.setInt(1, cli);
					rs = pst.executeQuery();
					while(rs.next()){
						ClienteTO cliente = TOFactory.getClienteTO();
						cliente.nome = rs.getString(1);
						cliente.CPF = rs.getString(2);
						cliente.RG = rs.getString(3);
						cliente.dataNasc = rs.getString(4);
						cliente.numHabi = rs.getString(5);
						cliente.estadoEmi = rs.getString(6);
						cliente.cateHabi = rs.getString(7);	
						cliente.validade = rs.getString(8);
						cliente.sexo = rs.getString(9);
						cliente.endereco = rs.getString(10);
						cliente.telefone = rs.getInt(11);
						cliente.email = rs.getString(12);			
						lista.add(cliente);
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
	public ListarClienteTO listarClientes() {
		// TODO Auto-generated method stub
		return null;
	}
	}

