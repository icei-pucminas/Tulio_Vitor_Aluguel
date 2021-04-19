package classes;

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
	public void setIdUsuario(Cliente idUsuario) {
		this.idUsuario = idUsuario.getId();
	}
	public int getMatriculaAutomovel() {
		return matriculaAutomovel;
	}
	public void setMatriculaAutomovel(Automovel matriculaAutomovel) {
		this.matriculaAutomovel = matriculaAutomovel.getMatricula();
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
		

}
