package Lesson3HomeWork.Task2;

public class First100NaturalNumber {
    public static void main(String[] args) {
        int[] mark = new int[100];
        int n = 1;
        int i;

        for (i = 0; i < mark.length; n++) {
            if (n % 13 == 0 || n % 17 == 0) {
                mark[i] = n;
                i++;
            }
        }
        for(i = 0; i < mark.length; ++i){
            System.out.println(mark[i]+ " ");
        }


    }
}








