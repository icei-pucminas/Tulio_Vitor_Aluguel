package classes;

import bd.AluguelApplication;

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
	
	
	public Automovel(int matricula, String placa, String marca, String modelo, int ano) {
		super();
		this.matricula = matricula;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	//novo automovel
	public static void addAutomovel(int matricula, String placa, String marca, String modelo, int ano) {
		AluguelApplication.jdbc.update("INSERT INTO AUTOMOVEL (MATRICULA, PLACA, MARCA, MODELO, ANO)"
				+ "VALUES (?,?,?,?,?)", matricula, placa, marca, modelo, ano);
	}
	
	

}
