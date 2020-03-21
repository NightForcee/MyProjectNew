/**
 * Создать классPair, параметризованный двумя параметрами K и V.
 * Класс должен хранить две переменные типов K и V соответственно. У
 * класса должен быть конструктор, принимающий 2 параметра типов
 * K и V, а также набор соответствующих геттеров/сеттеров.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson009;

public class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K field, V field1) {
        this.first = field;
        this.second = field1;
    }

    public K getFirst() {
        return first;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}
