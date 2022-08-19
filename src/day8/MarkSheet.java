package day8;

public class MarkSheet {
    public static void main(String[] args) {

        String name = "Palisha Maharjan";
        int studentClass = 8;

        float maths = 85;
        float science = 85;
        float english = 80;
        float computer = 85;
        float social = 89;

        float percentage = ((maths + science + english + computer + social)/500)*100;

        System.out.println(percentage);

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
