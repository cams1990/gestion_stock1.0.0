package com.example.demo.metier;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Demande_achat;

public interface IDemande extends JpaRepository<Demande_achat, Long> {

}
