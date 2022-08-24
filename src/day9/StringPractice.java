package day9;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {

        String name = "Palisha";
//        String name1 = "Palisha";
        String name1 = new String("Palisha");

        boolean isInSameMemoryLocation = name == name1; //never use == for equity test in object

        System.out.println(isInSameMemoryLocation);

        boolean isInSameMemoryLocation1 = name.equals(name1);// always use .equals method for equity check in objects

        System.out.println(isInSameMemoryLocation1);

        //Some important functions of String Class

        String sentence = "A quick brown fox jumps over the lazy dog";

        int lengthOfSentence = sentence.length();
        System.out.println(lengthOfSentence);

        char character = sentence.charAt(sentence.length()-1);
        System.out.println(character);

        String emailSaved = "palisha.maharjan91@gmail.com";
        String email = " palisha.maharjan91@gmail.com "; // space in email

        boolean isBothEmailSame = emailSaved.equals(email);

        System.out.println(isBothEmailSame);

        String sanitizedEmail = email.trim();
        boolean isBothEmailSame1 = emailSaved.equals(sanitizedEmail);
        System.out.println(isBothEmailSame1);

        String empltyString = "      ";

        String sanitizedEmptyString = empltyString.trim();

        System.out.println("Empty :" + sanitizedEmptyString.isEmpty());
//        System.out.println("Blank :" + emptyString.isBlank());//In java 8 .isBlank is unavailable

        String userNameSaved = "palisha";
        String userName = "Palisha";

        boolean isSame = userNameSaved.equalsIgnoreCase(userName);

        System.out.println(isSame);

        String userNameSavedLower = userNameSaved.toLowerCase();
        String userNameLower = userName.toLowerCase();

        boolean isSame1 = userNameSavedLower.equalsIgnoreCase(userNameLower);

        System.out.println(isSame1);

        String policyReturned = "UL100006; 06000001; AL000060";

        String firstPolicy = policyReturned.substring(0,8);
        System.out.println(firstPolicy);

        String secondPolicy = policyReturned.substring(10,18);
        System.out.println(secondPolicy);

        String thirdPolicy = policyReturned.substring(20,28);
        System.out.println(thirdPolicy);

        //Split
        String[] splittedPolicies = policyReturned.split(";");
        System.out.println(Arrays.toString(splittedPolicies));

        System.out.println(splittedPolicies[0]);
        System.out.println(splittedPolicies[1].trim());
        System.out.println(splittedPolicies[2].trim());

        //
        String ANB = "12 Months";
        String[] ageArray = ANB.split(" ");
        System.out.println(ageArray[0]);
        System.out.println(ageArray[1].trim());

        //compareTo

//        String a = "a";
////        String e = "e";
//        String e = "A";

        String a ="Palisha";
        String e = "Ram";

        int compared = a.compareTo(e); //a-e (negative value -)
//        int compared = e.compareTo(a); //e-a (positive value +)
//        int compared = e.compareTo(e); //e-e (zero value 0)
//        int compared = a.compareTo(e); //a-e (a =97,A = 65)

//        int compared = a.compareToIgnoreCase(e);
        System.out.println(compared);

        String greetings = "Hello".concat(" Palisha").concat("  How are you?").concat("What are you doing?");
        System.out.println(greetings);

        //  contains
        boolean isPalishaContained = greetings.toLowerCase().contains("palisha");
        System.out.println(isPalishaContained);

        String number = String.valueOf(2);

    }
}
