package com.example.LoanRequest.controller;

import com.example.LoanRequest.entity.Banker;
import com.example.LoanRequest.services.BankerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banker")
public class BankerController {

    @Autowired
    private BankerService bankerService;

    public BankerController(BankerService bankerService) {
        this.bankerService = bankerService;
    }

    @PostMapping
    public Banker createBanker(@RequestBody Banker banker){
        return this.bankerService.createBanker(banker);
    }

    @GetMapping
    public List<Banker> FetchAllBankers() {
        return this.bankerService.FetchAllBankers();
    }

    @PutMapping("/{id}")
    public Banker updateBanker(@RequestBody Banker banker, @PathVariable Long BankerId){
        return this.bankerService.updateBanker(banker, BankerId);
    }

    @DeleteMapping("/{id}")
    void deleteBanker(@PathVariable Long BankerId){
        this.bankerService.deleteBanker(BankerId);
    }

}
