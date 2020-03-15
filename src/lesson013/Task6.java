/**
 * Написать функцию, заменяющую несколько последовательных
 * одинаковых символов в строке одним
 *
 * @autour Artem Slidenko
 * @version lesson13
 */
package lesson013;

public class Task6 {
    public static void main(String[] args) {
        String str = "aabbccdddeeefffggg";
        System.out.println(str.replaceAll("([A-Za-z])\\1+", "$1"));
    }
}
