/**
 * Написать код, который создаст,
 * а затем отловит ArrayIndexOutOfBoundsException.
 *
 * @autour Artem Slidenko
 * @version lesson12
 */

package lesson012;

public class Task2 {
    public static void main(String[] args) {
        int i = 0;
        int[] arr = new int[5];

        while (true) {
            try {
                arr[i] = i;
            } catch (Exception e) {
                System.out.println(e.toString());
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
