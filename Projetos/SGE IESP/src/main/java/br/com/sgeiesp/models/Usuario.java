package br.com.sgeiesp.models;

public abstract class Usuario {
	protected String nome, email, senha;
	protected int identificador;
	
	public Usuario(String nome, String email, String senha, int identificador) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.identificador = identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	
	
	
}
