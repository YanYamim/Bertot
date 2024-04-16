import java.util.Scanner;

public class Planos {
    public enum TipoPlano {
        CONVENCIONAL,
        PREMUIM
    }

    private TipoPlano tipo;
    private double preco;
    private int maxLivros;
    private double promocaoEspecial;

    public Planos(TipoPlano tipo, double preco, int maxLivros, double promocaoEspecial) {
        this.tipo = tipo;
        this.preco = preco;
        this.maxLivros = maxLivros;
        this.promocaoEspecial = promocaoEspecial;
    }

    public TipoPlano getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public int getMaxLivros() {
        return maxLivros;
    }

    public double getPromocaoEspecial() {
        return promocaoEspecial;
    }

    public void escolhaPlano(String tipo, double preco, int maxLivros, double promocaoEspecial) {
        TipoPlano tipoPlano;

        if (tipo.equalsIgnoreCase("CONVENCIONAL - Gratuito")) {
            tipoPlano = TipoPlano.CONVENCIONAL;

            System.out.println("Benefícios do plano mensal:");
            System.out.println("- Direito a 7 dias de conta premium grátis -");
            System.out.println("- Acesso a biblioteca online ilimitada");
            System.out.println("- Direito a alugar quantos livros quiser por até 2 semanas cada");
            System.out.println("- Avisos prévios de livros que já estão disponíveis");

        } else if (tipo.equalsIgnoreCase("PREMIUM - 16,90/mês")) {
            tipoPlano = TipoPlano.PREMUIM;

            System.out.println("Benefícios do plano anual:");
            System.out.println("- Além dos benefícios convencionais");
            System.out.println("- Acesso a sorteios exclusivos");
            System.out.println("- Desconto em livros físicos");
            System.out.println("- Poder alugar os livros por até 2 meses");
        } else {
            System.out.println("Tipo de plano inválido.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual será sua escolha de plano? ");
        String escolha = scanner.nextLine();
        scanner.close();

        System.out.println("Plano " + tipoPlano + " escolhido.");
    }
}
