/**
 * Создать иерархию классов, описывающих геометрические фигуры
 * на плоскости
 *
 * @autour Слиденко Артем
 * @version lesson7
 */

package lesson8;

public class Main extends ShapeUtils {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getSquare());
    }
}
