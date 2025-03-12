package antiPattern.AntiAreaChecker;

public class ShapeFactoryImpl {
    public double calcularArea(ShapeType type, Double[] values) {
        switch (type) {
            case TRIANGULO:
                double baseTri = values[0];
                double alturaTri = values[1];
                return (baseTri * alturaTri) / 2;

            case CUBO:
                double ladoCub = values[0];
                return Math.pow(ladoCub, 3);

            case CIRCULO:
                double raio = values[0];
                return Math.PI * Math.pow(raio, 2);

            case PARALELOGRAMO:
                double basePara = values[0];
                double alturaPara = values[1];
                return basePara * alturaPara;

            default:
                throw new IllegalArgumentException("Forma não suportada");
        }
    }    
}
