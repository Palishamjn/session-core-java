package day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PredefinedClass {

    public static void main(String[] args) {

//        Math math = new Math();
        long roundedValue = Math.round(5.40);
        System.out.println(roundedValue);

        double ceiledValue = Math.ceil(5.40f);
        System.out.println(ceiledValue);

        double flooredValue = Math.floor(5.999);
        System.out.println(flooredValue);

        double randomValue = Math.round(Math.random() * 100);
        System.out.println(randomValue);

        int maximum = Math.max(5, 5000);
        System.out.println(maximum);

        int minimum = Math.min(5000, 50);
        System.out.println(minimum);

//        Date

        Date currentDate = new Date();
        System.out.println(currentDate);

        Date specificDate = new Date(1661523318193L);
        System.out.println(specificDate);

//        Calendar

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.set(Calendar.YEAR, 1991);
        birthCalendar.set(Calendar.MONTH, 7);
        birthCalendar.set(Calendar.DAY_OF_MONTH, 04);
        System.out.println(birthCalendar);

        System.out.println(birthCalendar.getTime());

        Calendar dueDate = Calendar.getInstance();
        dueDate.set(Calendar.YEAR, 2022);
        dueDate.set(calendar.MONTH, 6);
        dueDate.set(calendar.DAY_OF_MONTH, 1);
        System.out.println(dueDate.getTime());

        dueDate.add(Calendar.MONTH, 1);
        System.out.println(dueDate.getTime());
        System.out.println(dueDate.get(calendar.YEAR));
        System.out.println(dueDate.get(calendar.MONTH));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd EEEE HH:mm:ss");
        String formattedDate = simpleDateFormat.format(dueDate.getTime());
        System.out.println(formattedDate);


    }
}
