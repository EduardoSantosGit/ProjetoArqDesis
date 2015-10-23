package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnFactoryMySQL extends ConnFactory {
	
	
	public static Connection conectar(){
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Locacao","root","eduardo");
		
		}catch (SQLException | ClassNotFoundException e){  
			e.printStackTrace();
		}
		return con;
	}
	
}	


