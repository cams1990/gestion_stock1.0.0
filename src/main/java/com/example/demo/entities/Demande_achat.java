package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javafx.scene.text.Text;
@Entity
public class Demande_achat implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id_demande;
private Date date_demande;
private Date date_livraison;
private String doc_facture;
private String email_demande;
@OneToMany(mappedBy="demande_achat")
private Collection<Fatcture> fatctures;

public Demande_achat() {
	super();
	// TODO Auto-generated constructor stub
}


public Demande_achat(Date date_demande, Date date_livraison, String doc_facture, String email_demande,
		Collection<Fatcture> fatctures) {
	super();
	this.date_demande = date_demande;
	this.date_livraison = date_livraison;
	this.doc_facture = doc_facture;
	this.email_demande = email_demande;
	this.fatctures = fatctures;
}

public Long getId_demande() {
	return id_demande;
}


public void setId_demande(Long id_demande) {
	this.id_demande = id_demande;
}

public Date getDate_demande() {
	return date_demande;
}

public void setDate_demande(Date date_demande) {
	this.date_demande = date_demande;
}

public Date getDate_livraison() {
	return date_livraison;
}

public void setDate_livraison(Date date_livraison) {
	this.date_livraison = date_livraison;
}

public String getDoc_facture() {
	return doc_facture;
}

public void setDoc_facture(String doc_facture) {
	this.doc_facture = doc_facture;
}

public String getEmail_demande() {
	return email_demande;
}

public void setEmail_demande(String email_demande) {
	this.email_demande = email_demande;
}

public Collection<Fatcture> getFatctures() {
	return fatctures;
}

public void setFatctures(Collection<Fatcture> fatctures) {
	this.fatctures = fatctures;
}

public Demande_achat(Date date_demande, Date date_livraison, String doc_facture, String email_demande) {
	super();
	this.date_demande = date_demande;
	this.date_livraison = date_livraison;
	this.doc_facture = doc_facture;
	this.email_demande = email_demande;
}

}
