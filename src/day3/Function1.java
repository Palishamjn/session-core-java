package day3;

public class Function1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 25;
        int c = 25;
//        add(a, b, c);
        int add1 = addAndReturn(a,b,c);
        System.out.println(add1);

        int d = 100;
        int e = 200;
        int f = 300;
//        add(d, e, f);
        int add2 = addAndReturn(d,e,f);
        System.out.println(add2);

        int g = 22;
        int h = 68;
        int i = 74;
//        add(g, h, i);
        int add3 = addAndReturn(g,h,i);
        System.out.println(add3);
    }


    public static int addAndReturn(int a, int b, int c){
        int add1 = a+b+c;
        return add1;
    }


    public static void add(int a, int b, int c){
        int add1 = a+b+c;
        System.out.println(add1);
    }


}
