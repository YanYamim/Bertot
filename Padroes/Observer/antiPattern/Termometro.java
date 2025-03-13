package Observer.antiPattern;

import java.util.ArrayList;
import java.util.List;

public class Termometro {
    private double temperatura;
    private List<Object> observers = new ArrayList<>();

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificarObservers();
        salvarTemperaturaNoBanco(); // Violação do SRP
    }

    public void attach(Object observer) {
        observers.add(observer);
    }

    public void detach(Object observer) {
        observers.remove(observer);
    }

    private void notificarObservers() {
        for (Object observer : observers) {
            if (observer instanceof DisplayCelular) {
                ((DisplayCelular) observer).update(temperatura);
            } else if (observer instanceof DisplayComputador) {
                ((DisplayComputador) observer).update(temperatura);
            }
        }
    }

    private void salvarTemperaturaNoBanco() {
        System.out.println("Temperatura salva no banco de dados: " + temperatura);
    }
}