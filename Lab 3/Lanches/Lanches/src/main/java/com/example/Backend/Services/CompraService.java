package com.example.Backend.Services;

import java.util.Date;

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

    public Compra realizarCompra(Long compraId, Date compraData, Cliente cliente, Lanche lanche) {
        Compra novaCompra = new Compra();
        Compra compraFeita = compraRepository.save(novaCompra);
        return compraFeita;
    }
}
