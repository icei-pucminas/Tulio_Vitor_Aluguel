package classes;

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
	
}
