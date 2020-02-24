package Lesson3HomeWork.Task3;

import java.util.Random;

public class RandomDoubleArray {
    public static void main(String[] args) {
        double[] array = new double[10];
        Random random = new Random();
        for (double i = 0; i < array.length; i++) {
            array[(int) i] = (double) random.nextDouble();
            System.out.println(array[(int) i]);

        }
        System.out.println();
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = (double) array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");

        }
        double averageArray = (array[0] + array[9]) /2;
        double minArray = array[0];
        double maxArray = array[9];
        System.out.println("averageArray = " + averageArray + " minArray = " + minArray + " maxArray = " + maxArray);
    }
}
