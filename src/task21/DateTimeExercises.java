package task21;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * 1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть класса String
 * 2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM). На выходе дата должна быть класса String
 * 3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию:
 * 4. Перевести String (пн 20.03.23 г. время: 15:07:28  ) в формат LocalDateTime по умолчанию:
 * 5. *Вывести текущую дату в формате (пример формата: понедельник 20 марта 2023 время: 11.54.06 PM). На выходе дата должна быть класса String
 */

public class DateTimeExercises {
    public static void main(String[] args) {

        // 1.
        System.out.println("********** 1 ***********");
        LocalDate date1 = LocalDate.now();
        DateTimeFormatter formatter1 = DateTimeFormatter
                .ofPattern("d MMMM yyyy");
        String result1 = date1.format(formatter1);
        System.out.println(result1);

        // 2. Вывести текущую дату и время
        System.out.println("********** 2 ***********");
        LocalDateTime dateTime2 = LocalDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter
                .ofPattern("d MMMM yyyy, hh:mm:ss a");
        String result2 = dateTime2.format(formatter2);
        System.out.println(result2);

        // 3.  "2023-03-19 : 10:12:24 AM" в LocalDateTime
        System.out.println("********** 3 ***********");
        String input3 = "2023-03-19 : 10:12:24 AM";
        DateTimeFormatter formatter3 = DateTimeFormatter
                .ofPattern("yyyy-MM-dd : hh:mm:ss a");
        LocalDateTime result3 = LocalDateTime.parse(input3, formatter3);
        System.out.println("Было: " + input3);
        System.out.println("Стало: " + result3);

        // 4.  "пн 20.03.23 г. время: 15:07:28" в LocalDateTime
        System.out.println("********** 4 ***********");
        String input4 = "пн 20.03.23 г. время: 15:07:28";
        DateTimeFormatter formatter4 = DateTimeFormatter
                .ofPattern("EEE dd.MM.yy 'г. время:' HH:mm:ss");
        LocalDateTime result4 = LocalDateTime.parse(input4, formatter4);
        System.out.println("Было: " + input4);
        System.out.println("Стало: " + result4);

        // 5.
        System.out.println("********** 5 ***********");
        LocalDateTime dateTime5 = LocalDateTime.now();
        DateTimeFormatter formatter5 = DateTimeFormatter
                .ofPattern("EEEE d MMMM yyyy 'время:' HH.mm.ss a");
        String result5 = dateTime5.format(formatter5);
        System.out.println(result5);
    }
}
