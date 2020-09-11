package com.generartion.MinhaRedeSocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generartion.MinhaRedeSocial.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	public List<Postagem> findALLByDescricaoContainingIgnoreCase (String descricao);
}
