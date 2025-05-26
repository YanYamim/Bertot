package Ordenacao;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Tarefa.TarefaComponent;

/**
 * Estratégia de ordenação por prioridade (implementação do padrão Strategy).
 */
public class OrdencaoPorPrioridade implements OrdenacaoStrategy{
    
    @Override
    public void ordenar(List<TarefaComponent> tarefas) {
        Collections.sort(tarefas, new Comparator<TarefaComponent>() {
            @Override
            public int compare(TarefaComponent t1, TarefaComponent t2) {
                if(t1.getPrioridade() == null || t2.getPrioridade() == null) {
                    return 0;
                }
                return t1.getPrioridade().compareTo(t2.getPrioridade());
            }
        });
    }
}
