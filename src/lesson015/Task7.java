/**
 * Задан файл с java - кодом.
 * Прочитать текст программы из файла
 * и записать в другой файл в обратном порядке символы каждойстроки.
 *
 * @author Artem Slidenko
 * @versoin 1.0
 */
package lesson015;

import java.io.*;

public class Task7 {
    public static void main(String[] args) {
        File file = new File("D://VisualElements//first.java");
        listCatalog(file);
        String a;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:" + File.separator
                + "VisualElements" + File.separator + "First.java"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("D:" + File.separator
                     + "VisualElements" + File.separator + "First.java"))) {
            while ((a = bufferedReader.readLine()) != null) {
                StringBuilder stringBuilder = new StringBuilder(a);
                writer.write(String.valueOf(stringBuilder.reverse()) + "\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void listCatalog(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File s : files) {
                System.out.println(s);
            }
        }
    }
}
