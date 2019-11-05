package br.com.sgeiesp.models;

import java.util.ArrayList;
import java.util.List;

public class Inscricao {
	
	private String idInscricao;
	private Evento evento;
	private List<UsuarioCadastrado> usuarios = new ArrayList<UsuarioCadastrado>();
	
	public Inscricao(String idInscricao, Evento evento, List<UsuarioCadastrado> usuarios) {
		super();
		this.idInscricao = idInscricao;
		this.evento = evento;
		this.usuarios = usuarios;
	}

	public String getIdInscricao() {
		return idInscricao;
	}

	public void setIdInscricao(String idInscricao) {
		this.idInscricao = idInscricao;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public List<UsuarioCadastrado> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioCadastrado> usuarios) {
		this.usuarios = usuarios;
	}

	

}
