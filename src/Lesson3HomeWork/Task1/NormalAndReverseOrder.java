package Lesson3HomeWork.Task1;

public class NormalAndReverseOrder {
    public static void main(String[] args) {
        int[] mark = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < mark.length; i++) {
            System.out.println(mark[i]);
        }
        System.out.println();
        for (int i = mark.length - 1; i >= 0; i--) {
            System.out.println(mark[i]);

        }
    }
}
