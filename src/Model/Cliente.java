package Model;

import java.sql.Date;

public class Cliente {
	
	public int CodCliente;
	public String nome;
	public String CPF;
	public String RG;
	public String dataNasc;
	public String numHabi;
	public String estadoEmi;
	public String cateHabi;
	public String validade;
	public String sexo;
	public String endereco;
	public int telefone;
	public String email;
	
	
	
	public int getCodCliente() {
		return CodCliente;
	}
	public void setCodCliente(int codCliente) {
		CodCliente = codCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getNumHabi() {
		return numHabi;
	}
	public void setNumHabi(String numHabi) {
		this.numHabi = numHabi;
	}
	public String getEstadoEmi() {
		return estadoEmi;
	}
	public void setEstadoEmi(String estadoEmi) {
		this.estadoEmi = estadoEmi;
	}
	public String getCateHabi() {
		return cateHabi;
	}
	public void setCateHabi(String cateHabi) {
		this.cateHabi = cateHabi;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", CPF=" + CPF + ", RG=" + RG + ", dataNasc=" + dataNasc + ", numHabi="
				+ numHabi + ", estadoEmi=" + estadoEmi + ", cateHabi=" + cateHabi + ", validade=" + validade + ", sexo="
				+ sexo + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + "]";
	}
	
	
	

}
