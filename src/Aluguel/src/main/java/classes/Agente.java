package classes;

import bd.AluguelApplication;

public class Agente extends Usuario{
	
	private int numPedido;
	private String emp_Banco;
	public int getNumPedido() {
		return numPedido;
	}
	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}
	public String getEmp_Banco() {
		return emp_Banco;
	}
	public void setEmp_Banco(String emp_Banco) {
		this.emp_Banco = emp_Banco;
	}
	@Override
	public String toString() {
		return "Agente [numPedido=" + numPedido + ", emp_Banco=" + emp_Banco + ", getId()=" + getId() + ", getNome()="
				+ getNome() + "]";
	}
	
	//novo Agente
	public static void addAgente(Pedido p, String emp_Banco) {
		AluguelApplication.jdbc.update("INSERT INTO AGENTE (NUM_PEDIDO, EMP_BANCO)"
				+ " VALUES (?, ?);",
				p.getId(), emp_Banco);
	}

}
