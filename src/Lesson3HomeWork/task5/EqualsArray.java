package Lesson3HomeWork.task5;

import java.util.Arrays;

public class EqualsArray {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5}, {1, 3, 5, 7, 9}
        };
        int[][] array2 = {
                {1, 2, 3, 4, 5}, {1, 3, 5, 7, 9}
        };
        System.out.println(Arrays.deepEquals(array, array2));
        System.out.println(Arrays.deepToString(array2));
    }
}
