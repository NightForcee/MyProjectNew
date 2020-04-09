package lesson016;

import java.io.*;

public class ComputerDemo {
    public static void main(String[] args) {

        /**  2.	Создать класс Computer. Добавить ему несколько полей, создать объект этого класса, сериализовать в файл.
         Десериализовать объект из того же файла, вывести значения полей в консоль.*/

        Computer computer1 = new Computer("Dell", "i7", 8192, 1000);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C://test//test.txt"));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C://test//test.txt"));
        ) {
            objectOutputStream.writeObject(computer1);
            Computer computer2 = (Computer) objectInputStream.readObject();
            System.out.println("\nМодель компьютера : " + computer2.name + "\nПроцессор : " + computer2.cpu
                    + "\nОперативная память : " + computer2.ram + "\nВинчестер : " + computer2.hdd);
        } catch (Exception e) {
            System.out.println("No have file!");
        }

        /**3.	Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad - также созданного класса со своими полями.
         Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
         Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.*/

        Notebook notebook1 = new Notebook("Dell", "i7", 8192, 1000, 3, 1);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C://test//test.txt"));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C://test//test.txt"));
        ) {
            objectOutputStream.writeObject(notebook1);
            Notebook notebook2 = (Notebook) objectInputStream.readObject();
            System.out.println("\nМодель ноутбука : " + notebook1.name + "\nВес ноутбука(transient поле) : " + notebook1.weight
                    + "\nКолличество кнопок : " + notebook1.buttons + "\nКолличество кнопок на тачпаде : " + notebook1.touchPad.buttons);
            System.out.println("\nМодель ноутбука : " + notebook2.name + "\nВес ноутбука(transient поле) : " + notebook2.weight
                    + "\nКолличество кнопок : " + notebook2.buttons + "\nКолличество кнопок на тачпаде : " + notebook2.touchPad.buttons);
        } catch (Exception e) {
            System.out.println("Нет файла");
        }

    }
}

