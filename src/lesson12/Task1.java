/**
 *Объявите переменную со значением null. Вызовите метод у этой переменной.
 * Отловите возникшее исключение.
 *
 * @autour Слиденко Артем
 * @version lesson12
 */

package lesson12;

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

