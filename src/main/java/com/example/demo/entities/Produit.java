package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

import org.springframework.lang.Nullable;

@Entity
public class Produit implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private double idProduit;
	@Nullable
	private String reference;
	private String designation;
	private double prix_unitaire;
	private int quantite;
	@ManyToMany
	private Collection<Commande> commandes;
	@ManyToMany
	private Collection<Fatcture> fatctures;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(String reference, String designation, double prix_unitaire, int quantite) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prix_unitaire = prix_unitaire;
		this.quantite = quantite;
	}

	public double getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(double idProduit) {
		this.idProduit = idProduit;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix_unitaire() {
		return prix_unitaire;
	}

	public void setPrix_unitaire(double prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
}
