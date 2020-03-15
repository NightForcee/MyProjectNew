/**
 * Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
 * Добавить вконструктор своего класса возможность указания сообщения.
 *
 * @autour Artem Slidenko
 * @version lesson12
 */

package lesson012;

public class Task4 extends RuntimeException {
    int a;
    int b;

    Task4(int j, int d) {
        this.a = j;
        this.b = d;
    }

    Task4(String message) {
        super(message);
    }

    int resultDevide() {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            new Task4(15, 0).resultDevide();
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
