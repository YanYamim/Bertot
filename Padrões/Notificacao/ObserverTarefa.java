package Notificacao;

import Tarefa.TarefaComponent;

/**
 * Interface do padrão Observer.
 * Define o método que será chamado quando a tarefa for atualizada.
 */
public interface ObserverTarefa {
    void atualizar(TarefaComponent tarefa);
}
