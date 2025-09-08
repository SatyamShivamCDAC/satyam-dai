package day9;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

public class DemoLocalDate{

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate diwali = LocalDate.of(2025,10,17);

        System.out.println(diwali.getDayOfMonth());
        System.out.println(diwali.getDayOfWeek());
        System.out.println(diwali.getDayOfYear());

        System.out.println(today.isBefore(diwali));

        System.out.println("_________________________________________________________________");
        LocalDate tomorrow = today.plusDays(1);

        LocalDate future = today.plus(2,ChronoUnit.DECADES);
        System.out.println(future);

        System.out.println("_________________________________________________________________");
        Period timeforDiwali =today.until(diwali);
        System.out.format("year : %d, month : %d, day :%d\n",timeforDiwali.getYears(),timeforDiwali.getMonths(),timeforDiwali.getDays());

        System.out.println("_________________________________________________________________");
        Stream<LocalDate> dateStream = LocalDate.now().datesUntil(LocalDate.of(2026,1,1));
        dateStream.filter(d->d.getDayOfWeek().equals(DayOfWeek.MONDAY)).forEach(System.out::println);

    }
}
