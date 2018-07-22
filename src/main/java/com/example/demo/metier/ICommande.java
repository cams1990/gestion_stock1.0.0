package com.example.demo.metier;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Commande;

public interface ICommande extends JpaRepository<Commande, Long> {
/*@Query("select c from commande c")
public List<Commande> list();*/

}
