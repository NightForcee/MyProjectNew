/**
 * Дан список целых чисел, вывести строку,
 * представляющую собой конкатенацию строковых
 * представлений этих чисел.
 * Пример: список {5, 2, 4, 2, 1}
 * Результирующая строка: "52421"
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson017;

import java.util.*;

public class Task4 {
    public static String average4(List<Integer> list) {
        String st = list.stream().map(e -> e.toString()).reduce("", String::concat);
        return st;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        System.out.println("Конкатенация строковых представлений : " + average4(list));
    }
}
