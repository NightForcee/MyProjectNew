/**Задание. Создать список оценок учеников с помощью ListIterator,
 заполнить случайными оценками. Удалить неудовлетворительные оценки
 из списка.
 *
 * @author Artem Slidenko
 * @version 1.0
 */

package lesson010;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new LinkedList<>();
        ListIterator<Integer> listIterator = list.listIterator();

        for (int i = 0; i < 10; i++) {
            Integer a = random.nextInt(10);
            listIterator.add(a);
        }
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Integer tmp = listIterator.next();
            if (tmp < 4) {
                listIterator.remove();
            }
        }
        System.out.println(list);
    }
}
