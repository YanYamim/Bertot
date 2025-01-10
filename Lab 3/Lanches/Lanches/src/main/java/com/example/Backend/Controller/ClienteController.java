package com.example.Backend.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Entity.Cliente;
import com.example.Backend.Services.ClienteService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("cadastrar")
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente dados) {
        
        Cliente clienteSalvo = clienteService.cadastrarCliente(dados.getClienteNome());
        return ResponseEntity.ok(clienteSalvo);
    }
}
