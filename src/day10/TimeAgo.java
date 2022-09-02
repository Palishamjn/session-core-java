package day10;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeAgo {

    public static void main(String[]args)
    {
        String dateStart = "11/03/14 09:29:00";
        String dateStop = "11/03/14 09:33:10";


        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

        Date d1;
        Date d2;
        try {
            d1 = format.parse(dateStart);
            d2 = format.parse(dateStop);


            long diff = d2.getTime() - d1.getTime();
            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000);

            System.out.print(diffHours +" hrs " + diffMinutes +" mins "+ diffSeconds+" secs " +"ago");

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
