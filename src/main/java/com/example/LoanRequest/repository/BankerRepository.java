package com.example.LoanRequest.repository;

import com.example.LoanRequest.entity.Banker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankerRepository extends JpaRepository<Banker, Long> {
}
