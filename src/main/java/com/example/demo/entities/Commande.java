package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commande implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private Date date_commande;
/*Exploiter la relation manyToMany pour lister toutes les produit d'une commande*/

public Commande() {
	super();
	// TODO Auto-generated constructor stub
}
}

