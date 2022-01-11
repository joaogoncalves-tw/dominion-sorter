package com.dominion.dominionsorter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CartaController {
    
    @GetMapping(value="/api /carta")
    public String getMethodName() {
        return "Carta";
    }
    
}
