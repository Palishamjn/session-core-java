package day14;

public class SwitchCasePractice {
    public static void main(String[] args) {

        String today = "tuesday";

        // Java version 11

//        if(today.equals("Sunday")){
//
//        }else if(today.equals("Monday")){
//
//        }else if(today.equals("Tuesday")){
//
//        }else if(today.equals("Wednesday")){
//
//        }else if(today.equals("Thursday")){
//
//        }else if(today.equals("Friday")){
//
//        }
//        else if(today.equals("Saturday")){
//
//        }

//        switch (today.toLowerCase()){
//            case "sunday": {
//                System.out.println("Dish 1");
//                break;
//            }
//            case "monday": {
//                System.out.println("Dish 2");
//                break;
//            }
//            case "tuesday":
//            case "wednesday": {
//                System.out.println("Dish 3");
//                break;
//            }
//            case "thursday": {
//                System.out.println("Dish 5");
//                break;
//            }
//            case "friday": {
//                System.out.println("Dish 6");
//                break;
//            }
//            case "saturday": {
//                System.out.println("Dish 7");
//                break;
//            }
//            default:{
//                System.out.println("Sorry the day you have entered might not exist.");
//            }
//        }

        //Java version 18
        switch (today.toLowerCase()) {
            case "sunday" -> {
                System.out.println("Dish 1");
            }
            case "monday" -> {
                System.out.println("Dish 2");
            }
            case "tuesday", "wednesday" -> {
                System.out.println("Dish 3");
            }
            case "thursday" -> {
                System.out.println("Dish 5");
            }
            case "friday" -> {
                System.out.println("Dish 6");
            }
            case "saturday" -> {
                System.out.println("Dish 7");
            }
            default -> {
                System.out.println("Sorry the day you have entered might not exist.");
            }
        }
    }
}

