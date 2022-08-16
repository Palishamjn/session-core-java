package day4;

public class SchoolApp {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("A");
        student1.setAge(12);
        student1.setRollNumber(1);
        student1.setGrade(6);
        student1.takeleave();
        student1.setSelected(true);

        Teacher teacher1 = new Teacher();
        teacher1.setName("B");
        teacher1.setAge(30);
        teacher1.setSubject("Computer");
        teacher1.takeleave();

        //default value
        //int = 0
        //long = 0
        //short = 0
        //byte = 0
        //double = 0.0
        //float = 0.0
        //boolean = false
        //char = ''

        //String = null

//        System.out.println(student1.getName());
//        System.out.println(student1.isSelected());

        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getRollNumber());
        System.out.println(student1.getGrade());
        System.out.println(student1.isSelected());

        System.out.println(teacher1.getName());
        System.out.println(teacher1.getAge());
        System.out.println(teacher1.getSubject());




    }

}
