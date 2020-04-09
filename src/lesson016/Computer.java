/**
 * Создать класс Computer
 * . Добавить ему несколько полей,
 * создать объект этого класса, сериализовать в файл.
 * Десериализовать объект из того же файла, вывести значения
 * полей в консоль.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson016;

import java.io.Serializable;

public class Computer implements Serializable {
    String name;
    String cpu;
    int ram;
    int hdd;

    public Computer(String name, String cpu, int ram, int hdd) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }
}


