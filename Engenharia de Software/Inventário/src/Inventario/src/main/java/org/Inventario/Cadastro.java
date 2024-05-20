package org.Inventario;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private static List<Cliente> clientes = new ArrayList<>();

    public static String cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        return cliente.getNome() + " foi cadastrado com sucesso";
    }
}
