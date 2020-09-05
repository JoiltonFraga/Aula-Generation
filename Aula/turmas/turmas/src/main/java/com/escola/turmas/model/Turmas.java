package com.escola.turmas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "Turmas")
public class Turmas {

	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size (min =1,max =20)
	private String turma;
	
	private Boolean ativo;
	
	@OneToMany (mappedBy = "turma", cascade = CascadeType.ALL)
	@JsonIgnoreProperties ("turma")
	private List<Aluno> aluno;
	
	
	public List<Aluno> getAluno() {
		return aluno;
	}
	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	
}
