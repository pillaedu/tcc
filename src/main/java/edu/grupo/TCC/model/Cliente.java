package edu.grupo.TCC.model;

import javax.persistence.Entity;

@Entity
public class Cliente extends GeneralEntity{

	private String nome;

	private String email;
	
	private String username;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
