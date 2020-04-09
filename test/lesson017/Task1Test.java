package lesson017;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Task1Test {

    @Test
    public void Task1Test() {
        Task1 task1 = new Task1();
        List<Integer> asList = Arrays.asList(0, -10, -15, 25);
        double expected = 5.0;
        double actual = Task1.average(asList);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void Task2Test() {
        Task2 task2 = new Task2();
        List<String> list = Arrays.asList("123qwerty", "artem228", "Artemka222222", "lol123lol123", "AS", "Slidenko");
        double expected = 3.0;
        double actual = Task2.average2(list);
        Assert.assertEquals(expected, actual, 0.01);
        System.out.println(actual);
    }

    @Test
    public void Task3Test() {
        Task3 task3 = new Task3();
        Map<String, Integer> map = new HashMap<>();
        map.put("Artem", 22);
        map.put("Olegovich", 228);
        map.put("Vlad", 23);
        map.put("Vladikavkaz", 2233);
        map.put("Viktor", 1);

        double expected = 46.0;
        double actual = Task3.average3(map);
        Assert.assertEquals(expected, actual, 0.01);
        System.out.println(actual);
    }

    @Test
    public void Task4Test() {
        Task4 task4 = new Task4();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        String expected = "123456789";
        String actual = Task4.average4(list);
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void Task5Test() {
        List<Person> list = new ArrayList<>();
        Person person = new Person("Artem", "Slidenko", 22);
        Person person1 = new Person("Oleg", "Shkorik", 23);
        Person person2 = new Person("qwerty", "ytrewq", 30);
        list.add(person);
        list.add(person1);
        list.add(person2);

        Optional<Person> expected = Optional.of(person2);
        Optional<Person> actual = Task5.average5(list);
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }

}
