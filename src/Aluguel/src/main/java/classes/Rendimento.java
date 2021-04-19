package classes;

public class Rendimento {
	
	private int id;
	private int rAtual;
	//Limitando max a 3
	private final int RMAX = 3;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getrAtual() {
		return rAtual;
	}
	public void setrAtual(int rAtual) {
		this.rAtual = rAtual;
	}
	public int getRMAX() {
		return RMAX;
	}
	@Override
	public String toString() {
		return "Rendimento [id=" + id + ", rAtual=" + rAtual + ", RMAX=" + RMAX + "]";
	}
	
	

}
