package day14;

public class MarkSheet {
    public static void main(String[] args) {

        String name = "Palisha Maharjan";
        int studentClass = 8;

        float maths = 8;
        float science = 8;
        float english = 25;
        float computer = 19;
        float social = 14;

        float percentage = ((maths + science + english + computer + social)/500)*100;

        System.out.println(percentage);


        if(percentage >= 80){
            System.out.println("Congratulations you have passed with distinction");
        }

        else if (percentage >= 60 && percentage < 80){
            System.out.println("Congratulations you have passed with first division");
        }

        else if (percentage >= 45 && percentage <60){
            System.out.println("Congratulations you have passed with second division");
        }

        else if (percentage >=32 && percentage <45){
            System.out.println("Congratulations you have passed with third division");
        }

//        else if (percentage <32){
//            System.out.println("Sorry you are failed");
//        }

        else {
            System.out.println("Sorry you are failed");
        }
    }
}

