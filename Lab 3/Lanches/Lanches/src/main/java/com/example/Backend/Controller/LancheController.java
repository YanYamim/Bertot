package com.example.Backend.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Entity.Lanche;
import com.example.Backend.Interfaces.LancheRepository;
import com.example.Backend.Services.LancheService;

@RestController
@RequestMapping("/lanches")
@CrossOrigin(origins = "*")
public class LancheController {
    private LancheRepository lancheRepository;
    private LancheService lancheService;

    public LancheController(LancheRepository lancheRepository, LancheService lancheService) {
        this.lancheRepository = lancheRepository;
        this.lancheService = lancheService;
    }

    @PostMapping("cadastrar")
    public ResponseEntity<Lanche> cadastrarLanche(@RequestBody Lanche dados) {

        Lanche lancheSalvo = lancheService.cadastrarLanche(dados.getLancheNome(), dados.getLancheTipo());
        return ResponseEntity.ok(lancheSalvo);
    }
}
