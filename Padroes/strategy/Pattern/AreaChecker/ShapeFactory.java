package Pattern.AreaChecker;


public interface ShapeFactory {
    Calculable getShape(ShapeType type, Double[] values);
}
