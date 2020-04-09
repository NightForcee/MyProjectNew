/**
 * Дан список строк. Найти количество уникальных
 * строк длиной более 8 символов.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson017;

import java.util.*;

public class Task2 {
    public static double average2(List<String> list){
        long count = list.stream().filter(s -> s.length() > 8).distinct().count();
        return count;
    }
    public static void main(String[] args) {
        List<String> lest1 = Arrays.asList("123qwerty", "artem228", "Artemka222222", "lol123lol123", "AS", "Slidenko");
        System.out.println("Колличество уникальных строк - " + average2(lest1));
    }
}
