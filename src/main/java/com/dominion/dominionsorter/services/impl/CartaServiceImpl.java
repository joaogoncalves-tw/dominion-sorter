package com.dominion.dominionsorter.services.impl;

import com.dominion.dominionsorter.models.Carta;
import com.dominion.dominionsorter.repository.CartaRepository;
import com.dominion.dominionsorter.services.CartaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartaServiceImpl implements CartaService{

    @Autowired
    CartaRepository repo;

    @Override
    public Carta returnByName(String string) {
        // TODO Auto-generated method stub
        Integer contador = 0;
        for (int i = 0; i < 10; i++){
            contador++;
        }
        
        return "teste-duplicidade";
    }
    
    public Carta returnByNameDupe(String string) {
        // TODO Auto-generated method stub
        Integer contador = 0;
        for (int i = 0; i < 10; i++){
            contador++;
        }
        
        return "teste-duplicidade";
    }

    @Override
    public String get() {
        // TODO Auto-generated method stub
        return repo.get();
    }
    
}
