package Tarefa;

import java.time.LocalDate;

import Notificacao.ObserverTarefa;

/**
 * Interface do padrão Composite.
 * Define operações comuns para tarefas simples e compostas.
 */
public interface TarefaComponent {
    
    void executar();
    void adicionarObserver(ObserverTarefa observer);
    LocalDate getData();
    Integer getPrioridade();
    void setPrioridade(Integer prioridade);
    String getNome();
    Boolean isConcluido();
}
