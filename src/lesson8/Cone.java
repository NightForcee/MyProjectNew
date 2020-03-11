package lesson8;

import static java.lang.Math.*;

public class Cone implements Shape {
    private double height;
    private double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return PI * pow(radius, 2);
    }

    @Override
    public double getSquare() {
        return (PI * radius * getFormingCone()) + getPerimeter();
    }

    @Override
    public String toString() {
        return "Cone{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }

    protected double getFormingCone() {
        return sqrt(pow(height, 2) + pow(radius, 2));
    }

    protected double getVolumeOfCone() {
        return 1 / 3 * getPerimeter() * height;
    }
}
