package org.example.controllers;

import org.example.models.Clients;
import org.example.models.Masters;
import org.example.repository.ClientsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path="/")
public class ClientsController {
    @Autowired
    private ClientsRepository clientsRepository;


    @GetMapping(path="/getClients")
    public @ResponseBody Iterable<Clients> getAllClients() {
        return clientsRepository.findAll();
    }
    @PostMapping(value = "/addClient")
    public String addNewClient(@RequestBody Clients client){
        clientsRepository.save(client);
        return "Saved...";
    }
    @PutMapping(value = "/updateClient/{id}")
    public String updateClient(@PathVariable Integer id, @RequestBody Masters masters) {
        Clients updatedClient = clientsRepository.findById(id).get();
        updatedClient.setName(masters.getName());
        clientsRepository.save(updatedClient);
        return "Updated...";
    }

}
