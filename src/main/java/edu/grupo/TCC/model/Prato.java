package edu.grupo.TCC.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Prato{

	@Id 
	@SequenceGenerator(name="prato_sequence_pk",sequenceName="prato_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO ,generator="prato_sequence_pk")
	@Column(name="id_prato", unique=true, nullable=false)
	private long id;
	
	private String nome;
	
	@Column(name="valor", precision=2, nullable=false)
	private float valor;
	
	private String tipo;
	
	@ManyToOne
	private Pedido pedido;

	
	//getters and setters
		
	public String getNome() {
		return nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
	
	
}
