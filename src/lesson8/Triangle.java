package lesson8;

public class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getSquare() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p * side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    protected double getHeight() {
        return (2 * getSquare()) / side1;
    }

    class equilateralTriangle {
        protected double getPerimeter() {
            return side1 * 3;
        }

        protected double getSquare() {
            return (side1 * getHeight()) / 2;
        }

        protected double getCircleRadiusInTriangle() {
            return getHeight() / 3;
        }
    }
}
