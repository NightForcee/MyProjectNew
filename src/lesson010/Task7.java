/**
 * Использовать Алгоритмы.
 * Не используя вспомогательных объектов,
 * переставить отрицательные элементы сгенерированного списка в конец, а
 * положительные
 * –
 * в начало этого списка.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson010;

import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-2, -4, -6, -8, 10, 12, 14));
        System.out.println("Изначальный список : " + list);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("Отсортированный список : " + list);
    }
}
