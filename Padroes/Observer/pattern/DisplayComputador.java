package Observer.pattern;

public class DisplayComputador implements Observer {
    @Override
    public void update(double temperatura) {
        System.out.println("Display Computador: Temperatura atual é " + temperatura + "°C");
    }
}
