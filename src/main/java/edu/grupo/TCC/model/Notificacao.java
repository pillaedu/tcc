package edu.grupo.TCC.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Notificacao{

	@Id 
	@SequenceGenerator(name="notificacao_sequence_pk",sequenceName="notificacao_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO ,generator="notificacao_sequence_pk")
	@Column(name="id_notificacao", unique=true, nullable=false)
	private long id;
	
	//private Cliente user;
	
	private String texto;

	
	public Notificacao(Cliente user, String texto) {
		super();
		//this.user = user;
		this.texto = texto;
	}

	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


/*	public Cliente getUser() {
		return user;
	}

	public void setUser(Cliente user) {
		this.user = user;
	}
*/
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
}
