/**
 * Подсчитать количество слов в тексте. Учесть, что слова могут разделяться
 * несколькими пробелами.
 *
 * @autour Artem Slidenko
 * @version lesson13
 */
package lesson013;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        //First method
        String str1 = "Java my best         friend     in the wolrd";
        System.out.println("Колличество слов в строе = " + str1.split(" +").length);

        //Second method
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку через пробел");
        String str = sc.nextLine();
        System.out.println("Колличество слов в строе = " + str.split(" +").length);
    }
}
