package com.example.LoanRequest.repository;

import com.example.LoanRequest.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ClientRepository extends JpaRepository<Client, Long> {



}
