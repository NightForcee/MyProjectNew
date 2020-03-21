/**
 * Создатьстатический обобщённый метод swap в final классе PairUtil.
 * Метод должен принимать объект класса Pair и возвращать пару,
 * в которой элементы поменяны местами.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson009;

public final class PairUtil {
    static <T> void swap(Pair p) {
        Object temp = p.getSecond();
        p.setSecond(p.getFirst());
        p.setFirst(temp);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(5, "Java");
        swap(pair);
        swap(pair);
    }
}
