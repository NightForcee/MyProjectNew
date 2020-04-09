/**
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson030;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

import static java.time.temporal.ChronoUnit.DAYS;

public class LocalTimeDemo {
    public static void main(String[] args) {
        /**1.Создать объект класса LocalDate, представляющий собой дату 25.06.2020.
         * Вывести полученную дату в консоль */
        LocalDate localDate = LocalDate.of(2020, 6, 25);
        System.out.println(localDate);

        /**2.Создать объект LocalDate, представляющий собой сегодняшнюю дату.
         * Используя этот объект, создать другой объект LocalTime,
         * представляющий собой дату через 3 месяца после
         * сегодняшней.
         * Вывести эту дату в консоль.
         */

        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);
        LocalDate localDate2 = localDate1.plusMonths(3);
        System.out.println(localDate2);

        /**3.Создать объект LocalDate, представляющий собой сегодняшнюю дату.
         * Преобразовать дату в строку вида "05.05.2017".
         * Вывести ту строку в консоль
         */

        String date = localDate1.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(new Locale("ru"));
        String localeDate = localDate1.format(dateTimeFormatter);
        System.out.println(date);
        System.out.println(localeDate);

        /**4.Дана строка вида "26-03-2014". Получить объект LocalDate, представляющий собой дату, полученную из этой строки.
         */

        String stroka = "26-03-2014";
        LocalDate localDate4 = LocalDate.parse(stroka, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String date1 = localDate4.format(dateTimeFormatter);
        System.out.println(date1);

        /**5.Создать объект LocalDate, представляющий собой сегодняшнююдату.
         *  * Создать объект LocalDate, представляющий собой дату 25.06.2020.
         *  * Используя созданные объекты, найти количество дней между этими двумя датами.
         */

        long days = DAYS.between(localDate1, localDate);
        System.out.println("days :" + days);

        /**6.Даны два объекта LocalDate из предыдущего задания.
         * Подсчитать количество секунд между полуночью первой даты иполуночью второй даты.
         */

        long seconds = ChronoUnit.SECONDS.between(localDate1.atStartOfDay(), localDate.atStartOfDay());
        System.out.println("seconds : " + seconds);
        long seconds2 = days * 24 * 3600;
        System.out.println("days*24*3600 : " + seconds2);

        /**7.Написать свою реализацию интерфейса TemporalAdjuster,которая бы прибавляла к дате 42 дня
         */

        LocalDate localDate3 = LocalDate.now();
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Date with no add 42 days : " + dateTimeFormatter2.format(localDate3));
        LocalDate localDate5 = localDate3.now().with(new DateAdd42Days());
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("for 42 days :" + dateTimeFormatter1.format(localDate5));

        /**8*
         * Написать свою реализацию интерфейса TemporalAdjuster,
         * которая бы изменяла дату на ближайшее (в днях) 1 января.
         */

        LocalDate nearForJanuary = LocalDate.now().with(new NearFirstJanuary());
        System.out.println(LocalDate.now());
        System.out.println("Near 1 January : " + nearForJanuary);
    }

    public static class DateAdd42Days implements TemporalAdjuster {
        @Override
        public Temporal adjustInto(Temporal temporal) {
            return temporal.plus(42, DAYS);
        }
    }

    public static class NearFirstJanuary implements TemporalAdjuster {
        @Override
        public Temporal adjustInto(Temporal temporal) {
            Temporal nextData = temporal.with(TemporalAdjusters.firstDayOfNextYear());
            Temporal previousData = temporal.with(TemporalAdjusters.firstDayOfYear());
            long dayNext = DAYS.between(temporal, nextData);
            long dayPrevious = DAYS.between(previousData, temporal);
            if (dayNext <= dayPrevious) {
                return nextData;
            } else {
                return previousData;
            }
        }
    }
}
