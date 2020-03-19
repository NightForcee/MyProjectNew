/**
 * Написать программу, выполняющую поиск в строке мобильных телефонных номеров в формате +375XXYYYYYYY
 * и заменяющую каждый телефон на тот же, но в формате +375 (XX) YYY-YY-YY
 * X - код оператора
 * Y - номер телефона
 *
 * @author Artem Slidenko
 * @version lesson014
 */
package lesson014;

public class Task4 {
    private static String numberOfTelephone(String str) {
        return str.replaceAll("(\\+375)(\\d{2})(\\d{3})(\\d{2})(\\d{2})", "$1 ($2) $3-$4-$5");
    }

    public static void main(String[] args) {
        String str = " +375292881031  +375292223334455 +375291234567";
        System.out.println("\n из : " + str);
        System.out.println("получились номера : " + numberOfTelephone(str));
    }
}

