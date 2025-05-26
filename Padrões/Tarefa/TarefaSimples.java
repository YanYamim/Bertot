package Tarefa;

import java.time.LocalDate;
import java.util.List;

import Notificacao.ObserverTarefa;

/**
 * Representa uma tarefa individual (folha do padrão Composite).
 * Também implementa o padrão Observer, notificando observadores ao ser concluída.
 */
public class TarefaSimples implements TarefaComponent{
    
    private String nome;
    private Boolean concluido;
    private LocalDate data;
    private List<ObserverTarefa> observers;
    private Integer prioridade;

    public TarefaSimples(String nome, Boolean concluido, List<ObserverTarefa> observers) {
        this.nome = nome;
        this.concluido = concluido;
        this.observers = observers;
    }

/**
 * Executa a tarefa simples, marca como concluída e notifica os observadores.
 */
    @Override
    public void executar() {
        this.concluido = true;
        notificarObservers();
    }

    @Override
    public void adicionarObserver(ObserverTarefa observer) {
        observers.add(observer);
    }


/**
 * Notifica todos os observadores cadastrados.
 */
    private void notificarObservers() {
        for(ObserverTarefa observer : observers) {
            observer.atualizar(this);
        }
    }

    @Override
    public String getNome() {
        return nome;
    }

    public Boolean getConcluido() {
        return concluido;
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

    @Override
    public Boolean isConcluido() {
        return concluido;
    }
    
}
