/**
 * Задан файл с текстом. В каждой строке найти и вывести
 * наибольшее число цифр, идущих подряд.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson015;

import java.io.*;
import java.util.regex.*;

public class Task4 {
    public static void main(String[] args) {
        String a = null;
        int length = 0;
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader("D://VisualElements//first.txt"))) {
            while (bufferedReader.ready()) {
                Pattern pattern = Pattern.compile("\\d+");
                Matcher matcher = pattern.matcher(bufferedReader.readLine());
                while (matcher.find()) {
                    if (matcher.group().length() > length) {
                        length = matcher.group().length();
                        a = matcher.group();
                    }
                }
                if (a != null) {
                    System.out.println(a);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
