package br.com.sgeiesp.models;

public class CertificadoColaborador extends Certificado{
	
	private Colaborador nomeColaborador;

	public CertificadoColaborador(Evento nomeEvento, Colaborador nomeColaborador) {
		super(nomeEvento);
		this.nomeColaborador = nomeColaborador;
	}

	public Colaborador getNomeColaborador() {
		return nomeColaborador;
	}

	public void setNomeColaborador(Colaborador nomeColaborador) {
		this.nomeColaborador = nomeColaborador;
	}
	
	

}
