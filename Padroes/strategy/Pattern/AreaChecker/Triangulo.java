package Pattern.AreaChecker;


public class Triangulo implements Calculable{
    private double baseTri;
    private double alturaTri;

    public Triangulo(double baseTri, double alturaTri) {
        this.baseTri = baseTri;
        this.alturaTri = alturaTri;
    }

    @Override
    public double calcularArea() {
        return ((baseTri * alturaTri) / 2);
    }
}
