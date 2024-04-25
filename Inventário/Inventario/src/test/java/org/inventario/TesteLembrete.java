package org.inventario;
import org.Inventario.Lembrete;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteLembrete {
    @Test
    void getTitulo_deveRetornarTituloCorretamente() {
        Lembrete lembrete = new Lembrete("Reunião", "2024-04-15", "Discussão de projeto");
        assertEquals("Reunião", lembrete.getTitulo());
    }

    @Test
    void getData_deveRetornarDataCorretamente() {
        Lembrete lembrete = new Lembrete("Reunião", "2024-04-15", "Discussão de projeto");
        assertEquals("2024-04-15", lembrete.getData());
    }

    @Test
    void getTexto_deveRetornarTextoCorretamente() {
        Lembrete lembrete = new Lembrete("Reunião", "2024-04-15", "Discussão de projeto");
        assertEquals("Discussão de projeto", lembrete.getTexto());
    }
}
