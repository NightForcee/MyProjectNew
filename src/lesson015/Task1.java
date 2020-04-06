/**
 * Задан файл с многострочным тестом. Прочитать и вывести этот
 * файл в консоль построчно.
 *
 * @author Artem SLidenko
 * @version 1.0
 */
package lesson015;

import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String a = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D://VisualElements//first.txt"))) {
            while ((a = bufferedReader.readLine()) != null) {
                System.out.println(a);
            }
        }
    }
}
