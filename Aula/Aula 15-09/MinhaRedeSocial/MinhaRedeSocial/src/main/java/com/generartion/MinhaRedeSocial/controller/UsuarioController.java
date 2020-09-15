package com.generartion.MinhaRedeSocial.controller;

import java.util.List;
import java.util.Optional;

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

import com.generartion.MinhaRedeSocial.model.UserLogin;
import com.generartion.MinhaRedeSocial.model.Usuario;
import com.generartion.MinhaRedeSocial.repository.UsuarioRepository;
import com.generartion.MinhaRedeSocial.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin (origins ="*", allowedHeaders ="*")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	 @PostMapping ("/logar")
		public ResponseEntity<UserLogin> Autentication (@RequestBody Optional<UserLogin>user){
			return usuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp)).
					orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
		}
		
		@PostMapping("/cadastrar")
		public ResponseEntity<Usuario> Post(@RequestBody Usuario usuario){
			return ResponseEntity.status(HttpStatus.CREATED).
					body(usuarioService.CadastrarUsuario(usuario));
		}
	
	@GetMapping
	private ResponseEntity<List<Usuario>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping ("/{id}")
	private ResponseEntity<Usuario> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
		}
	
	@PutMapping
	public ResponseEntity<Usuario> put(@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(usuario));
	}
	
	@PostMapping
	public ResponseEntity<Usuario> post(@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(usuario));
}
	
	@DeleteMapping ("/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}
}
