package br.com.sgeiesp.models;

public class Administrador extends Usuario {
	
	private String matricula;
	
	
	public Administrador(String nome, String email, String senha, int identificador, String matricula) {
		super(nome, email, senha, identificador);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
