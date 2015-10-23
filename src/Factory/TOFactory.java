package Factory;

import TO.ClienteTO;
import TO.ListarClienteTO;
import TO.ListarLocacoesTO;
import TO.ListarVeiculoTO;
import TO.LocacaoTO;
import TO.VeiculoTO;

public class TOFactory {
	
	public static ClienteTO getClienteTO(){
		return new ClienteTO();
	}
	
	public static ListarLocacoesTO getListarLocacoesTO(){
		return new ListarLocacoesTO();
	}
	public static LocacaoTO getLocacaoTO(){
		return new LocacaoTO();
	}
	public static VeiculoTO getVeiculoTO(){
		return new VeiculoTO();
	}
	
	public static ListarClienteTO getListarClienteTO(){
		return new ListarClienteTO();
	}
	
	public static ListarVeiculoTO getListarVeiculoTO(){
		return new ListarVeiculoTO();
	}
	
	
	

}
