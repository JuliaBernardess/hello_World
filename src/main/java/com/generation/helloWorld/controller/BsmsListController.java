package com.generation.helloWorld.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listabsms")
public class BsmsListController {
    
	
	
	@GetMapping 
	public ArrayList listaBSMS () {
	
    
	
	ArrayList <String> listaBSMS = new ArrayList<String>();
	
	listaBSMS.add("Mentalidade de crescimento");
	listaBSMS.add("Orientação aos detalhes");
	listaBSMS.add("Responsabilidade pessoal");
	listaBSMS.add("Trabalho em equipe");
	listaBSMS.add("Persistência");
	listaBSMS.add("Comunicação");
	listaBSMS.add("Proatividade");
	listaBSMS.add("Orientação ao futuro");
	
	return listaBSMS;
	
	
	} 
	
	/* Outra forma de fazer usando vetor */
	
    /*public String [] listaBSMS() {
		
		String vetor [] = {"Comunicação", "Proatividade", "Orientação aos detalhes" };
		
		return vetor;
		
	}*/
}
	
	
	

