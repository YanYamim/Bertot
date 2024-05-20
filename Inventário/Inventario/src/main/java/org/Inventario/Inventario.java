package org.Inventario;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private static List<Item> itens = new ArrayList<>();

    static {
        itens = new ArrayList<>();
    }

    public static String adicionarItem(String nome, String espaco, int quantidade) {
        Item novoItem = new Item(nome, espaco, quantidade);
        itens.add(novoItem);
        return nome + " adicionado ao inventário";
    }

    public String listarItens() {
        if (itens.isEmpty()) {
            return "Inventário vazio";
        } else {
            StringBuilder itensDisponiveis = new StringBuilder("Itens disponíveis\n");
            for (Item item : itens) {
                itensDisponiveis.append(" - ").append(item.getNome()).append(" por ").append(item.getEspaco()).append(item.getQuantidade()).append("\n");
            }
            return itensDisponiveis.toString();
        }
    }

    public String removerItem(String nome, String espaco, int quantidade) {
        for (Item item : itens) {
            if (item.getNome().equals(nome)) {
                itens.remove(item);
                return nome + " removido";
            }
        }
        return "Item não encontrado";
    }
}

