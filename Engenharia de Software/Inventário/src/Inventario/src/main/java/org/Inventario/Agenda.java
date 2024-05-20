package org.Inventario;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private static List<Lembrete> lembretes = new ArrayList<>();

    static {
        lembretes = new ArrayList<>();
    }

    public static String adicionarLembrete(String titulo, String data, String texto) {
        Lembrete novoLembrete = new Lembrete(titulo, data, texto);
        lembretes.add(novoLembrete);
        return titulo + " adicionado à agenda";
    }

    public static String listarLembretes() {
        if (lembretes.isEmpty()) {
            return "Lista de lembretes vazia";
        } else {
            StringBuilder lembretesDisponiveis = new StringBuilder("Lembretes disponíveis\n");
            for (Lembrete lembrete : lembretes) {
                lembretesDisponiveis.append(" - ").append(lembrete.getTitulo()).append(" para ").append(lembrete.getData()).append(": ").append(lembrete.getTexto()).append("\n");
            }
            return lembretesDisponiveis.toString();
        }
    }

    public static String removerLembrete(String titulo) {
        for (Lembrete lembrete : lembretes) {
            if (lembrete.getTitulo().equals(titulo)) {
                lembretes.remove(lembrete);
                return titulo + " removido";
            }
        }
        return "Lembrete não encontrado";
    }
}

