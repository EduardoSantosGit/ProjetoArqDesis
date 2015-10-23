package Model;

public class Veiculo {

	
	   public int codVeiculo;
	   public int chassi;
	   public String placa;
	   public String fabricante;
	   public String cidade;
	   public String estado;
	   public double kmRodado;
	   public String acessorio;
	   public double tarifaKmLivre;
	   public double kmControlado;
	   public String grupo;
	   public String modelo;
	   public int codMarca;
	   public int codAcessorio;
	   
	   
	public int getCodVeiculo() {
		return codVeiculo;
	}
	public void setCodVeiculo(int codVeiculo) {
		this.codVeiculo = codVeiculo;
	}
	public int getChassi() {
		return chassi;
	}
	public void setChassi(int chassi) {
		this.chassi = chassi;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public double getKmRodado() {
		return kmRodado;
	}
	public void setKmRodado(double kmRodado) {
		this.kmRodado = kmRodado;
	}
	public String getAcessorio() {
		return acessorio;
	}
	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}
	public double getTarifaKmLivre() {
		return tarifaKmLivre;
	}
	public void setTarifaKmLivre(double tarifaKmLivre) {
		this.tarifaKmLivre = tarifaKmLivre;
	}
	public double getKmControlado() {
		return kmControlado;
	}
	public void setKmControlado(double kmControlado) {
		this.kmControlado = kmControlado;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCodMarca() {
		return codMarca;
	}
	public void setCodMarca(int codMarca) {
		this.codMarca = codMarca;
	}
	public int getCodAcessorio() {
		return codAcessorio;
	}
	public void setCodAcessorio(int codAcessorio) {
		this.codAcessorio = codAcessorio;
	}
	@Override
	public String toString() {
		return "Veiculo [codVeiculo=" + codVeiculo + ", chassi=" + chassi + ", placa=" + placa + ", fabricante="
				+ fabricante + ", cidade=" + cidade + ", estado=" + estado + ", kmRodado=" + kmRodado + ", acessorio="
				+ acessorio + ", tarifaKmLivre=" + tarifaKmLivre + ", kmControlado=" + kmControlado + ", grupo=" + grupo
				+ ", modelo=" + modelo + ", codMarca=" + codMarca + ", codAcessorio=" + codAcessorio + "]";
	}
	   
	   
}
