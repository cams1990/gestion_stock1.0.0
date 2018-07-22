package com.example.demo.metier;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Users;

public interface IUsers extends JpaRepository<Users, Long> {

}
