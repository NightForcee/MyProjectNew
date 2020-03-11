package lesson8;

public class Square implements Shape {
    private double side1;

    public Square(double side1) {
        this.side1 = side1;
    }

    @Override
    public double getPerimeter() {
        return side1 * 4;
    }

    @Override
    public double getSquare() {
        return Math.pow(side1, 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side1=" + side1 +
                '}';
    }

    protected double getDiagonal() {
        return side1 * Math.sqrt(2);
    }
}
