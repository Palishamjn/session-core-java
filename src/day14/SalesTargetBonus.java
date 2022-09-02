package day14;

import java.util.Scanner;

public class SalesTargetBonus {

    private static final int TARGET = 1000;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your today's sales: ");
        int sales = scanner.nextInt();

        int bonus = 0;

        if (sales >= 2*TARGET){
            bonus += 1000;
        }

        else if (sales >= 1.5*TARGET){
            bonus += 500;
        }

        else if (sales >= TARGET){
            bonus += 100;
        }

        else {
            bonus += 0;
            System.out.println("You're fired");
        }

        String message = String.format("You have earned bonus = %d", bonus);

        System.out.println(message);
    }
}

