// Pasta é o Composite onde pode conter todos os componentes armazenados por uma lista

package Composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Component {
    private String nome;
    private List<Component> componentes = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(Component componente) {
        componentes.add(componente);
    }

    public void remover(Component componente) {
        componentes.remove(componente);
    }

    @Override
    public void mostrar() {
        System.out.println("Pasta: " + nome);
        for (Component componente : componentes) {
            componente.mostrar();
        }
    }
}
