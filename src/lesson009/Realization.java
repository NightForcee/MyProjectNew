/**
 * Реализовать класс вычислитель для вещественных и
 * целых типов данных, используя
 * параметризацию классов.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson009;

public class Realization<T> {
    public T add(T a, T b) {
        if (a.getClass().equals(Integer.class)) {
            return (T) (Object) ((Integer) a + (Integer) b);
        }
        if (a.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) a + (Double) b);
        }
        return (T) (Object) 0;
    }

    public static void main(String[] args) {
        Realization<Integer> my1 = new Realization<>();
        Realization<Double> my2 = new Realization<>();
        System.out.println("Integer : " + my1.add(5, 19));
        System.out.println("Double : " + my2.add(5.1, 13.9));
    }
}
