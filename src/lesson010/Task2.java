package lesson010;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new LinkedList<>();
        ListIterator<Integer> listIterator = list.listIterator();

        for (int i = 0; i < 10; i++) {
            Integer a = random.nextInt(10);
            listIterator.add(a);
        }
        System.out.println(list);

        int min = list.get(0);
        int max = list.get(0);

        for (Integer tmp : list) {
            if (tmp < min) {
                min = tmp;
            }
            if (tmp > max) {
                max = tmp;
            }
        }
        System.out.println("Minimal : " + min + "\n" + "Maximal : " + max);
    }
}

