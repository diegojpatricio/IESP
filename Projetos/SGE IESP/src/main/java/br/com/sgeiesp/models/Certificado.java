package br.com.sgeiesp.models;

public abstract class Certificado {
	
	protected Evento nomeEvento;

	public Certificado(Evento nomeEvento) {
		super();
		this.nomeEvento = nomeEvento;
	}

	public Evento getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(Evento nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	
	

}
