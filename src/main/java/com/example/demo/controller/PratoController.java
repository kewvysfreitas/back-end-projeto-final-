package com.example.demo.controller;

import com.example.demo.model.Prato;
import com.example.demo.repository.PratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000") 
public class PratoController {

    @Autowired
    private PratoRepository pratoRepository;

    @GetMapping("/api/pratos") 
    public List<Prato> listarPratos() {
        return pratoRepository.findAll();
    }
}
