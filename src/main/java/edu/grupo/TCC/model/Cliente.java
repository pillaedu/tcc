package edu.grupo.TCC.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(
		columnNames = "user_name" ,name = "cliente_unique_name" )
)
public class Cliente{
	
	@Id 
	@SequenceGenerator(name="cliente_sequence_pk",sequenceName="cliente_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO ,generator="cliente_sequence_pk")
	@Column(name="id_cliente", unique=true, nullable=false)
	private long id;

	private String nome;

	private String email;
	
	@Column(name="user_name", unique=true)
	private String username;
	
	private String cpf;

	//@OneToMany(mappedBy = "cliente")
	//private List<Pedido> pedido;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/*
	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	*/
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
/*
	public List<Pedido> getPedidos() {
		return pedido;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedido = pedidos;
	}
*/
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
