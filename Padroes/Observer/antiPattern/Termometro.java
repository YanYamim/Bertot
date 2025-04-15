// Esse viola o padrão observer por usar Object na lista e instanceof como verificações

package Observer.antiPattern;

import java.util.ArrayList;
import java.util.List;

public class Termometro {
    private double temperatura;
    private List<Object> observers = new ArrayList<>();

    // Esse método faz duas coisas, notificar observers (papel do Observer) e salva no banco
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificarObservers();
        salvarTemperaturaNoBanco();
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