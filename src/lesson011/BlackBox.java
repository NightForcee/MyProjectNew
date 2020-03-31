/**
 * Реализовать структуру «Черный ящик» хранящую целые числа.
 * Структура должна поддерживать операции добавления числа и возвращение К-го
 * по минимальности числа и N-ного по максимал ьности элемента из ящика.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson011;

import java.util.Iterator;
import java.util.TreeSet;

public class BlackBox<Integer> {
    public static void main(String[] args) {
        BlackBox<java.lang.Integer> black = new BlackBox<>(new TreeSet<>());
        black.addNumber(22);
        black.addNumber(33);
        black.addNumber(44);
        black.addNumber(55);
        System.out.println(black.minK(2));
        System.out.println(black.maxN(2));
    }

    TreeSet<Integer> treeSet;

    BlackBox(TreeSet<Integer> treeSet) {
        this.treeSet = treeSet;
    }

    public void addNumber(Integer n) {
        this.treeSet.add(n);
    }

    public Integer minK(int k) {
        Iterator<Integer> iterator = this.treeSet.iterator();
        int count = 1;
        if (this.treeSet.size() < k) {
            throw new ArrayIndexOutOfBoundsException("Размер BlackBox меньше");
        }
        while (iterator.hasNext()) {
            Integer k_min = iterator.next();
            if (count == k) {
                return k_min;
            }
            count++;
        }
        return null;
    }

    public Integer maxN(int n) {
        Iterator<Integer> iterator = this.treeSet.iterator();
        int max = this.treeSet.size() + 1 - n;
        int count = 1;
        if (this.treeSet.size() < n) {
            throw new ArrayIndexOutOfBoundsException("Размер BlackBox меньше");
        }
        while (iterator.hasNext()) {
            Integer n_max = iterator.next();
            if (count == max) {
                return n_max;
            }
            count++;
        }
        return null;
    }
}


