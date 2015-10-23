package Factory;

import java.sql.Connection;
import java.sql.SQLException;

import Factory.ConnFactoryMySQL;

public class ConnFactory {

	private static int banco;
	public static final int MYSQL = 1;
//	public static final int POSTGRE = 2;

	// o banco default e o MySQL
	public static int getBanco() {
		setBanco(MYSQL);
		return banco;
	}

	public static void setBanco(int b) {
		b = MYSQL;
		banco = b;
	}

	public static Connection conectar() throws SQLException {
		return ConnFactoryMySQL.conectar();
	}
	
}
