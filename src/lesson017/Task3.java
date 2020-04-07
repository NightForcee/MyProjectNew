/**
 * Дана Map<String, Integer>. Найти сумму всех
 * значений, длина ключей
 * которых меньше 7 символов.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson017;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Artem", 22);
        map.put("Olegovich", 228);
        map.put("Vlad", 23);
        map.put("Vladikavkaz", 2233);
        map.put("Viktor", 1);

        int sum = map.entrySet().stream().filter(e -> e.getKey().length() < 7).mapToInt(s -> s.getValue()).sum();
        System.out.println("Сумма значении - " + sum);
    }
}
