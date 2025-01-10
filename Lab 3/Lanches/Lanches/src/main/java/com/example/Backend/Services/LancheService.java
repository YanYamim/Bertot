package com.example.Backend.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Backend.Entity.Lanche;
import com.example.Backend.Interfaces.LancheRepository;

import jakarta.persistence.EntityNotFoundException;

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

    public Lanche atualizarLanche(@PathVariable Long lancheId, String lancheNome, String lancheTipo) {
        Optional<Lanche> lancheExistente = lancheRepository.findById(lancheId);

        if(lancheExistente.isPresent()) {
            Lanche lancheParaEditar = lancheExistente.get();
            lancheParaEditar.setLancheNome(lancheNome);
            lancheParaEditar.setLancheTipo(lancheTipo);

            return lancheRepository.save(lancheParaEditar);
        }

        throw new EntityNotFoundException("Lanche não encontrado pelo ID" + lancheId);
    }

    public List<Lanche> listarLanche() {
        List<Lanche> lanches = lancheRepository.findAll();
        return lanches;
    }

}
