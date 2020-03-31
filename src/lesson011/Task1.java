/**
 * Написать метод countUnique, который принимает целочисленный
 * список в качестве параметра и возвращает количество уникальных
 * целых чисел в этом списке.
 *
 * @author Artem SLidenko
 * @version 1.0
 */
package lesson011;

import java.util.*;

public class Task1 {
    public static int countUnique(Set<Integer> list) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int n : list)
            set.add(n);

        return set.size();
    }

    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
        System.out.println(countUnique(list));
    }
}
