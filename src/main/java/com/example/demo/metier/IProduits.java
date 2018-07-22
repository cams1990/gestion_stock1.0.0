package com.example.demo.metier;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Produit;

public interface IProduits extends JpaRepository<Produit, Long>{

}
