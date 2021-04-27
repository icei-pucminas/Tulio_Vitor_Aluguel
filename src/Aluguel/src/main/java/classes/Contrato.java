package classes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import bd.AluguelApplication;

public class Contrato {
	
	private int id;
	private String tipoContrato;
	
	private int idPedido;
	private int idCredito;
	
	private static ArrayList<Contrato> listaContratos = new ArrayList<>();
	
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
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getIdCredito() {
		return idCredito;
	}
	public void setIdCredito(int idCredito) {
		this.idCredito = idCredito;
	}
	@Override
	public String toString() {
		return "Contrato [id=" + id + ", tipoContrato=" + tipoContrato + ", idPedido=" + idPedido + ", idCredito="
				+ idCredito + "]";
	}
	
	public Contrato(String tipoContrato, int idPedido, int idCredito) {
		this.tipoContrato = tipoContrato;
		this.idPedido = idPedido;
		this.idCredito = idCredito;
	}
	
	public Contrato() {
		// TODO Auto-generated constructor stub
	}
	//novo contrato no bd
	public static void addContrato(Contrato c) {
		AluguelApplication.jdbc.update("INSERT INTO CONTRATO (TIPO_CONTRATO, ID_PEDIDO, ID_CREDITO)"
				+ " VALUES (?, ?, ?);",
				c.getTipoContrato(), c.getIdPedido(), c.getIdCredito());
	}
	
	//novo contrato na lista de pre aprovados
	public static void preAnaliseContrato(Contrato c) {
		listaContratos.add(c);
	}
	
public List<Contrato>  list(){
		
		List<Contrato> listcontrato = AluguelApplication.jdbc.query("SELECT * FROM CONTRATO ", BeanPropertyRowMapper.newInstance(Contrato.class));
		
		return listcontrato;
		
		
	}

}
