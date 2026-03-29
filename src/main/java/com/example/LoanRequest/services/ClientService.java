package com.example.LoanRequest.services;

import com.example.LoanRequest.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {

    Client CreateClient(Client client);
    List<Client> FetchAllClient();
    Client UpdateClient(Client client, Long ClientId);
    void DeleteClient(Long ClientId);

}
