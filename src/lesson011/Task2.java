/**
 * Написать метод isUnique, который принимает Map<String, String>
 * и возвращает true,
 * если два различных ключа не соответствуют двум одинаковым
 * значениям.
 *
 * @author Artem Slidenko
 * @version 1.0
 */

package lesson011;

import java.util.*;

public class Task2 {
    public static boolean isUnique(Map<String, String> map) {
        Set<String> uniqueValues = new HashSet<>();
        for (String value : map.values()) {
            if (uniqueValues.contains(value)) {
                return false;
            }
            uniqueValues.add(value);
        }
        return true;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Marty", "Stepp");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Amanda", "Camp");
        map.put("Hal", "Perkins");

        System.out.println(isUnique(map));
    }
}


