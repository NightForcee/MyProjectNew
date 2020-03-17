package lesson014;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите адресс электронной почты : ");
        String regex = "([a-zA-Z]\\w+)@(\\w+\\.)(\\w+)";
        String str = sc.nextLine();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        boolean b = m.matches();
        System.out.println(b);
    }
}
