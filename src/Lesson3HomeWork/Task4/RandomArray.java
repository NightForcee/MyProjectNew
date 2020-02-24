package Lesson3HomeWork.Task4;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random random = new Random();
        int j = 0;
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(99);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        if (array[0] < array[1] & array[1] < array[2]){
            System.out.println("Данный массив является строго возврастающей прогрессией!");
        } else System.out.println("Данный массив не является строго возрастающей прогрессией!");

    }

}
