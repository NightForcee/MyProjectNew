package lesson002.task2;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму в рублях:");
        a = sc.nextInt();

        int o = a % 10;
        int oo = a % 100;

        if (o == 1 & oo == 1) {
            System.out.println(a + " рубль.");
        } else if (o > 1 && o < 5 || oo > 1 && oo < 5) {
            System.out.println(a + " рубля.");
        } else if (o > 5 && o < 20 || oo > 5 && oo < 20) {
            System.out.println(a + " рублей.");
        } else if (o == 11 || oo == 11) {
            System.out.println(a + " рублей.");
        } else {
            System.out.println(a + " рублей.");
        }

    }
}
