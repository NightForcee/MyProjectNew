package lesson002.task2;

import java.util.Scanner;

public class MoneyDemo {
    public static void main(String[] args) {
        int a;
        int o;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму в рублях:");
        a = sc.nextInt();
        o = a % 10;

        switch (o){
            case 0 :
                System.out.println(a + " рублей.");
                break;
            case 1:
                System.out.println(a + " рубль.");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(a + " рубля.");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(a + " рублей.");
                break;
        }
    }
}

