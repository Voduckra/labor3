package org.example.controllers;


import org.example.models.Masters;

import org.example.repository.MastersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/")
public class MastersController {
    @Autowired
    private MastersRepository mastersRepository;


    @GetMapping(path="/getMasters")
    public @ResponseBody Iterable<Masters> getAllMasters() {
        return mastersRepository.findAll();
    }

    @PostMapping(value = "/addMasters")
    public String addNewStylist(@RequestBody Masters masters) {
        mastersRepository.save(masters);
        return "Saved...";
    }
}
