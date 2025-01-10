package com.example.Backend.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Entity.Lanche;
import com.example.Backend.Services.LancheService;

@RestController
@RequestMapping("/lanches")
@CrossOrigin(origins = "*")
public class LancheController {
    private LancheService lancheService;

    public LancheController(LancheService lancheService) {
        this.lancheService = lancheService;
    }

    @PostMapping("cadastrar")
    public ResponseEntity<Lanche> cadastrarLanche(@RequestBody Lanche dados) {

        Lanche lancheSalvo = lancheService.cadastrarLanche(dados.getLancheNome(), dados.getLancheTipo());
        return ResponseEntity.ok(lancheSalvo);
    }

    @PutMapping("editar/{id}")
    public ResponseEntity<Lanche> atualizarLanche(@PathVariable("id") Long lancheId, @RequestBody Lanche lanche) {
        Lanche lancheAtualizado = lancheService.atualizarLanche(lancheId, lanche.getLancheNome(), lanche.getLancheTipo());
        return ResponseEntity.ok(lancheAtualizado);
    }

    @GetMapping("listar")
    public ResponseEntity<List<Lanche>> listarLanches() {
        List<Lanche> lanches = lancheService.listarLanche();

        return ResponseEntity.ok(lanches);
    }
}
