package Ordenacao;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Tarefa.TarefaComponent;

public class OrdenacaoPorData implements OrdenacaoStrategy{
    
    @Override
    public void ordenar(List<TarefaComponent> tarefas) {
        Collections.sort(tarefas, new Comparator<TarefaComponent>() {
            @Override
            public int compare(TarefaComponent t1, TarefaComponent t2) {
                if(t1.getData() == null || t2.getData() == null) {
                    return 0;
                }
                return t1.getData().compareTo(t2.getData());
            }
        });
    }
}
