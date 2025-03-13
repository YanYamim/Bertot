package Observer.pattern;

public class DisplayCelular implements Observer {
    @Override
    public void update(double temperatura) {
        System.out.println("Display Celular: Temperatura atual é " + temperatura + "°C");
    }
}

