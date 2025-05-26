package Notificacao;

import Tarefa.TarefaComponent;
import Tarefa.TarefaComposta;
import Tarefa.TarefaSimples;


/**
 * Implementa o padrão Observer.
 * Envia uma "notificação" por e-mail (simulada com print) quando uma tarefa é concluída.
 */
public class NotificadorEmail implements ObserverTarefa {
    
    private String email;

    public NotificadorEmail(String email) {
        this.email = email;
    }

    /**
     * Atualiza quando uma tarefa for concluída e envia a notificação.
     */
     @Override
    public void atualizar(TarefaComponent tarefa) {
        if (tarefa instanceof TarefaSimples) {
            TarefaSimples tarefaSimples = (TarefaSimples) tarefa;
            if (tarefaSimples.isConcluido()) {
                enviarEmail(tarefaSimples);
            }
        } else if (tarefa instanceof TarefaComposta) {
            TarefaComposta tarefaComposta = (TarefaComposta) tarefa;
            if (tarefaComposta.isConcluido()) {
                enviarEmail(tarefaComposta);
            }
        }
    }

    private void enviarEmail(TarefaComponent tarefa) {
        System.out.println("Enviando e-mail para: " + email);
        System.out.println("Tarefa " + tarefa.getNome() + " foi concluída!");
    }
}
