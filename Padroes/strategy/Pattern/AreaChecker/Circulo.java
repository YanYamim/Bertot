package Pattern.AreaChecker;


public class Circulo implements Calculable {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return (Math.PI * Math.pow(raio, 2));
    }
}
