package org.inventario;

import org.Inventario.Inventario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteInventario {
    private Inventario inventario;

    @BeforeEach
    void setUp() {
        inventario = new Inventario();
    }

    @Test
    void adicionarItem_deveAdicionarItemCorretamente() {
        String resultado = inventario.adicionarItem("Caderno","5",2);
        assertEquals("Caderno adicionado no inventário", resultado);
    }

    @Test
    void listarItens_quandoInventarioVazio_deveRetornarInventarioVazio() {
        String resultado = inventario.listarItens();
        assertEquals("Inventário vazio", resultado);
    }

    @Test
    void listarItens_quandoInventarioNaoVazio_deveRetornarItensDisponiveis() {
        inventario.adicionarItem("Caderno", "5", 2);
        String resultado = inventario.listarItens();
        assertTrue(resultado.contains("Itens disponíveis"));
        assertTrue(resultado.contains("- Livro por Estante5"));
    }

    @Test
    void removerItem_quandoItemExistente_deveRemoverItemCorretamente() {
        inventario.adicionarItem("Caderno", "5", 2);
        String resultado = inventario.removerItem("Caderno", "5", 2);
        assertEquals("Livro removido", resultado);
    }

    @Test
    void removerItem_quandoItemNaoExistente_deveRetornarItemNaoEncontrado() {
        String resultado = inventario.removerItem("Caderno", "5", 2);
        assertEquals("Item não encontrado", resultado);
    }
}
