package com.escola.turmas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escola.turmas.model.Aluno;
import com.escola.turmas.repository.AlunoRepository;

@RestController
@RequestMapping ("/alunos")
@CrossOrigin ("*")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
@GetMapping("/{id}")
	
	public ResponseEntity<Aluno> GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	
}
@PostMapping
public ResponseEntity<Aluno> post (@RequestBody Aluno novoaluno){
	return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(novoaluno));
}

@PutMapping
public ResponseEntity<Aluno> put (@RequestBody Aluno novoaluno){
	return ResponseEntity.status(HttpStatus.OK).body(repository.save(novoaluno));
}

@DeleteMapping ("/{id}")
public void delete (@PathVariable long id) {
	repository.deleteById(id);
}

}
