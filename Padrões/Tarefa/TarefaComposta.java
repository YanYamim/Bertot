package Tarefa;

import java.time.LocalDate;
import java.util.List;

import Notificacao.ObserverTarefa;

/**
 * Representa uma tarefa composta (nó no padrão Composite).
 * Pode conter subtarefas e propaga execução e notificações.
 * Também utiliza o padrão Observer.
 */

public class TarefaComposta implements TarefaComponent {
    
    private String nome;
    private List<TarefaComponent> subtarefas;
    private LocalDate data;
    private List<ObserverTarefa> observadores;
    private Integer prioridade;
    
    public TarefaComposta(String nome, List<TarefaComponent> subtarefas, List<ObserverTarefa> observadores) {
        this.nome = nome;
        this.subtarefas = subtarefas;
        this.observadores = observadores;
    }

    /**
     * Executa todas as subtarefas e notifica os observadores.
     */
    @Override
    public void executar() {
        for (TarefaComponent tarefa : subtarefas) {
            tarefa.executar();
        }
        notificarObservers();
    }
    
    /**
     * Adiciona um observador à tarefa composta e a todas as subtarefas.
     */
    @Override
    public void adicionarObserver(ObserverTarefa observer) {
        observadores.add(observer);
        for(TarefaComponent tarefa : subtarefas) {
            tarefa.adicionarObserver(observer);
        }
    }

    public void adicionarObserver(TarefaComponent tarefa) {
        subtarefas.add(tarefa);
    }

    private void notificarObservers() {
        for(ObserverTarefa observer : observadores) {
            observer.atualizar(this);
        }
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public Boolean isConcluido() {
        return subtarefas.stream().allMatch(TarefaComponent::isConcluido);
    }    

    @Override
    public Integer getPrioridade() {
        return prioridade;
    }

    @Override
    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public LocalDate getData() {
        return data;
    }
}
