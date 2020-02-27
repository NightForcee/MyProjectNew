package Lesson4HomeWork.task1;

import java.util.Scanner;

public class TestTime {
    public static void main(String[] args) {
        Time time1 = new Time(555);
        time1.printTime();
        time1.allSeconds();

        System.out.println();

        Time time2 = new Time(9,55,49);
        time2.printTime();
        time2.allSeconds();
    }
}


