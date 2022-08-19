package day7;

public class VastikaApp {
    public static void main(String[] args) {
//        StudentStatus studentStatus = new StudentStatus();  cannot create object
        System.out.println(StudentStatus.ENROLLED.name());
        System.out.println(StudentStatus.IN_TRAINING.name());

        System.out.println(StudentStatus.ENROLLED.ordinal());
        System.out.println(StudentStatus.IN_TRAINING.ordinal());
        System.out.println(StudentStatus.PLACED.ordinal());


    }

}
