package edu.grupo.TCC.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido extends GeneralEntity{

	@Column(name="status", nullable=false)
	private String status;
	
	@Column(name="valor", precision=2, nullable=false)
	private float valor;
	
	@Column(name="data_pedido", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date data;
	
	@ManyToOne
	private Cliente cliente;
	
	@OneToMany
	private List<Prato> prato;
	
	
	
	public Cliente getUsuario() {
		return cliente;
	}
	public void setUsuario(Cliente usuario) {
		this.cliente = usuario;
	}
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
