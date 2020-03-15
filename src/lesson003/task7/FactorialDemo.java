package lesson003.task7;

import java.util.Scanner;

public class FactorialDemo {
    static int factorialDemo(int n) {
        int res = 1;
        int i = 1;
        while (i <= n) {
            res *= i;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число (факториал) :");
        int a = scanner.nextInt();
        System.out.println(factorialDemo(a));
    }
}
