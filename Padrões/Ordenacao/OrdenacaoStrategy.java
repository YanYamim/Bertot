package Ordenacao;

import java.util.List;

import Tarefa.TarefaComponent;

public interface OrdenacaoStrategy {
    
    void ordenar(List<TarefaComponent> tarefas);
}
