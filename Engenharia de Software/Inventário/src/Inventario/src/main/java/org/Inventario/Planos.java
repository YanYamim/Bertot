package org.Inventario;

public class Planos {
    public enum TipoPlano {
        CONVENCIONAL,
        PREMIUM
    }

    private TipoPlano tipo;
    private double preco;
    private int maxEspacos;
    private boolean agendaInclusa;

    public Planos(TipoPlano tipo, double preco, int maxEspacos, boolean agendaInclusa) {
        this.tipo = tipo;
        this.preco = preco;
        this.maxEspacos = maxEspacos;
        this.agendaInclusa = agendaInclusa;
    }

    public TipoPlano getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public int getMaxEspacos() {
        return maxEspacos;
    }

    public boolean getAgendaInclusa() {
        return agendaInclusa;
    }

    public String escolhaPlano(String tipo, double preco, int maxEspacos, boolean agendaInclusa) {
        TipoPlano tipoPlano;

        if (tipo.equalsIgnoreCase("CONVENCIONAL - Gratuito")) {
            tipoPlano = TipoPlano.CONVENCIONAL;
            return "Benefícios do plano mensal:\n" +
                    "- Direito a 7 dias de conta premium grátis -\n" +
                    "- Acesso a um inventário possível de armazenar até 50 espaços de itens";
        } else if (tipo.equalsIgnoreCase("PREMIUM - 16,90/mês")) {
            tipoPlano = TipoPlano.PREMIUM;
            return "Benefícios do plano anual:\n" +
                    "- Além dos benefícios convencionais\n" +
                    "- Inventário de espaço infinito\n" +
                    "- Agenda também inclusa";
        } else {
            return "Tipo de plano inválido.";
        }
    }
}

