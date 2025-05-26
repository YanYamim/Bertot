import Tarefa.*;
import Notificacao.*;
import Ordenacao.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NotificadorEmail observadorEmail = new NotificadorEmail("usuario@email.com");

        TarefaSimples tarefa1 = new TarefaSimples("Estudar Padrões de Projeto", false, new ArrayList<>());
        tarefa1.adicionarObserver(observadorEmail);
        
        TarefaSimples tarefa2 = new TarefaSimples("Implementar Strategy", false, new ArrayList<>());
        tarefa2.adicionarObserver(observadorEmail);

        TarefaSimples tarefa3 = new TarefaSimples("Escrever relatório", false, new ArrayList<>());
        tarefa3.adicionarObserver(observadorEmail);

        tarefa1.executar(); 
        tarefa1.executar();

        List<TarefaComponent> subtarefas = new ArrayList<>();
        subtarefas.add(tarefa2);
        subtarefas.add(tarefa3);

        TarefaComposta tarefaComposta = new TarefaComposta("Projeto Final", subtarefas, new ArrayList<>());
        tarefaComposta.adicionarObserver(observadorEmail);

        tarefaComposta.executar();

        List<TarefaComponent> tarefas = new ArrayList<>();
        tarefas.add(tarefa1);
        tarefas.add(tarefaComposta);

        tarefa1.setPrioridade(2); 
        tarefa2.setPrioridade(1); 
        tarefa3.setPrioridade(3); 
        tarefaComposta.setPrioridade(1);

        OrdenacaoStrategy estrategia = new OrdencaoPorPrioridade();
        estrategia.ordenar(tarefas);

        System.out.println("\nTarefas ordenadas por prioridade:");
        for (TarefaComponent tarefa : tarefas) {
            System.out.println("- " + tarefa.getNome() + " | Prioridade: " + tarefa.getPrioridade());
        }
    }
}
