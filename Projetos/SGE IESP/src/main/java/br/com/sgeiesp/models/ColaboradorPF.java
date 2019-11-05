package br.com.sgeiesp.models;

public class ColaboradorPF extends Colaborador{
	
	private String nomeColaborador, CPF;

	public ColaboradorPF(String nome, String email, String senha, int identificador, String especialidade,
			String nomeColaborador, String cPF) {
		super(nome, email, senha, identificador, especialidade);
		this.nomeColaborador = nomeColaborador;
		CPF = cPF;
	}

	public String getNomeColaborador() {
		return nomeColaborador;
	}

	public void setNomeColaborador(String nomeColaborador) {
		this.nomeColaborador = nomeColaborador;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	

	
	

}
