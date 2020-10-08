package br.com.fiap.entity;

import java.util.List;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	
//	@ManyToMany(cascade = CascadeType.PERSIST)
//	@JoinTable(joinColumns = @JoinColumn(name="id_estabelecimento"),
//			inverseJoinColumns = @JoinColumn(name="id_cliente"),
//			name="tb_cliente_estabelecimento")
//	private List<Cliente> clientes;
//	
//    @OneToOne(mappedBy="estabelecimento", cascade = CascadeType.PERSIST)
//    private ContratoAluguel contrado;
//    
//	@ManyToOne(cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "id_tipo_estabelecimento")
//	private TipoEstabelecimento tipo;
//	
//	public Estabelecimento(int id, String nome, List<Cliente> clientes, ContratoAluguel contrado,
//			TipoEstabelecimento tipo) {
//		super();
//		this.id = id;
//		this.nome = nome;
//		this.clientes = clientes;
//		this.contrado = contrado;
//		this.tipo = tipo;
//	}
//
//	public Estabelecimento() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
}