package classes;


import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

import bd.AluguelApplication;

public class Pedido {
	
	private int id;
	private String nome;
	private String descricao;
	private int idUsuario;
	private int matriculaAutomovel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getMatriculaAutomovel() {
		return matriculaAutomovel;
	}
	public void setMatriculaAutomovel(int matriculaAutomovel) {
		this.matriculaAutomovel = matriculaAutomovel;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", idUsuario=" + idUsuario
				+ ", matriculaAutomovel=" + matriculaAutomovel + "]";
	}
	public Pedido(int id, String nome, String descricao, int idUsuario, int matriculaAutomovel) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.idUsuario = idUsuario;
		this.matriculaAutomovel = matriculaAutomovel;
	}
	
		
	//CRUD de pedidos
	//Cliente -> C, R, U, D
	//Agente -> Analisar e U
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	//Cria pedido
	public static void  addPedido(String nome, String descricao, int idUsuario, int matriculaAutomovel) {
		AluguelApplication.jdbc.update("INSERT INTO PEDIDO (NOME, DESCRICAO, ID_USUARIO, "
				+ "MATRICULA_AUTOMOVEL) VALUES (?, ?, ?, ?);",
				nome, descricao, idUsuario, matriculaAutomovel);
	}
	
	//Modifica pedido baseado no ID
	public static void updatePedido(int id, String nome, String descricao, int idUsuario, int matriculaAutomovel) {
		AluguelApplication.jdbc.update("UPDATE PEDIDO SET NOME = ?, DESCRICAO = ?, ID_USUARIO = ?,"
				+ "MATRICULA_AUTOMOVEL = ? WHERE ID = ?", nome, descricao, idUsuario, matriculaAutomovel, id);
	}
	
	//le pedido baseado no ID
	public static Pedido readPedido(int id) {
		
		
		return (Pedido) AluguelApplication.jdbc.queryForObject(
	            "SELECT * FROM PEDIDO WHERE ID = ?", new BeanPropertyRowMapper<Pedido>(Pedido.class),
	            new Object[]{id});
	}
	
	//deleta pedido baseado no ID
	public static void deletePedido(int id) {
		AluguelApplication.jdbc.update("DELETE FROM PEDIDO WHERE ID = ?", new Object[] {id});
	}
	
	//Pedido aceito -> Contrato
	public static Contrato pedidoToContrato( int idPedido,String tipoContrato, int idCredito) {
		
		return new Contrato(tipoContrato, idPedido,  idCredito);
		
		
	}
	
	
	public List<Pedido>  list(){
		
		List<Pedido> listpedido = AluguelApplication.jdbc.query("SELECT * FROM PEDIDO ", BeanPropertyRowMapper.newInstance(Pedido.class));
		
		return listpedido;
		
		
	}

}
