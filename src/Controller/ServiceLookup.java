package Controller;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import Factory.ConnFactory;

public class ServiceLookup {
	
	public static void setupDB(){
		try {
			// Pega o contexto do JNDI
			Context env = (Context)new InitialContext().lookup("java:comp/env");

			//pega qual o banco de dados a utilizar
			String banco = (String)env.lookup("banco");
			switch(banco){
			case "MYSQL":
				ConnFactory.setBanco(ConnFactory.MYSQL);
				break;
			}
		} catch (NamingException e1) {
			e1.printStackTrace();
		}
	}

}
