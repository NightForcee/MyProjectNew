/**
 * Сравнить скорость чтения и записи 5 МБ символов при использовании классов
 * буфиризированого и не буфиризированого символьного ввода вывода.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson016;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("C://test//test.txt"));
            Reader reader2 = new FileReader("C://test//test.txt");
            BufferedWriter writer1 = new BufferedWriter(new FileWriter("C://test//test1.txt"));
            Writer writer2 = new FileWriter("C://test//test1.txt");

            int noBuffer;
            StringBuilder noBuf = new StringBuilder();
            long timeStartReading = System.currentTimeMillis();
            while ((noBuffer = reader2.read()) >= 0) {
                noBuf.append(noBuffer);
            }
            long timeStopReading = System.currentTimeMillis();
            long timeReading = timeStopReading - timeStartReading;
            System.out.println("Чтение без буфера (мс) : " + timeReading + "мс");

            String withBuffer;
            StringBuilder yesBuf = new StringBuilder();
            long timeStartReadingBuff = System.currentTimeMillis();
            while ((withBuffer = reader1.readLine()) != null) {
                yesBuf.append(withBuffer);
            }
            long timeStopReadingBuff = System.currentTimeMillis();
            long timeReadingBuff = timeStopReadingBuff - timeStartReadingBuff;
            System.out.println("Чтение с буфером (мс) : " + timeReadingBuff + "мс");

            long timeStartWriting = System.currentTimeMillis();
            writer2.write(noBuf.toString());

            long timeStopWriting = System.currentTimeMillis();
            long timeWriting = timeStopWriting - timeStartWriting;
            System.out.println("Запись без буфера (мс) : " + timeWriting + "мс");

            long timeStartWritingBuff = System.currentTimeMillis();
            writer1.write(yesBuf.toString());

            long timeStopWritingBuff = System.currentTimeMillis();
            long timeWritingBuff = timeStopWritingBuff - timeStartWritingBuff;
            System.out.println("Запись с буфером (мс) : " + timeWritingBuff + "мс");

            reader1.close();
            reader2.close();
            writer1.close();
            writer2.close();

        } catch (IOException e) {
            System.out.println("Нет файла");
        }
    }
}
