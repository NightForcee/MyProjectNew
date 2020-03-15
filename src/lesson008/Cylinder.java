package lesson008;

import static java.lang.Math.*;

public class Cylinder implements Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (2 * height) + 2 * PI * (2 * radius);
    }

    @Override
    public double getSquare() {
        return 2 * PI * radius * (radius + height);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }

    protected double getVolumeOfCylinder() {
        return PI * pow(radius, 2) * height;
    }
}
