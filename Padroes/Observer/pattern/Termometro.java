// Armazena a temperatura, guarda os observers numa lista e notifica eles quando a temperatura muda

package Observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Termometro implements Subject {
    private double temperatura;
    private List<Observer> observers = new ArrayList<>();

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notifyObservers(); 
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperatura);
        }
    }
}
