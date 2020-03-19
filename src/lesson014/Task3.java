/**
 * Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры, например <p id ="p1">,
 * и замену их на простые теги абзацев <p>.
 *
 * @author Artem Slidenko
 * @version lesson014
 */
package lesson014;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String str = " Java my friend <p1> and english <p2> my friend <p3> ";
        String regex = "\\<p(\\d)>*";
        String strNew = "<p>";
        System.out.printf(str.replaceAll("\\<p(\\d)>*", "<p>"));
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
    }
}
