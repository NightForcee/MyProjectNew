package lesson008;

public class ShapeUtils {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 8);
        isRectangle(rectangle);
        Triangle triangle = new Triangle(3, 4, 5);
        isTriangle(triangle);
    }

    public static void isRectangle(Shape shape) {
        if (shape instanceof Rectangle) {
            System.out.println(shape + " is Rectangle!");
        }
    }

    public static void isTriangle(Shape shape) {
        if (shape instanceof Triangle) {
            System.out.println(shape + " is Triangle!");
        }
    }
}
