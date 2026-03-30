package com.example.LoanRequest.services;

import com.example.LoanRequest.entity.Banker;

import java.util.List;

public interface BankerService {

    Banker createBanker(Banker banker);
    List<Banker> FetchAllBankers();
    Banker updateBanker(Banker banker, Long BankerId);
    void deleteBanker(Long BankerId);

}
