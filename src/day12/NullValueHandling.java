package day12;
import java.util.Calendar;
import java.util.Objects;
import java.util.Optional;

public class NullValueHandling {

    public static void main(String[] args) {
//        String test = null; //null
        String test = "Not null value";
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -1);

//        test.length();

//        //Solution 1
        if (test != null){

            test.length();

        }

        //Solution 2 : Assigning some default value
        String notNullTest = Objects.requireNonNullElse(test, "DEFAULT");
        System.out.println(notNullTest);

        Calendar notNullCalendar =Objects.requireNonNullElse(calendar, Calendar.getInstance());
        System.out.println(notNullCalendar.getTime());

        //Solution 3:
        Optional<String> optionalOfTest = Optional.ofNullable(test);

        if (optionalOfTest.isPresent()){
            System.out.println("The value is not null");
            String notNullOptionalTestString = optionalOfTest.get();
            System.out.println(notNullOptionalTestString);
        }else {
            System.out.println("The value is null");
        }
    }
}


