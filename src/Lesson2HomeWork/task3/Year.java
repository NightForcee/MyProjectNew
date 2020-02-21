package Lesson2HomeWork.task3;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = sc.nextInt();
        if(year % 4 == 0 ){
            if(year % 100 != 0 || year % 400 == 0){
                    System.out.println("Этот год високосный!");
                }else System.out.println("Этот год не високосный!");

            }else System.out.println("Этот год не високосный!");
        }


    }



