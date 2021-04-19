package classes;

public class Contrato {
	
	private int id;
	private String tipoContrato;
	
	private int idPedido;
	private int idCredito;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Pedido idPedido) {
		this.idPedido = idPedido.getId();
	}
	public int getIdCredito() {
		return idCredito;
	}
	public void setIdCredito(Credito idCredito) {
		this.idCredito = idCredito.getId();
	}
	@Override
	public String toString() {
		return "Contrato [id=" + id + ", tipoContrato=" + tipoContrato + ", idPedido=" + idPedido + ", idCredito="
				+ idCredito + "]";
	}
	
	

}
