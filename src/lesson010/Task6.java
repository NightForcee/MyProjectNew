/**
 * Имеется текст. Следует составить для него частотный словарь.
 *
 * @author Artem SLidenko
 * @version 1.0
 */

package lesson010;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        String text = "Задать размер стека. Задать размер стека. Задать размер стека. Задать размер стека.";
        Map<String, Integer> map = new HashMap<>();
        String[] words = text.replaceAll("\\p{Punct}", "").split(" ");
        List<String> wordsList = new ArrayList<>(Arrays.asList(words));
        for (String tmp : words) {
            map.put(tmp, Collections.frequency(wordsList, tmp));
        }
        System.out.println("Слова : " + map);
    }
}
