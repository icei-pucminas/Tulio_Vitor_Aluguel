package classes;

public class Automovel {
	
	private int matricula;
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "Automovel [matricula=" + matricula + ", placa=" + placa + ", marca=" + marca + ", modelo=" + modelo
				+ ", ano=" + ano + "]";
	}
	
	

}
