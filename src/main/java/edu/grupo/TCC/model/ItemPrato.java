package edu.grupo.TCC.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="item_prato")
public class ItemPrato {

	@Id 
	@SequenceGenerator(name="item_prato_sequence_pk",sequenceName="item_prato_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO ,generator="item_prato_sequence_pk")
	@Column(name="id_item_prato", unique=true, nullable=false)
	private long id;

	private String nome;

	private boolean disponivel;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

}
