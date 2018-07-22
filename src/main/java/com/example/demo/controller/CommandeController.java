package com.example.demo.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Commande;
import com.example.demo.services.CommandeService;

@RestController
public class CommandeController {
	/*@Autowired
private CommandeService serviceCommande;
	@RequestMapping(value="/")
	public Commande afficher(Commande c){
		return serviceCommande.ajouterCommande(c);
		
	}
	@RequestMapping(value="/ajouterCommande")
	public String ajouer(){
		Le code de la fonction ajouterCommandef
		return ( "AjouterCommande");
	}*/
}
