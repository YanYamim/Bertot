package com.example.Backend.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Backend.Entity.Cliente;
import com.example.Backend.Interfaces.ClienteRepository;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastrarCliente(String clienteNome) {
        Cliente novoCliente = new Cliente();
        novoCliente.setClienteNome(clienteNome);
        Cliente clienteSalvo = clienteRepository.save(novoCliente);
        return clienteSalvo; 
    }

    public List<Cliente> listarCliente() {
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes;
    }
}
