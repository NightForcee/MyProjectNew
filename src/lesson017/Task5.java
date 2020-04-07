/**
 * Дан класс Person с полями firstName, lastName, age.
 * Вывести полное имя самого старшего человека, у
 * которого длина этого имени не превышает 15
 * символов.
 *
 * @author ARtem Slidenko
 * @version 1.0
 */
package lesson017;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Artem", "Slidenko", 22),
                new Person("Oleg", "Shkorik", 23),
                new Person("Vlad", "Vlado", 23),
                new Person("qwe", "eqw", 97),
                new Person("qwerty", "ytrewq", 30));

        Optional<Person> res = list.stream().filter(person -> person.getFirstName().length() < 15).sorted((o1, o2) -> -o1.getAge()).findFirst();
        System.out.println(res.get().toString());
    }
}

