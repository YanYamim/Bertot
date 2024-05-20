package org.inventario;
import org.Inventario.Planos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestePlanos {
    @Test
    void escolhaPlano_deveRetornarBeneficiosParaPlanoConvencional() {
        Planos planos = new Planos(Planos.TipoPlano.CONVENCIONAL, 0, 50, false);
        String beneficiosEsperados = "Benefícios do plano mensal:\n" +
                "- Direito a 7 dias de conta premium grátis -\n" +
                "- Acesso a um inventário possível de armazenar até 50 espaços de itens";
        assertEquals(beneficiosEsperados, planos.escolhaPlano("CONVENCIONAL - Gratuito", 0, 50, false));
    }

    @Test
    void escolhaPlano_deveRetornarBeneficiosParaPlanoPremium() {
        Planos planos = new Planos(Planos.TipoPlano.PREMIUM, 16.90, Integer.MAX_VALUE, true);
        String beneficiosEsperados = "Benefícios do plano anual:\n" +
                "- Além dos benefícios convencionais\n" +
                "- Inventário de espaço infinito\n" +
                "- Agenda também inclusa";
        assertEquals(beneficiosEsperados, planos.escolhaPlano("PREMIUM - 16,90/mês", 16.90, Integer.MAX_VALUE, true));
    }

    @Test
    void escolhaPlano_deveRetornarTipoDePlanoInvalidoParaTipoInvalido() {
        Planos planos = new Planos(Planos.TipoPlano.CONVENCIONAL, 0, 50, false);
        assertEquals("Tipo de plano inválido.", planos.escolhaPlano("INVALIDO", 0, 0, false));
    }
}
