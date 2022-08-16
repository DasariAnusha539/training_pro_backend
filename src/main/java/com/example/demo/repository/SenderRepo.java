package com.example.demo.repository;

import com.example.demo.model.Sendermodel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SenderRepo extends JpaRepository<Sendermodel, String>{

}