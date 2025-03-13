package Observer.pattern;

public class Main {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();

        DisplayCelular celular = new DisplayCelular();
        DisplayComputador computador = new DisplayComputador();

        termometro.attach(celular);
        termometro.attach(computador);

        termometro.setTemperatura(25.5);
        termometro.setTemperatura(30.0);

        termometro.detach(computador);

        termometro.setTemperatura(22.0);
    }
}
