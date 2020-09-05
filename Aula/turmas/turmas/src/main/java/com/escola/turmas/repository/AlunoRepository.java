package com.escola.turmas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.turmas.model.Aluno;


public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	public List<Aluno> findALLByNomeContainingIgnoreCase (String nome);

}

