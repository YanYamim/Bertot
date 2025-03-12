package Pattern.AreaChecker;


public class Main {
    public static void main(String[] args) {
        ShapeFactoryImpl factory = new ShapeFactoryImpl();

        Calculable triangulo = factory.getShape(ShapeType.TRIANGULO, new Double[]{10.0, 20.0});
        System.out.println(triangulo.calcularArea());

        Calculable paralelogramo = factory.getShape(ShapeType.PARALELOGRAMO, new Double[]{10.0, 30.0});
        System.out.println(paralelogramo.calcularArea());

        Calculable cubo = factory.getShape(ShapeType.CUBO, new Double[]{5.0});
        System.out.println(cubo.calcularArea());

        Calculable circulo = factory.getShape(ShapeType.CIRCULO, new Double[]{30.0});
        System.out.println(circulo.calcularArea());

    }
}
