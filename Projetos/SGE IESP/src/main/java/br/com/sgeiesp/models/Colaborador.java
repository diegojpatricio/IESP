package br.com.sgeiesp.models;

public abstract class Colaborador extends Usuario{
	
	protected String especialidade;

	public Colaborador(String nome, String email, String senha, int identificador, String especialidade) {
		super(nome, email, senha, identificador);
		this.especialidade = especialidade;
	}

}
