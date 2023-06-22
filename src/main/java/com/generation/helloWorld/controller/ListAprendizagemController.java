package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendizagem")


public class ListAprendizagemController {

	@GetMapping
	 public String aprendizagem() {
			
		return "\t Aprender sobre banco de dados - mySQL \n"+
		       "\t Aprender Spring Boot \n"+ 
	           "\t Reforçar as Bsms com dinâmicas nas aulas \n" +
		       "\t Refletir sobre avaliacão do feedback e definir estrategias.   \n";
		
			
		}
	
	
}
