package edu.grupo.TCC.model;

import javax.persistence.Entity;

@Entity
public class Notificacao extends GeneralEntity{

	private Cliente user;
	
	private String texto;

	
	public Notificacao(Cliente user, String texto) {
		super();
		this.user = user;
		this.texto = texto;
	}

	public Cliente getUser() {
		return user;
	}

	public void setUser(Cliente user) {
		this.user = user;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
}
