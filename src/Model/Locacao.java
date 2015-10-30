package Model;


import java.sql.Date;


public class Locacao {
	
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
	   
	   
	public int getCodLocacao() {
		return codLocacao;
	}
	public void setCodLocacao(int codLocacao) {
		this.codLocacao = codLocacao;
	}
	public int getCodVeiculo() {
		return codVeiculo;
	}
	public void setCodVeiculo(int codVeiculo) {
		this.codVeiculo = codVeiculo;
	}
	public int getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}
	public String getLocalRetirada() {
		return localRetirada;
	}
	public void setLocalRetirada(String localRetirada) {
		this.localRetirada = localRetirada;
	}
	public String getLocalDevolucao() {
		return localDevolucao;
	}
	public void setLocalDevolucao(String localDevolucao) {
		this.localDevolucao = localDevolucao;
	}
	public String getTipoTarifa() {
		return tipoTarifa;
	}
	public void setTipoTarifa(String tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}
	public String getAgenciaLocacao() {
		return agenciaLocacao;
	}
	public void setAgenciaLocacao(String agenciaLocacao) {
		this.agenciaLocacao = agenciaLocacao;
	}
	public String getAgenciaPrevDevolucao() {
		return agenciaPrevDevolucao;
	}
	public void setAgenciaPrevDevolucao(String agenciaPrevDevolucao) {
		this.agenciaPrevDevolucao = agenciaPrevDevolucao;
	}
	public String getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(String dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public double getAcrescimo() {
		return acrescimo;
	}
	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}
	public double getKmLocacao() {
		return kmLocacao;
	}
	public void setKmLocacao(double kmLocacao) {
		this.kmLocacao = kmLocacao;
	}
	public double getKmDevolucao() {
		return kmDevolucao;
	}
	public void setKmDevolucao(double kmDevolucao) {
		this.kmDevolucao = kmDevolucao;
	}
	@Override
	public String toString() {
		return "Locacao [codLocacao=" + codLocacao + ", codVeiculo=" + codVeiculo + ", codCliente=" + codCliente
				+ ", localRetirada=" + localRetirada + ", localDevolucao=" + localDevolucao + ", tipoTarifa="
				+ tipoTarifa + ", agenciaLocacao=" + agenciaLocacao + ", agenciaPrevDevolucao=" + agenciaPrevDevolucao
				+ ", dataRetirada=" + dataRetirada + ", dataDevolucao=" + dataDevolucao + ", acrescimo=" + acrescimo
				+ ", kmLocacao=" + kmLocacao + ", kmDevolucao=" + kmDevolucao + "]";
	} 
	   
	



}
