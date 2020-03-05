package Lesson4HomeWork.task1;

import java.util.Scanner;

public class Time {
    int hour;
    int min;
    int sec;
    int seconds;

    public Time(int seconds) {

        if (seconds < 0) {
            seconds = 0;
        }
        this.hour = seconds / 3600;
        this.min = (seconds % 3600) / 60;
        this.sec = seconds % 60;
    }

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        seconds = allSeconds();
    }

    public int allSeconds() {
        int res = (hour * 60) * 60 + min * 60 + sec;
        System.out.println(res + " секунд");
        return res;
    }

    public void printTime() {
        System.out.println("Вы ввели :" + "\n" + hour + "ч " + min + "м " + sec + "с ");
    }

    public int getSeconds() {
        return seconds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите формат ввода времени :" + "\n" + "1 - Введите общее колличество секунд" + "\n" + "2 - Введите время в формате час,минута,секунда");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("Введите общее колличество секунд :");
            int seconds = sc.nextInt();
            Time time1 = new Time(seconds);
            time1.printTime();
            time1.allSeconds();
        } else if (a == 2) {
            System.out.println("Введите время в формате час,минута,секунда" + "\n" + "Введите часы :");
            int hour = sc.nextInt();
            System.out.println("Введите минуты :");
            int min = sc.nextInt();
            System.out.println("Введите секунды :");
            int sec = sc.nextInt();
            Time time1 = new Time(hour, min, sec);
            time1.printTime();
            time1.getSeconds();
        }
    }
}





