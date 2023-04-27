package com.ruansouza.ListaTarefas.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.ruansouza.ListaTarefas.entidades.enuns.AtividadesStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tarefas")
public class Tarefas implements Serializable{

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private Date comeco;
	private Date termino;
	private AtividadesStatus status;
	
	public Tarefas() {
	}

	public Tarefas(Long id,String nome, String descricao, Date comeco, Date termino, AtividadesStatus status) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.comeco = comeco;
		this.termino = termino;
		this.status = status;
		
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getComeco() {
		return comeco;
	}

	public void setComeco(Date comeco) {
		this.comeco = comeco;
	}

	public Date getTermino() {
		return termino;
	}

	public void setTermino(Date termino) {
		this.termino = termino;
	}

	public AtividadesStatus getStatus() {
		return status;
	}

	public void setStatus(AtividadesStatus status) {
		this.status = status;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefas other = (Tarefas) obj;
		return Objects.equals(id, other.id);
	}



	
	
	
}
