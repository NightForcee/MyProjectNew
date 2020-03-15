/**
 * Создать иерархию классов, описывающих геометрические фигуры
 * на плоскости
 *
 * @autour Слиденко Артем
 * @version lesson7
 */

package lesson008;

import org.apache.log4j.Logger;

public class Main extends ShapeUtils {
    public static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getSquare());

        LOGGER.trace("Before call say method");
        LOGGER.debug("Before call say method");
        LOGGER.info("Before call say method");
        LOGGER.warn("Before call say method");
    }
}
