package org.inventario;
import org.Inventario.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TesteItem {
    @Test
    void getNome_deveRetornarNomeCorretamente() {
        Item item = new Item("Caderno", "5", 2);
        assertEquals("Caderno", item.getNome());
    }

    @Test
    void getEspaco_deveRetornarEspacoCorretamente() {
        Item item = new Item("Caderno", "5", 2);
        assertEquals("5", item.getEspaco());
    }

    @Test
    void getQuantidade_deveRetornarQuantidadeCorretamente() {
        Item item = new Item("Caderno", "5", 2);
        assertEquals(2, item.getQuantidade());
    }
}
