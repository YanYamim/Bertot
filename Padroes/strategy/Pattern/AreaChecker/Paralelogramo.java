package Pattern.AreaChecker;


public class Paralelogramo implements Calculable {
    private double basePara;
    private double alturaPara;

    public Paralelogramo(double basePara, double alturaPara) {
        this.basePara = basePara;
        this.alturaPara = alturaPara;
    }

    @Override
    public double calcularArea() {
        return basePara * alturaPara;
    }
}
