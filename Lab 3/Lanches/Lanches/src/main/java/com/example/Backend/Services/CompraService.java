package com.example.Backend.Services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Backend.Entity.Cliente;
import com.example.Backend.Entity.Compra;
import com.example.Backend.Entity.Lanche;
import com.example.Backend.Interfaces.CompraRepository;

@Service
public class CompraService {
    private CompraRepository compraRepository;

    @Autowired
    public CompraService(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    public Compra realizarCompra(Cliente cliente, Lanche lanche) {
        Compra novaCompra = new Compra();
        novaCompra.setCliente(cliente);
        novaCompra.setLanche(lanche);
        novaCompra.setCompraData(LocalDate.now());
        return compraRepository.save(novaCompra);
    }
}
