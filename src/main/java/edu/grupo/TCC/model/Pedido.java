package edu.grupo.TCC.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido{

	@Id 
	@SequenceGenerator(name="pedido_sequence_pk",sequenceName="pedido_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO ,generator="pedido_sequence_pk")
	@Column(name="id_pedido", unique=true, nullable=false)
	private long id;
	
	@Column(name="status", nullable=false)
	private String status;
	
	@Column(name="valor", precision=2, nullable=false)
	private float valor;
	
	@Column(name="data_pedido", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date data;
	
	/*
	//@ManyToOne
	private Cliente cliente;
	
	//@OneToMany
	private List<Prato> prato;
	
	*/
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	/*
	public Cliente getUsuario() {
		return cliente;
	}
	public void setUsuario(Cliente usuario) {
		this.cliente = usuario;
	}
	*/
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getData() {
		return (Date) data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
