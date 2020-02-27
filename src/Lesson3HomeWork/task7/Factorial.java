package Lesson3HomeWork.task7;

import java.util.Scanner;

public class Factorial {
    static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите факториал (число): ");
        int a = scanner.nextInt();
        System.out.println(calculateFactorial(a));
    }
}
