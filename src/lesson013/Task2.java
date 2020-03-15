/**
 * Заменить все грустные смайлы :(
 * в строке на весёлые :)
 *
 * @autour Artem Slidenko
 * @version lesson13
 */
package lesson013;

public class Task2 {
    public static void main(String[] args) {
        String str = new String(":(:(:(:(:(:(:(:(:(:(:(:(:(");
        System.out.println("Old = " + str);
        System.out.println("New = " + str.replace('(', ')'));
    }
}
