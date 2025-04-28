package Tarefa;

import java.time.LocalDate;
import java.util.List;

import Notificacao.ObserverTarefa;

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

    @Override
    public void executar() {
        this.concluido = true;
        notificarObservers();
    }

    @Override
    public void adicionarObserver(ObserverTarefa observer) {
        observers.add(observer);
    }

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
    public LocalDate getData() {
        return data;
    }

    @Override
    public Boolean isConcluido() {
        return concluido;
    }
    
}
