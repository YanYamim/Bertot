package Tarefa;

import java.time.LocalDate;
import java.util.List;

import Notificacao.ObserverTarefa;

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

    @Override
    public void executar() {
        for (TarefaComponent tarefa : subtarefas) {
            tarefa.executar();
        }
        notificarObservers();
    }

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
    public LocalDate getData() {
        return data;
    }
}
