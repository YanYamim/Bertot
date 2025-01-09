package com.example.Backend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Backend.Entity.Lanche;
import com.example.Backend.Interfaces.LancheRepository;

@Service
public class LancheService {
    private LancheRepository lancheRepository;
    
    @Autowired
    public LancheService(LancheRepository lancheRepository) {
        this.lancheRepository = lancheRepository;
    }

    public Lanche cadastrarLanche(String lancheNome, String lancheTipo) {
        Lanche novoLanche = new Lanche();
        novoLanche.setLancheNome(lancheNome);
        novoLanche.setLancheTipo(lancheTipo);
        Lanche lancheSalvo = lancheRepository.save(novoLanche);
        return lancheSalvo;
    }


}
