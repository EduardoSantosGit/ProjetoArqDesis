package TO;

import java.io.Serializable;
import java.sql.Date;

public class LocacaoTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	   public int codLocacao;
	   public int codVeiculo;
	   public int codCliente;
	   public String localRetirada;
	   public String localDevolucao;
	   public String tipoTarifa;
	   public String agenciaLocacao;
	   public String agenciaPrevDevolucao;
	   public String dataRetirada;
	   public String dataDevolucao;
	   public double acrescimo;
	   public double kmLocacao;
	   public double kmDevolucao; 
	   

}
