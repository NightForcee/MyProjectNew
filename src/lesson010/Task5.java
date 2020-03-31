/**
 * Определить множество на основе множества целых чисел. Создать
 * методы для определения пересечения и объединения множеств.
 *
 * @author Artem SLidenko
 * @version 1.0
 */

package lesson010;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(s1);
        Set<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        System.out.println(s2);
        System.out.println("Объединение множества - " + unification(s1, s2));
        System.out.println("Пересечение множества - " + intersect(s1, s2));
    }

    public static Set<Integer> intersect(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> set = new HashSet<>(s1);
        set.retainAll(s2);
        return set;
    }

    public static Set<Integer> unification(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> set = new HashSet<>(s1);
        set.addAll(s2);
        return set;
    }
}

