package lesson010;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Students {
    private String name;

    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class StudentsDemo {
    public static void main(String[] args) {
        List<Students> list = new LinkedList<>();

        list.add(new Students("Vasya"));
        list.add(new Students("Masha"));
        list.add(new Students("Misha"));
        list.add(new Students("Artem"));
        list.add(new Students("Yuli"));
        list.add(new Students("Olga"));
        list.add(new Students("Veronika"));
        list.add(new Students("Natasha"));
        list.add(new Students("Igor"));
        list.add(new Students("Arsen"));

        ListIterator<Students> listIterator = list.listIterator();
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i).getName());
        }

        while (listIterator.hasNext()) {
            listIterator.next();
        }
        System.out.println();
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous().getName());
        }
    }
}



