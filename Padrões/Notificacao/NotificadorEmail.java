package Notificacao;

import Tarefa.TarefaComponent;
import Tarefa.TarefaComposta;
import Tarefa.TarefaSimples;

public class NotificadorEmail implements ObserverTarefa {
    
    private String email;

    public NotificadorEmail(String email) {
        this.email = email;
    }

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
