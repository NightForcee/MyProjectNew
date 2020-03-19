/**
 * Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
 * В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний, при этом оно должно начинаться с буквы.
 * Возможные домены верхнего уровня: .org .com
 *
 * @author Artem Slidenko
 * @version lesson014
 */
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
        if (m.find()) {
            System.out.println("Корректный email");
        } else {
            System.out.println("Не корректный email");
        }
    }
}