package lesson014;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String str = " +375292881031  asd 123142 +375291234567";
        String str2;
        String regex = "(\\s+?|)\\+(375(29|33|44)\\d{7})";
        String regex2 = "\\+(375\\s[(](25|29|33|44)[)]\\s)\\d{3}-\\d{2}-\\d{2}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()){
            System.out.println(str.substring(m.start(),m.end()));
        }

//        System.out.println(str.replaceAll(regex,regex2));
    }
}
