/**
 * Записать в двоичный файл 20 случайных чисел типа int
 * со значением больше255.
 * Прочитать записанный файл, распечатать числа и их среднее арифметическое.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson015;

import java.io.*;

public class Task5 {
    public static void main(String[] args) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("D://VisualElements//first.txt"))) {
            for (int i = 0; i < 20; i++) {
                int c = (int) (123 + (Math.random() * 10000));
                dataOutputStream.write(c);
            }
            dataOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (DataInputStream line = new DataInputStream(new FileInputStream("D://VisualElements//first.txt"))) {
            int sum = 0, i = 0;
            System.out.println("\n 20 случайных чисел :");
            while (line.available() > 0) {
                int text = line.read();
                System.out.print(text + " ");
                sum += text;
                i++;
            }
            System.out.println("\n Среднее арифметическое этих чисел - " + sum / i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
