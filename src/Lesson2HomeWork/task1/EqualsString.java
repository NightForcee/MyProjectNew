package Lesson2HomeWork.task1;

import java.util.Scanner;

public class EqualsString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EqualsStringDemo test = new EqualsStringDemo();

        System.out.println("Введите первое слово:");
        test.text = sc.next();

        System.out.println("Введите второе слово:");
        test.text2 = sc.next();

        if (test.equals(test.text, test.text2)) {
            System.out.println("Отлично! Слова одинаковы.");
        } else if (test.equalsIsIgnoreCase(test.text, test.text2)) {
            System.out.println("Хорошо. Почти одинаковы.");
        } else if (test.lenght()) {
            System.out.println("Ну, хотя бы они одной длины.");
        } else {
            System.out.println("Слова не сочетаемы друг с другом!");
        }
    }
}
