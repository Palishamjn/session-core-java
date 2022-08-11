package day2;

public class BankOfAmerica {

    public static void main(String[] args) {
        BankAccount palishaAccount = new BankAccount();
//        palishaAccount.accountNumber ="1234597";
//        palishaAccount.accountHolderName = "Palisha Maharjan";
        palishaAccount.setAccountHolderName("Palisha Maharjan");

//        palishaAccount.accountType = "saving";
        palishaAccount.setAccountType("saving");

//        palishaAccount.connectedMobileNumber = "12562469";
        palishaAccount.setConnectedMobileNumber("12562469");

//        palishaAccount.address = "Irving, Texas";
        palishaAccount.setAddress("Irving, Texas");

//        palishaAccount.bsbNumber = "001";
        palishaAccount.setBsbNumber("001");

//        palishaAccount.accountBalance = 5000.0;
        palishaAccount.setAccountBalance(5000.0);

//        palishaAccount.socialSecurityNumber = "1242051524";
        palishaAccount.setSocialSecurityNumber("1242051524");


        System.out.println(palishaAccount.getAccountNumber());
        System.out.println(palishaAccount.getAccountHolderName());
        System.out.println(palishaAccount.getAccountType());
        System.out.println(palishaAccount.getConnectedMobileNumber());
        System.out.println(palishaAccount.getAddress());
        System.out.println(palishaAccount.getBsbNumber());
        System.out.println(palishaAccount.getAccountBalance());
//        System.out.println(palishaAccount.geSocialSecurityNumber());
    }
}
