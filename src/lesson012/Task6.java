/**
 * Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
 * Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
 *
 * @autour Artem Slidenko
 * @version lesson12
 */

package lesson012;

import java.io.IOException;
import java.util.Random;

public class Task6 extends Exception {
    Random random = new Random();
    int a = random.nextInt(3);

    void randomException() throws Exception {
        if (a == 0) {
            throw new RuntimeException("Ошибка RunTime");
        }
        if (a == 1) {
            throw new IOException("Ошибка IO");
        }
        if (a == 2) {
            throw new ReflectiveOperationException("Ошибка Reflective");
        }
    }

    public static void main(String[] args) {
        try {
            new Task6().randomException();
        } catch (RuntimeException r) {
            System.out.println("RunTime Exception");
        } catch (java.io.IOException io) {
            System.out.println("IO Exception");
        } catch (ReflectiveOperationException rf) {
            System.out.println("Reflective Exception");
        } catch (Throwable thr) {
            thr.printStackTrace();
            System.out.println("Hello");
        }
    }
}
