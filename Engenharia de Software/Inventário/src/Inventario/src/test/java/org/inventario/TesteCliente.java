package org.inventario;

import org.Inventario.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteCliente {
    @Test
    void getNome_deveRetornarNomeCorretamente(){
        Cliente cliente = new Cliente("Yan","1234345","Rua Brasil, são paulo");
        assertEquals("Yan", cliente.getNome());
    }

    @Test
    void getCpf_deveRetornarCpfCorretamente(){
        Cliente cliente = new Cliente("Yan","1234345","Rua Brasil, são paulo");
        assertEquals("1234345", cliente.getCpf());
    }

    @Test
    void getEndereco_deveRetornarEnderecoCorretamente(){
        Cliente cliente = new Cliente("Yan","1234345","Rua Brasil, são paulo");
        assertEquals("Rua Brasil, são paulo", cliente.getEndereco());
    }
}
