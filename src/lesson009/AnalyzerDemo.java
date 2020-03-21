/**
 * Реализовать аннотацию Transaction и анализатор
 * данной транзакции. Смысл данной аннотации заключается в том, что
 * если метод помечен данной аннотацией, значит он вызывается в рамках
 * транзакции. В рамках транзакции - когда выводится на консоль два
 * сообщения: “Transaction is started”; “Transaction is ended”.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson009;

public class AnalyzerDemo {
    public static void main(String[] args) {
        ClassAnalyzer.analyzeClass(AnalyzerDemo.class);
    }

    public void swim() {
        System.out.println("Swimming");
    }

    @Transactional
    public static void transaction() {
        System.out.println("Transaction!!!");
    }
}