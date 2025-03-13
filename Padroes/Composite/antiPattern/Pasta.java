package Composite.antiPattern;

import java.util.ArrayList;
import java.util.List;

public class Pasta {
    private String nome;
    private List<Object> componentes = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(Object componente) {
        componentes.add(componente);
    }

    public void remover(Object componente) {
        componentes.remove(componente);
    }

    public void mostrar() {
        System.out.println("Pasta: " + nome);
        for (Object componente : componentes) {
            if (componente instanceof Arquivo) {
                ((Arquivo) componente).mostrar();
            } else if (componente instanceof Pasta) {
                ((Pasta) componente).mostrar();
            }
        }
    }

    public void salvarNoBanco() {
        System.out.println("Pasta salva no banco de dados: " + nome);
    }
}
