package training.core.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class dateTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long millis = System.currentTimeMillis();
        date = new Date(millis);
        System.out.println(date);
        long yesterday = millis - (1_000L * 60 * 60 * 24);
        System.out.println(new Date(yesterday));
        long nextMonth = millis + (1_000L * 60 * 60 * 24 * 30);
        System.out.println(new Date(nextMonth));

        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss, E, w");
        System.out.println(format.format(new Date(nextMonth)));

        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTime());

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        calendar.set(year, month+1,day);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, 4);
        calendar.add(Calendar.HOUR, 3);
        System.out.println(calendar.getTime());

        System.out.println(year + " is leap: " + calendar.isLeapYear(year));

        System.out.println(calendar.getTimeZone());

        for (int i = 1; i<30; i++) {
            System.out.println(year + i + " is leap: " + calendar.isLeapYear(year+i));
        }





    }
}
