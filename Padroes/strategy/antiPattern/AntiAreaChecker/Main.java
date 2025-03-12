package antiPattern.AntiAreaChecker;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryImpl factory = new ShapeFactoryImpl();

        // Valores fixos diretamente no código
        double areaTriangulo = factory.calcularArea(ShapeType.TRIANGULO, new Double[]{10.0, 20.0});
        System.out.println("Área do Triângulo: " + areaTriangulo);

        double areaParalelogramo = factory.calcularArea(ShapeType.PARALELOGRAMO, new Double[]{10.0, 30.0});
        System.out.println("Área do Paralelogramo: " + areaParalelogramo);

        double areaCubo = factory.calcularArea(ShapeType.CUBO, new Double[]{5.0});
        System.out.println("Área do Cubo: " + areaCubo);

        double areaCirculo = factory.calcularArea(ShapeType.CIRCULO, new Double[]{30.0});
        System.out.println("Área do Círculo: " + areaCirculo);
    }
}