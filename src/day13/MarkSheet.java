package day13;
import java.util.Scanner;

public class MarkSheet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student's Name:");
        String name = scanner.nextLine();

        System.out.println("Enter mark obtained in Maths:");
        int maths = scanner.nextInt();

        System.out.println("Enter mark obtained in Science:");
        int science = scanner.nextInt();

        System.out.println("Enter mark obtained in English:");
        int english = scanner.nextInt();

        System.out.println("Enter mark obtained in Computer:");
        int computer = scanner.nextInt();

        System.out.println("Enter mark obtained in Social:");
        int social = scanner.nextInt();

//        System.out.println(name);
//        System.out.println(maths);
//        System.out.println(science);
//        System.out.println(english);
//        System.out.println(computer);
//        System.out.println(social);

        float percentage = ((maths + science + english + computer + social)/500f)*100;

        System.out.println(percentage);

//        String output = name + "percentage = " + String.format("%.2f", percentage);
        String  outputPercentage = String.format("%s percentage = %.2f",name, percentage);

//        String message = String.format("Hi %s . This is a new offer for you.", name);

        System.out.println(outputPercentage);

        boolean isDistinction = percentage >= 80;
        boolean isFirstDivision = percentage >= 60 && percentage < 80;
        boolean isSecondDivision = percentage >= 45 && percentage <60;
        boolean isThirdDivision = percentage >=32 && percentage <45;
        boolean isfail = percentage <32;

        System.out.println("Distinction: " + isDistinction);
        System.out.println("First Division: " + isFirstDivision);
        System.out.println("Second Division: " + isSecondDivision);
        System.out.println("Third Division: " + isThirdDivision);
        System.out.println("Fail: " + isfail);

    }
}
