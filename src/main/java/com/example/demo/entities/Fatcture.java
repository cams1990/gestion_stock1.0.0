package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.apache.catalina.User;

@Entity
public class Fatcture implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_facture;
	private Date date_facture;
	@ManyToOne
	@JoinColumn(name="id_demande")
	private Demande_achat demande_achat;
	@ManyToOne
	@JoinColumn
	private Users users;
	
	public Fatcture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fatcture(Date date_facture, Demande_achat demande_achat) {
		super();
		this.date_facture = date_facture;
		this.demande_achat = demande_achat;
	}

	public Long getId_facture() {
		return id_facture;
	}

	public void setId_facture(Long id_facture) {
		this.id_facture = id_facture;
	}

	public Date getDate_facture() {
		return date_facture;
	}

	public void setDate_facture(Date date_facture) {
		this.date_facture = date_facture;
	}

	public Demande_achat getDemande_achat() {
		return demande_achat;
	}

	public void setDemande_achat(Demande_achat demande_achat) {
		this.demande_achat = demande_achat;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	 
	
}
