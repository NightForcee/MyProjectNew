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
    public static void main(String[] args) {
        List<String> lest1 = Arrays.asList("123qwerty", "artem228", "Artemka222222", "lol123lol123", "AS", "Slidenko");
        long count = lest1.stream().filter(s -> s.length() > 8).distinct().count();
        System.out.println("Колличество уникальных строк - " + count);
    }
}
