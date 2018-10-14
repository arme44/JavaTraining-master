package training.core.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class yodaTime {

    public static void main(String[] args) throws ParseException {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2011,3,18);
        LocalDate ld3 = LocalDate.parse("2016-09-30");

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);

        ld1 = ld1.plusDays(6);
        ld2 = ld2.minus(5, ChronoUnit.MONTHS);

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3.isLeapYear());
        System.out.println(ld1.getDayOfWeek());
        System.out.println(ld2.getDayOfWeek());
        System.out.println(ld3.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CHINA));

        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(16, 28, 50);
        LocalTime lt3 = LocalTime.parse("22:20:30");

        System.out.println("It's T/F " +lt2.isBefore(lt3) + " " + lt2 + " is before " + lt3);


        int years = Period.between(ld3, ld1).getYears();
        System.out.println(years);


        System.out.println(
                String.format("Y: %d, M: %d, D: %d",
                        Period.between(ld1, ld3).getYears(),
                        Period.between(ld1, ld3).getMonths(),
                        Period.between(ld1, ld3).getDays()
                ));



        System.out.println(
                String.format("s: %d, N: %d",
                        Duration.between(lt1, lt3).getSeconds(),
                        Duration.between(lt1, lt3).getNano()
                ));


        ZoneId.getAvailableZoneIds()
                .forEach(System.out::println);

        String dateInput = "2018-09-16 14:50:00";


        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(dateInput);
        TimeZone tz = TimeZone.getDefault();

        System.out.println("Time zone: " + tz.getID() + tz.getDisplayName());

        System.out.println("Date time: " + sdf.format(date));

        // destination time

        LocalDateTime lStart = LocalDateTime.of(2018,9,16,15,14,00);
        ZonedDateTime localZ =lStart.atZone(ZoneId.of("Europe/Warsaw"));
        ZonedDateTime lEnd = localZ.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println(localZ);
        System.out.println(lEnd);





    }
}
