package lesson008;

import static java.lang.Math.*;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getSquare() {
        return PI * pow(radius, 2);
    }

    protected double getDiameter() {
        return 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    class Sphere {
        protected double getVolumeOfSphere() {
            return 4 / 3 * (PI * pow(radius, 3));
        }

        protected double getSquareSphere() {
            return 4 * PI * pow(radius, 2);
        }
    }
}
