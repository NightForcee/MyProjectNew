/**
 * Написать функцию, принимающую в качестве параметров имя, фамилию и
 * отчество и возвращающую инициалы в формате "Ф.И.О".
 * Учесть, что входные параметры могут быть в любом
 * регистре, а результирующая строка должна быть в верхнем.
 *
 * @autour Artem Slidenko
 * @version lesson13
 */
package lesson013;

public class Task4 {
    private String firstName, lastName, patronymic;
    private String a, b, c;

    protected Task4(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    protected void makeUpperCase() {
        a = firstName.toUpperCase();
        b = lastName.toUpperCase();
        c = patronymic.toUpperCase();
    }

    protected void fullName() {
        makeUpperCase();
        char chFirstName = a.charAt(0);
        char chLastName = b.charAt(0);
        char chPatronymic = c.charAt(0);
        System.out.println(chLastName + "." + chFirstName + "." + chPatronymic);
    }

    public static void main(String[] args) {
        Task4 task = new Task4("Artem", "Slidenko", "Mikhailovich");
        task.fullName();
    }
}
