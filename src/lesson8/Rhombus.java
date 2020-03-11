package lesson8;

public class Rhombus implements Shape {
    private double side1;
    private double height;

    public Rhombus(double side1, double height) {
        this.side1 = side1;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return side1 * 4;
    }

    @Override
    public double getSquare() {
        return side1 * height;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "side1=" + side1 +
                ", height=" + height +
                '}';
    }

    protected double circleRadiusInRhombus() {
        return height / 2;
    }
}
