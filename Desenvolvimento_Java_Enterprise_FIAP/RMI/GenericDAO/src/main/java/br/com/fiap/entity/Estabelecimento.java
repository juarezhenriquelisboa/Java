package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tb_estabelecimento")
public class Estabelecimento {

	@Id
	@Column(name="id_estabelecimento")
	@SequenceGenerator(name="estabelecimento", sequenceName="sq_tb_estabelecimento", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="estabelecimento")
	private int id;
	
	@Column(name="nm_estabelecimento", nullable=false, length=50)
	private String nome;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dh_criacao")
	private Calendar dataCriacao;

	public Estabelecimento(int id, String nome, Calendar dataCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
	}

	public Estabelecimento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
}
