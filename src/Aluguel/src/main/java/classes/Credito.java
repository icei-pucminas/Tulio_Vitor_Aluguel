package classes;

import bd.AluguelApplication;

public class Credito {

	private int id;
	private double valor;
	private String agente;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getAgente() {
		return agente;
	}
	public void setAgente(String agente) {
		this.agente = agente;
	}
	
	@Override
	public String toString() {
		return "Credito [id=" + id + ", valor=" + valor + ", agente=" + agente + "]";
	}
	public Credito(int id, double valor, String agente) {
		super();
		this.id = id;
		this.valor = valor;
		this.agente = agente;
	}
	public Credito(double valor, String agente) {
		super();
		this.valor = valor;
		this.agente = agente;
	}
	
	//novo contrato de credito
	public static void addCredito(double valor, String agente) {
		AluguelApplication.jdbc.update("INSERT INTO CREDITO (AGENTE_CREDITO, VALOR_CREDITO)"
				+ " VALUES (?, ?);", valor, agente);
	}
	
}
