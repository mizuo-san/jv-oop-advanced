package core.basesyntax;

import java.util.Random;

public class FigureSupplier implements FigureMethods {
    public Figure getRandomFigure() {
        return switch(new Random().nextInt(5)) {
            case 0 -> new Rectangle(Colors.values()[new Random().nextInt(4)], 10, 10);
            case 1 -> new Circle(Colors.values()[new Random().nextInt(4)], 10);
            case 2 -> new Square(Colors.values()[new Random().nextInt(4)], 10);
            case 3 -> new IsoscelesTrapezoid(Colors.values()[new Random().nextInt(4)], 10, 10, 10);
            case 4 -> new RightTriangle(Colors.values()[new Random().nextInt(4)], 10, 10);
            default -> throw new IllegalStateException("Unexpected value: " + new Random().nextInt(5));
        };
    }

    public Figure getDefaultFigure() {

    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
