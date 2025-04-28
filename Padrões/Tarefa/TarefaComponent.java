package Tarefa;

import java.time.LocalDate;

import Notificacao.ObserverTarefa;

public interface TarefaComponent {
    
    void executar();
    void adicionarObserver(ObserverTarefa observer);
    LocalDate getData();
    Integer getPrioridade();
    String getNome();
    Boolean isConcluido();
}
