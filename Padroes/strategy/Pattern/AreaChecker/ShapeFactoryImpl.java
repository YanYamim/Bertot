package Pattern.AreaChecker;


public class ShapeFactoryImpl {
    public Calculable getShape(ShapeType type, Double[] values) {
        switch (type) {
            case TRIANGULO:
                double baseTri = values[0];
                double alturaTri = values[1];
                return new Triangulo(baseTri, alturaTri);

            case CUBO:
                double ladoCub = values[0];
                return new Cubo(ladoCub);

            case CIRCULO:
                double raio = values[0];
                return new Circulo(raio);

            case PARALELOGRAMO:
                double basePara = values[0];
                double alturaPara = values[1];
                return new Paralelogramo(basePara, alturaPara);

            default:
                return null;
        }
    }
}
