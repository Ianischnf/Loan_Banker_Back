package com.example.LoanRequest.services;

import com.example.LoanRequest.entity.Client;
import com.example.LoanRequest.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public Client CreateClient(Client client) {

        return this.clientRepository.save(client);
    }

    @Override
    public List<Client> FetchAllClient() {
        return (List<Client>)
                clientRepository.findAll();
    }

    @Override
    public Client UpdateClient(Client client, Long ClientId) {
        Client FoundClient = clientRepository.findById(ClientId).get();

        if (Objects.nonNull(client.getFirstName())
                && !"".equalsIgnoreCase(client.getFirstName())) {

            FoundClient.setFirstName(client.getFirstName());
        }

        if(Objects.nonNull(client.getLastName())
                && !"".equalsIgnoreCase(client.getLastName())) {
            FoundClient.setLastName(client.getLastName());
        }

        if(Objects.nonNull(client.getEmail())
                && !"".equalsIgnoreCase(client.getEmail())) {
            FoundClient.setEmail(client.getEmail());
        }

       /* if(Objects.nonNull(client.getRoles())
                && !"".equalsIgnoreCase(client.getRoles())) {
            FoundClient.setRoles(client.getRoles());
        }*/


        return clientRepository.save(FoundClient);
    }

    @Override
    public void DeleteClient(Long ClientId) {
        clientRepository.deleteById(ClientId);
    }
}
