/**
 * Вывести список файлов и каталогов выбранного каталога на
 * диске с учетом вложенности директориев.
 * Для этого использовать рекурсию.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson015;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Task6 {
    public static void main(String[] args) {
        File fp = new File("D://VisualElements//first.txt");
        if (fp.exists()) {
            if (fp.isFile()) {
                System.out.println("Путь к файлу:\t" + fp.getPath());
                System.out.println("Абсолютный путь:\t" + fp.getAbsolutePath());
                System.out.println("Размер файла:\t" + fp.length());
                System.out.println("Последня ямодификация:\t" + new Date(fp.lastModified()));
                System.out.println("Файл доступен для чтения:\t" + fp.canRead());
                System.out.println("Файл доступен для записи:\t" + fp.canWrite());
                System.out.println("Файл удален:\t" + fp.delete());
            }
        } else System.out.println("файл " + fp.getName() + " не существует");
        try {
            if (fp.createNewFile()) System.out.println("Файл " + fp.getName() + " создан");
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
