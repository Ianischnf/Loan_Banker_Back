package com.example.LoanRequest.controller;

import com.example.LoanRequest.entity.Client;
import com.example.LoanRequest.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    public ClientController(ClientService clientService){

        this.clientService = clientService;
    }

    @PostMapping
    public Client CreateClient(@RequestBody Client client){
        return this.clientService.CreateClient(client);
    }

    @GetMapping
    public List<Client> FetchAllClient(){
        return this.clientService.FetchAllClient();
    }

    @PutMapping("/{id}")
    public Client UpdateClient(@RequestBody Client client, @PathVariable("id") Long clientId) {
        return this.clientService.UpdateClient(client, clientId);
    }

    @DeleteMapping("/{id}")
    public void DeleteClient(@PathVariable("id") Long clientId){
        this.clientService.DeleteClient(clientId);
    }

}
