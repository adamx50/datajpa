package com.adamcompany.datajpa.datajpa.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	private String email;
	
	private Double pontos;
	
	public Usuario() {}

	public Usuario(String nome, Date dataNascimento, String email, Double pontos) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.pontos = pontos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getPontos() {
		return pontos;
	}

	public void setPontos(Double pontos) {
		this.pontos = pontos;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", email=" + email
				+ ", pontos=" + pontos + "]";
	}
}
