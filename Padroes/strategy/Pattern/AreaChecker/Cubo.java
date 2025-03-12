package Pattern.AreaChecker;


public class Cubo implements Calculable {
    private double ladoCub;

    public Cubo(double ladoCub){
        this.ladoCub = ladoCub;
    }

    public double calcularArea() {
        return Math.pow(ladoCub, 3);
    }
}
