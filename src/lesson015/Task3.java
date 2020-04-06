/**
 * Задан файл с
 * текстом, найти и вывести в консоль все слова,
 * для
 * которых последняя буква одного слова совпадает с первой буквой
 * следующего слова
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson015;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        String a = null;
        int count = 0;
        try (BufferedReader line = new BufferedReader(new FileReader("D://VisualElements//first.txt"))) {
            while ((a = line.readLine()) != null) {
                String[] words = a.split("[\\s,.:!?]+");
                for (int i = 0; i < words.length - 1; i++) {
                    if (!words[i].isEmpty() && !words[i + 1].isEmpty()) {
                        if (words[i].charAt(words[i].length() - 1) == words[i + 1].charAt(0)) {
                            count++;
                            System.out.println(count + ")" + " " + words[i] + " " + words[i + 1]);
                        }
                    }
                }
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
