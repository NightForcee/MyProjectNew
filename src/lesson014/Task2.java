/**
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
 * с помощью регулярных выражений и выводящую их на страницу.
 *
 * @author Artem Slidenko
 * @version lesson014
 */
package lesson014;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String str = "0xFFFF hello my 123 home @222 0x15FA 123asd ";
        String regex = "0x[a-fA-F0-9]{1,4}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(str.substring(m.start(), m.end()));
        }
    }
}
