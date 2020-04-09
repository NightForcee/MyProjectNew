/**
 * Создать класс
 * Notebook - наследник Computer. В этом классе должно быть поле типа
 * Touchpad - также созданного класса со своими полями. Добавить в класс
 * Notebook transient - поле. Создать объект класса Notebook, сериализовать в файл.
 * Десериализовать объект из файла, продемонстрировать, что transient - поля не сериализуются.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson016;

import java.io.Serializable;

public class Notebook extends Computer implements Serializable {
    transient int weight;
    int buttons;
    public Notebook(String name, String cpu, int ram, int hdd, int weight, int buttons) {
        super(name, cpu, ram, hdd);
        this.weight = weight;
        this.buttons = buttons;
    }
    Touchpad <Integer> touchPad = new Touchpad<>(2);
}

