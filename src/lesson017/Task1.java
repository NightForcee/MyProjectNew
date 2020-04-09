/**
 * Дан список целых чисел. Найти среднее всех
 * нечётных чисел, делящихся на 5.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson017;

import java.util.*;

public class Task1 {
    public static double average(List<Integer> list) {
        double averageNew = list.stream()
                .filter((i -> i % 5 == 0))
                .filter((i -> i % 2 != 0))
                .mapToInt(x -> x).average()
                .getAsDouble();
        return averageNew;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        System.out.println("Среднее значение нечетных чисел : " + average(list));
    }
}
