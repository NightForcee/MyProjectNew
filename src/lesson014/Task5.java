/**
 * Написать метод, который проверяет, является ли строка адресом IPv4.
 * Пример корректных IPv4
 * 0.0.0.0
 * 0.0.1.0
 * 255.0.0.1
 * 255.55.255.255
 * 192.168.0.1
 * Не корректный
 * 001.0.0.0
 * 256.1.1.1
 * 1.1.1.1.
 * -1.0.-1.1
 *
 * @author Artem Slidenko
 * @version lesson014
 */
package lesson014;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    private static String ipAddress(String ip) {
        Pattern p = Pattern.compile("^(?!0)(?!.*\\.$)((1?\\d?\\d|25[0-5]|2[0-4]\\d)(\\.|$)){4}$");
        Matcher m = p.matcher(ip);
        if (m.find()) {
            System.out.println("Введенная строка является адресом IPv4 - " + m.group());
        } else System.out.println("Введенная строка не является адресом IPv4");
        return ip;
    }

    public static void main(String[] args) {
        String strIp = "192.168.0.1";
        ipAddress(strIp);

        String strIp1 = "-1.0.-1.1";
        ipAddress(strIp1);
    }
}
