package com.example.LoanRequest.services;

import com.example.LoanRequest.entity.Client;

import java.util.List;

public interface ClientService {

    Client CreateClient(Client client);
    List<Client> FetchAllClient();
    Client UpdateClient(Client client, Long ClientId);
    void DeleteClient(Long ClientId);

}
