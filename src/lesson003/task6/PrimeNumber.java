package lesson003.task6;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int a = sc.nextInt();
        int i;

        for (i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println("Это число составное!");
                return;
            } else
                System.out.println("Это число простое!");
            return;
        }
    }
}
