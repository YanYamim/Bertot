package com.example.Backend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Backend.Interfaces.ClienteLancheRepository;
import com.example.Backend.Interfaces.ClienteRepository;
import com.example.Backend.Interfaces.LancheRepository;

@Service
public class ClienteLancheService {
    private LancheRepository lancheRepository;
    private ClienteRepository clienteRepository;
    private ClienteLancheRepository clienteLancheRepository;

    @Autowired
    public ClienteLancheService(LancheRepository lancheRepository, ClienteRepository clienteRepository, ClienteLancheRepository clienteLancheRepository) {
        this.lancheRepository = lancheRepository;
        this.clienteRepository = clienteRepository;
        this.clienteLancheRepository = clienteLancheRepository;
    }


}
