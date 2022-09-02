package day11;

public class OfficeApp {
    public static void main(String[] args) {

        Employee ram = new Employee(1,"Ram", "Texa, US");
        Employee hari = new Employee(2, "hari", "Texas, US");

        System.out.println(ram.getId());
        System.out.println(hari.getId());
    }
}

