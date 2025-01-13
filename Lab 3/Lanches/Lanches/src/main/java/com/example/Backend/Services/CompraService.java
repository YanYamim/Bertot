package com.example.Backend.Services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Backend.Entity.Cliente;
import com.example.Backend.Entity.Compra;
import com.example.Backend.Entity.Lanche;
import com.example.Backend.Interfaces.ClienteRepository;
import com.example.Backend.Interfaces.CompraRepository;
import com.example.Backend.Interfaces.LancheRepository;

@Service
public class CompraService {
    private CompraRepository compraRepository;
    private ClienteRepository clienteRepository;
    private LancheRepository lancheRepository;

    @Autowired
    public CompraService(CompraRepository compraRepository, ClienteRepository clienteRepository, LancheRepository lancheRepository) {
        this.compraRepository = compraRepository;
        this.clienteRepository = clienteRepository;
        this.lancheRepository = lancheRepository;
    }

    public Compra realizarCompra(Cliente cliente, Lanche lanche) {

        Cliente clienteExistente = clienteRepository.findById(cliente.getClienteId())
            .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));

        Lanche lancheExistente = lancheRepository.findById(lanche.getLancheId())
            .orElseThrow(() -> new IllegalArgumentException("Lanche não encontrado"));
            
        clienteExistente.getLanches().add(lancheExistente);        
        
        clienteRepository.save(clienteExistente);

        Compra novaCompra = new Compra();
        novaCompra.setCliente(clienteExistente);
        novaCompra.setLanche(lancheExistente);
        novaCompra.setCompraData(LocalDate.now());        

        return compraRepository.save(novaCompra);
    }
}
