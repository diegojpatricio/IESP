package br.com.sgeiesp.models;

public class CertificadoAluno extends Certificado{
	
	private UsuarioCadastrado nomeAluno;

	public CertificadoAluno(Evento nomeEvento, UsuarioCadastrado nomeAluno) {
		super(nomeEvento);
		this.nomeAluno = nomeAluno;
	}

	public UsuarioCadastrado getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(UsuarioCadastrado nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	

}
