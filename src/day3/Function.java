package day3;

public class Function {

    public static void main(String[] args) {

        int a = 2;
        int b = 15;
//        add(a,b);
        int add1 = addAndReturn(a,b);
        System.out.println(add1);

        int c = 5;
        int d = 95;
//        add(c,d);
        int add2 = addAndReturn(c,d);
        System.out.println(add2);

        int e = 15;
        int f = 20;
//        add(e,f);
        int add3 = addAndReturn(e,f);
        System.out.println(add3);
    }

    public static int addAndReturn(int a, int b){
        int add1 = a+b;
        return add1;
    }

    public static void add(int a, int b){
        int add1 = a + b;
        System.out.println(add1);
    }

   /*

    <access-modifier> <return-type> <function-name>(data_type1 variable_name1,data_type2 variable_name2,....)
    {
       //code
    }

    */
}


