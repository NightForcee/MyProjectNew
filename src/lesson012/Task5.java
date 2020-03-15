/**
 * Бросить одно из существующих в JDK исключений,
 * отловить его и выбросить своё собственное,
 * указав в качестве причины отловленное.
 *
 * @autour Слиденко Артем
 * @version lesson12
 */

package lesson012;

public class Task5 extends Exception {
    public static void main(String[] args) {
        Exception ex = new Exception("My exception");
        try {
            throw ex;
        } catch (Exception e) {
            System.out.println("Обработка исключения");
            System.out.println(ex.getMessage());
        }
    }
}
