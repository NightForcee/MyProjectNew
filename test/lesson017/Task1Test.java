package lesson017;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Task1Test {

    @Test
    public void addTest() {
        Task1 task1 = new Task1();
        List<Integer> asList = Arrays.asList(0, -10, -15, 25);
        List<Integer> asList2 = Arrays.asList(0, -10, -15, 25);

        Task1.average(asList);
        Assert.assertEquals(asList, asList2);
    }
}
