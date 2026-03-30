package com.example.LoanRequest.services;

import com.example.LoanRequest.entity.Banker;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BankerService {

    Banker createBanker(Banker banker);
    List<Banker> FetchAllBankers();
    Banker updateBanker(Banker banker, Long BankerId);
    void deleteBanker(Long BankerId);

}
