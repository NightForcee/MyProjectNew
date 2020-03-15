/**
 *Объявите переменную со значением null. Вызовите метод у этой переменной.
 * Отловите возникшее исключение.
 *
 * @autour Artem Slidenko
 * @version lesson12
 */

package lesson012;

public class Task1 {
    public static void main(String[] args) {
        new Task1().someMethod();
    }

    void someMethod() {
        try {
            Integer a = null;
            a.hashCode();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}

