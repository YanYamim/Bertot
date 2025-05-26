package Ordenacao;

import java.util.List;

import Tarefa.TarefaComponent;

/**
 * Interface do padrão Strategy.
 * Define o contrato para diferentes estratégias de ordenação de tarefas.
 */
public interface OrdenacaoStrategy {
    
    void ordenar(List<TarefaComponent> tarefas);
}
