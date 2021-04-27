package classes;

import bd.AluguelApplication;

public class Cliente extends Usuario{

	private double rendimento;
	private String endereco;
	private int cpf;
	private int rg;
	private String profissao;
	private String entEmp;
	
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getEntEmp() {
		return entEmp;
	}
	public void setEntEmp(String entEmp) {
		this.entEmp = entEmp;
	}
	
	@Override
	public String toString() {
		return "Cliente [rendimento=" + rendimento + ", endereco=" + endereco + ", cpf=" + cpf + ", rg=" + rg
				+ ", profissao=" + profissao + ", entEmp=" + entEmp + ", getId()=" + getId() + ", getNome()="
				+ getNome() + "]";
	}
	
	//Cria cliente
	public static void addCliente( int ID_USUARIO, double RENDIMENTO, String ENDERENCO, int CPF, 
			int RG, String PROFISSAO, String ENTIDADE_EMP) {
		
		AluguelApplication.jdbc.update("INSERT INTO CLIENTE (ID_USUARIO,RENDIMENTO, ENDERENCO, CPF, "
				+ "RG, PROFISSAO, ENTIDADE_EMP"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?);",
				ID_USUARIO,RENDIMENTO, ENDERENCO, CPF, RG, PROFISSAO, ENTIDADE_EMP);
	}
	
	
	
	
}
