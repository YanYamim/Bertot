package org.inventario;
import org.Inventario.Agenda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TesteAgenda {
    @Test
    void adicionarLembrete_deveAdicionarLembreteCorretamente() {
        Agenda.adicionarLembrete("Reunião", "2024-04-15", "Discussão de projeto");
        assertEquals("Reunião adicionado à agenda", Agenda.adicionarLembrete("Reunião", "2024-04-15", "Discussão de projeto"));
    }

    @Test
    void listarLembretes_deveRetornarListaCorretamente() {
        Agenda.adicionarLembrete("Reunião", "2024-04-15", "Discussão de projeto");
        assertEquals("Lembretes disponíveis\n - Reunião para 2024-04-15: Discussão de projeto\n", Agenda.listarLembretes());
    }

    @Test
    void removerLembrete_deveRemoverLembreteCorretamente() {
        Agenda.adicionarLembrete("Reunião", "2024-04-15", "Discussão de projeto");
        assertEquals("Reunião removido", Agenda.removerLembrete("Reunião"));
    }
}
