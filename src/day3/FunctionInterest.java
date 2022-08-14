package day3;

public class FunctionInterest {
    public static void main(String[] args) {
        float P = 5000;
        int T = 2;
        float R = 5.2f;
        float interest = interestAndReturn(P,T, R);
        System.out.println(interest);
    }
    public static float interestAndReturn(float P, int T, float R){
        float interest = (P *T *R)/100;
        return interest;
    }

}
