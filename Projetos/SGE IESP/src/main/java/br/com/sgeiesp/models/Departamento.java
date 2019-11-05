package br.com.sgeiesp.models;

public class Departamento {
	private String nomeDepartamento, idDepartamento;

	public Departamento(String nomeDepartamento, String idDepartamento) {
		super();
		this.nomeDepartamento = nomeDepartamento;
		this.idDepartamento = idDepartamento;
	}

	public String getNomeDepartamento() {
		return nomeDepartamento;
	}

	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}

	public String getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(String idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	
	

}
