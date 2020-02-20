package com.company;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DayDemo demo1 = new DayDemo();
        System.out.println("Введите день: ");
        demo1.a = sc.nextInt();

        System.out.println("Введите месяц: ");
        demo1.b = sc.nextInt();

        System.out.println("Введите год: ");
        demo1.c = sc.nextInt();

        demo1.formatString(demo1.a, demo1.b, demo1.c);
    }

}
