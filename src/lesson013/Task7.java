/**
 * Написать функцию, принимающую на вход целое число, возвращающую
 * строку из 10 символов, дополненных слева нулями. Если число выходит за размер 10
 * символов вернуть все нули. Пример getString(22)-> 0000000022
 *
 * @autour Artem Slidenko
 * @version lesson13
 */
package lesson013;

public class Task7 {
    public void methodPrintF(int a) {
        if (a < 999999999) {
            System.out.printf("%010d", a);
        } else {
            System.out.println("0000000000");
        }
    }

    public static void main(String[] args) {
        Task7 task = new Task7();
        task.methodPrintF(22);
    }
}
