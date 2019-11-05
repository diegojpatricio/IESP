package br.com.sgeiesp.models;

public class ColaboradorPJ extends Colaborador{
	
	private String nomeEmpresa, CNPJ;

	public ColaboradorPJ(String nome, String email, String senha, int identificador, String especialidade,
			String nomeEmpresa, String cNPJ) {
		super(nome, email, senha, identificador, especialidade);
		this.nomeEmpresa = nomeEmpresa;
		CNPJ = cNPJ;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	

}
