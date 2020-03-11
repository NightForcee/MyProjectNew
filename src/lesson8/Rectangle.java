package lesson8;

import static java.lang.Math.*;

public class Rectangle implements Shape {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getPerimeter() {
        return (side1 + side2) * 2;
    }

    @Override
    public double getSquare() {
        return side1 * side2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }

    protected double getDiagonal() {
        return sqrt(pow(side1, 2) + pow(side2, 2));
    }
}
