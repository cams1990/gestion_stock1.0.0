package com.example.demo.metier;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Fatcture;

public interface IFacture extends JpaRepository<Fatcture, Long> {

}
