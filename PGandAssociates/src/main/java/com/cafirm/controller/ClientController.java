package com.cafirm.controller;

import com.cafirm.entity.Clients;
import com.cafirm.repos.ClientCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Pgandassociates")
public class ClientController {


    @Autowired
    private ClientCrudRepo clientCrudRepo;


    @GetMapping("/exposeData")
    public List<Clients> getAllClients(){
        System.out.println("getting all Clients Info in our database ");
        return clientCrudRepo.findAll();


    }

    @PostMapping("/addClients")
    public List<Clients> addClients(@RequestBody List<Clients> clients){
        return clientCrudRepo.saveAll(clients);
    }

    @PutMapping("/updateClients")
    public Clients updateClients(@RequestBody Clients clients){
        clientCrudRepo.save(clients);
        return clients;

    }

    @DeleteMapping("/delete/{id}")
    public String deleteClients(@PathVariable int id){
        clientCrudRepo.deleteById(id);
        return "deleted successfully";
    }

    





}
