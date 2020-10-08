package br.com.fiap.entity;

import java.io.Serializable;

public class Cliente implements Serializable {


	private static final long serialVersionUID = 1L;

	private int id;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	private String nome;

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

}
