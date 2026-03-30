package com.example.LoanRequest.services;

import com.example.LoanRequest.entity.Banker;
import com.example.LoanRequest.repository.BankerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BankerServiceImpl implements BankerService{

    @Autowired
    private BankerRepository bankerRepository;

    public BankerServiceImpl(BankerRepository bankerRepository){
        this.bankerRepository = bankerRepository;
    }

    @Override
    public Banker createBanker(Banker banker) {
        return this.bankerRepository.save(banker);
    }

    @Override
    public List<Banker> FetchAllBankers() {
        return (List<Banker>)
                this.bankerRepository.findAll();

    }

    @Override
    public Banker updateBanker(Banker banker, Long BankerId) {
        Banker FoundBanker = bankerRepository.findById(BankerId).get();

        if (Objects.nonNull(banker.getFirstName())
                && !"".equalsIgnoreCase(banker.getFirstName())) {

            FoundBanker.setFirstName(banker.getFirstName());
        }

        if (Objects.nonNull(banker.getFirstName())
                && !"".equalsIgnoreCase(banker.getFirstName())) {

            FoundBanker.setFirstName(banker.getFirstName());
        }

        if (Objects.nonNull(banker.getEmail())
                && !"".equalsIgnoreCase(banker.getEmail())) {

            FoundBanker.setFirstName(banker.getEmail());
        }

        if (Objects.nonNull(banker.getPassword())
                && !"".equalsIgnoreCase(banker.getPassword())) {

            FoundBanker.setFirstName(banker.getPassword());
        }

        return bankerRepository.save(FoundBanker);
    }

    @Override
    public void deleteBanker(Long BankerId) {

        this.bankerRepository.deleteById(BankerId);

    }
}
