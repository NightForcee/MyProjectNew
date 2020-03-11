package lesson8;

public class Trapeze implements Shape {
    private double bokovayaSideTrapezoid;
    private double upperBase;
    private double lowerBase;
    private double height;

    public Trapeze(double bokovayaSideTrapezoid, double upperBase, double lowerBase, double height) {
        this.bokovayaSideTrapezoid = bokovayaSideTrapezoid;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (bokovayaSideTrapezoid * 2) + upperBase + lowerBase;
    }

    @Override
    public double getSquare() {
        return ((upperBase + lowerBase) / 2) * height;
    }

    @Override
    public String toString() {
        return "Trapeze{" +
                "bokovayaSideTrapezoid=" + bokovayaSideTrapezoid +
                ", upperBase=" + upperBase +
                ", lowerBase=" + lowerBase +
                ", height=" + height +
                '}';
    }

    protected double getDiagonal() {
        return Math.sqrt(Math.pow(bokovayaSideTrapezoid, 2) + upperBase * lowerBase);
    }
}
