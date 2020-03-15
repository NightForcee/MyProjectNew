/**
 * Создать собственный класс-исключение - наследник класса Exception.
 * Создать метод, выбрасывающий это исключение.
 * Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.
 *
 * @autour Слиденко Артем
 * @version lesson12
 */

package lesson12;

public class Task3 extends Exception {
    int a;
    int b;

    Task3(int j, int d) {
        this.a = j;
        this.b = d;
    }

    int resultDevide() {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            new Task3(5, 0).resultDevide();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
