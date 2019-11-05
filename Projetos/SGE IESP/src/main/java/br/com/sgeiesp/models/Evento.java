package br.com.sgeiesp.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idEvento;
	
	private String nomeEvento, local, horario;
	private String data;
	private Administrador administrador;
	private Departamento departamento;
	
	
	public Evento(String nomeEvento, String local, String horario, String data,
			Administrador administrador, Departamento departamento) {
		super();
		this.nomeEvento = nomeEvento;
		this.local = local;
		this.horario = horario;
		this.data = data;
		this.administrador = administrador;
		this.departamento = departamento;
	}

	

	public long getIdEvento() {
		return idEvento;
	}



	public void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}



	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}



	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	

}
