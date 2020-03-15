/**
 * Написать метод, который в 50% случаев бросает исключение.
 * Вызвать этот метод в конструкции try-catch-finally.
 * Протестировать работу блока finally.
 *
 * @autour Artem Slidenko
 * @version lesson12
 */

package lesson012;

import java.util.Random;

public class Task7 extends Exception {
    public static void main(String[] args) {
        try {
            new Task7().testException();
        } catch (RuntimeException r) {
            System.out.println("RunTime Exception");
        } finally {
            System.out.println("Always can see");
        }
    }

    Random rd = new Random();
    int a = rd.nextInt(2);

    void testException() {
        if (a == 0) {
            throw new RuntimeException();
        }
    }
}
