/**
 * Написать два цикла, выполняющих многократное сложение строк, один с
 * помощью оператора сложения и String,
 * второй с помощью StringBuilder и метода append
 *
 * @autour Artem Slidenko
 * @version lesson13
 */

package lesson013;

public class Task1 {
    public static void main(String[] args) {
        String str = "I love Java ";
        String str2 = "I love Java ";
        for (int i = 0; i < 10; i++) {
            String str1 = str + ("and English!");
            System.out.println(str1);
        }
        System.out.println("------------------------");
        for (int i = 0; i < 10; i++) {
            StringBuilder stringBuilder = new StringBuilder(str2);
            stringBuilder.append("and English!");
            System.out.println(stringBuilder);
        }
    }
}
