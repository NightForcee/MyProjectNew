/**
 * Написать функцию, принимающую 2 параметра: строку и слово- и возвращающую true,
 * если строка начинается и заканчивается этим словом.
 *
 * @autour Artem Slidenko
 * @version lesson13
 */
package lesson013;

public class Task3 {
    String str;
    String str1;

    public Task3(String str, String str1) {
        this.str = str;
        this.str1 = str1;
    }

    boolean isTrue() {
        if (str.startsWith(str1) && str.endsWith(str1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Task3 task = new Task3("Java its all my Java", "Java");
        System.out.println(task.isTrue());
    }
}
