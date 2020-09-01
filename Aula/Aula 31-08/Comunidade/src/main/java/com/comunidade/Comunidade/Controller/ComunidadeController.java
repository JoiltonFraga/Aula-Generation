package com.comunidade.Comunidade.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Comunidade")
public class ComunidadeController {

	@GetMapping
	
	public String Comunidade() {
		
		return " O papel de um grupo é muito importante, pois nele lidamos com pessoas que nos ajudando em determinadas"
				+ " situações e ao mesmo tempo aprendemos coisas novas, ideias diferentes que venham a agregar valor. Também quando estamos em "
				+ " grupos formados por pessoas que gostamos, nos sentimos mais a vontade, os momentos são mais felizes e os momentos de tristezas"
				+ " são amenizados, pois esse sentimento é amenizado pelo conforto dos membros do grupo, no qual sempre procuram nos manter para cima. ";	
	}
	
}
