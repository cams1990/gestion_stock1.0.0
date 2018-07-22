package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Users implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id_user;
private String username;
private String password;
private String email_user;
@OneToMany(mappedBy="users")
private Collection<Fatcture> facture_user;

public Users() {
	super();
	// TODO Auto-generated constructor stub
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail_user() {
	return email_user;
}

public void setEmail_user(String email_user) {
	this.email_user = email_user;
}

public Users(String username, String password, String email_user, Collection<Fatcture> facture_user) {
	super();
	this.username = username;
	this.password = password;
	this.email_user = email_user;
	this.facture_user = facture_user;
}

public Long getId_user() {
	return id_user;
}

public void setId_user(Long id_user) {
	this.id_user = id_user;
}

public Collection<Fatcture> getFacture_user() {
	return facture_user;
}

public void setFacture_user(Collection<Fatcture> facture_user) {
	this.facture_user = facture_user;
}

}
