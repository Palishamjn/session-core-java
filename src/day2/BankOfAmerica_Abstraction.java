package day2;
/**
 * This application is used by Bank of America
 *
 * @author Palisha Maharjan
 * @version 1.0.0
 */
public class BankOfAmerica_Abstraction {
    public static void main(String[] args) {
        BankAccount palishaAccount = new BankAccount();
        palishaAccount.setAccountHolderName("Palisha Maharjan");
        palishaAccount.setAccountType(AccountType.SAVING);
        palishaAccount.setConnectedMobileNumber("12562469");
        palishaAccount.setAddress("Irving, Texas");
        palishaAccount.setBsbNumber("001");
        palishaAccount.setAccountBalance(500.0);
        palishaAccount.setSocialSecurityNumber("1242051524");

        BankAccount friendAccount = new BankAccount();
        friendAccount.setAccountHolderName("Palisha Maharjan");
        friendAccount.setAccountType(AccountType.SAVING);
        friendAccount.setConnectedMobileNumber("12562469");
        friendAccount.setAddress("Irving, Texas");
        friendAccount.setBsbNumber("001");
        friendAccount.setAccountBalance(200.0);
        friendAccount.setSocialSecurityNumber("1242051524");

        System.out.println("========= Before Transaction =======");
        System.out.println(palishaAccount.getAccountBalance());
        System.out.println(friendAccount.getAccountBalance());

        //Transfer 300 from palisha account to friend account

//        double palishaFinalBalance = palishaAccount.getAccountBalance() - 300;
//        double friendFinalBalancce = friendAccount.getAccountBalance() + 300;
//
//        palishaAccount.setAccountBalance(palishaFinalBalance);
//        friendAccount.setAccountBalance(friendFinalBalance);

        BankAccount dummyAccount = new BankAccount();
        dummyAccount.transferBalance(palishaAccount, friendAccount, 300);

        System.out.println("========== After Transaction =========");

        System.out.println(palishaAccount.getAccountBalance());
        System.out.println(friendAccount.getAccountBalance());


    }



}
