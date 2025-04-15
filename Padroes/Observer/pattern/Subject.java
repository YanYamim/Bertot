// Define quem pode dar attach e detach como notificar os observers

package Observer.pattern;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
