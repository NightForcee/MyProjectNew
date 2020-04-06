/**
 * Задан файл с текстом, найти и вывести в консоль все слова,
 * начинающиеся с гласной буквы.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson015;

import java.io.*;
import java.util.regex.*;

public class Task2 {
    public static void main(String[] args) {
        String a = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D://VisualElements//first.txt"))) {
            while ((a = bufferedReader.readLine()) != null) {
                String[] words = a.split("[\\s,.:!?]+");
                Pattern p = Pattern.compile("^[аеёиоуыэюяАЕЁИОУЫЭЮЯ]");
                for (String word : words) {
                    Matcher matcher = p.matcher(word);
                    if (matcher.find()) {
                        System.out.println(word);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
