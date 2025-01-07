package com.example.Backend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Backend.Interfaces.LancheRepository;
import com.example.Backend.Lanches.Lanche;

@Service
public class LancheService {
    private LancheRepository lancheRepository;

    @Autowired
    public LancheService(LancheRepository lancheRepository) {
        this.lancheRepository = lancheRepository;
    }

    public Lanche cadastrarLanche (Long id, String nome) {
        Lanche novoLanche = new Lanche();
        novoLanche.setId(id);
        novoLanche.setNome(nome);

        Lanche lancheSalvo = lancheRepository.save(novoLanche);
        return lancheSalvo;
    }
    
}
