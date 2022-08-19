package day7;

public class ImplicitTypeCasting {
    public static void main(String[] args) {

        byte b = 100; //no explicit type casting required
        short s =b; //no explicit type casting required
        int i = s; //no explicit type casting required
        long l = i; //no explicit type casting required
        float f = l; //no explicit type casting required
        double d = f; //no explicit type casting required

        System.out.println("Byte value is: "+b);
        System.out.println("Short value is: "+s);
        System.out.println("Int value is: "+i);
        System.out.println("Long value is: "+l);
        System.out.println("Float value is: "+f);
        System.out.println("Double value is: "+d);

        char ch1 = 'A';
        double d1 = ch1;
        System.out.println(d1); // prints 65.0
        System.out.println(ch1 * ch1); //prints 4225, 65*65

        float add = (i + f);

        String st = "Hello";
        String concat = st + 65.0;
        System.out.println(concat);


    }

}
