package com.example.Backend.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Entity.Compra;
import com.example.Backend.Services.CompraService;

@RestController
@RequestMapping("/compra")
@CrossOrigin(origins = "*")
public class CompraController {
    private CompraService compraService;

    public CompraController(CompraService compraService) {
        this.compraService = compraService;
    }

    @PostMapping()
    public ResponseEntity<Compra> realizarCompra(@RequestBody Compra dados) {

        Compra compraFeita = compraService.realizarCompra(dados.getCompraId(), dados.getCompraData(), dados.getCliente(), dados.getLanche());
        return ResponseEntity.ok(compraFeita);
    }
}
