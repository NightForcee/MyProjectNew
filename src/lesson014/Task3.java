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
        while (m.find()) {
            System.out.println(str.substring(m.start(), m.end()));
        }
        System.out.println(str.replaceAll(regex, strNew));
    }
}
