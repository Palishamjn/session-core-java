package day4;

public class SchoolApp {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("A");
        student1.setAge(12);
        student1.setRollNumber(1);
        student1.setGrade(6);
        student1.takeleave();

        Teacher teacher1 = new Teacher();
        teacher1.setName("B");
        teacher1.setAge(30);
        teacher1.setSubject("Computer");
        teacher1.takeleave();


    }

}
