/**
 * Сложить два многочлена заданной степени, если коэффициенты
 * многочленов хранятся в двух объектах HashMap в виде:
 * Ключ: номер степени
 * Значение: значение множителя
 *
 * @author Artem SLidenko
 * @version 1.0
 */
package lesson011;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<>();

        map1.put(3, 5);
        map1.put(2, 1);
        map1.put(1, 1);

        TreeSet<Integer> treeSet1 = new TreeSet<>(map1.keySet());
        Iterator<Integer> iterator1 = treeSet1.iterator();
        StringBuilder str1 = new StringBuilder();

        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(3, 3);
        map2.put(2, 2);
        map2.put(4, 2);

        TreeSet<Integer> treeSet2 = new TreeSet<>(map2.keySet());
        Iterator<Integer> iterator2 = treeSet2.iterator();
        StringBuilder str2 = new StringBuilder();
        Map<Integer, Integer> mapRes = new HashMap<>();

        while (iterator1.hasNext()) {
            Integer key1 = iterator1.next();
            str1.append(map1.get(key1)).append("x^").append(key1).append("+");
            if (map2.containsKey(key1)) {
                mapRes.put(key1, map1.get(key1) + map2.get(key1));
            } else {
                mapRes.put(key1, map1.get(key1));
            }
        }

        System.out.println(outputPolynomial(str1));

        while (iterator2.hasNext()) {
            Integer key2 = iterator2.next();
            str2.append(map2.get(key2)).append("x^").append(key2).append("+");
            if (map1.containsKey(key2)) {
            } else {
                mapRes.put(key2, map2.get(key2));
            }
        }

        System.out.println(outputPolynomial(str2));

        TreeSet<Integer> treeSetRes = new TreeSet<>(mapRes.keySet());
        Iterator<Integer> iteratorRes = treeSetRes.iterator();
        StringBuilder strRes = new StringBuilder();

        while (iteratorRes.hasNext()) {
            Integer resKey = iteratorRes.next();
            strRes.append(mapRes.get(resKey)).append("x^").append(resKey).append("+");
        }
        System.out.println("Результирующий многочлен: " + outputPolynomial(strRes));
    }

    private static StringBuilder outputPolynomial(StringBuilder str) {
        int a = str.length();
        str.deleteCharAt(a - 1);
        return str;
    }
}
