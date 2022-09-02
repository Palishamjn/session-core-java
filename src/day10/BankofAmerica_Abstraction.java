package day10;
import day2.AccountType;


public class BankofAmerica_Abstraction {
    public static void main(String[] args) {
        BankAccount palishaAccount = new BankAccount();
//        BankAccount palishaAccount1 = new BankAccount("asd");
//        BankAccount palishaAccount2 = new BankAccount(1);

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

//        BankAccount dummyAccount = new BankAccount();
//        dummyAccount.transferBalance(palishaAccount, friendAccount, 300);

        System.out.println("========== After Transaction =========");

        System.out.println(palishaAccount.getAccountBalance());
        System.out.println(friendAccount.getAccountBalance());

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setAccountHolderName("Palisha Maharjan");
        bankAccount1.setAccountType(AccountType.SAVING);
        bankAccount1.setConnectedMobileNumber("12562469");
        bankAccount1.setAddress("Irving, Texas");
        bankAccount1.setBsbNumber("001");
        bankAccount1.setAccountBalance(200.0);
        bankAccount1.setSocialSecurityNumber("1242051524");

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.setAccountHolderName("Palisha Maharjan");
        bankAccount2.setAccountType(AccountType.SAVING);
        bankAccount2.setConnectedMobileNumber("12562469");
        bankAccount2.setAddress("Irving, Texas");
        bankAccount2.setBsbNumber("001");
        bankAccount2.setAccountBalance(200.0);
        bankAccount2.setSocialSecurityNumber("1242051524");


        boolean isInSameMemoryLocation = bankAccount1 == bankAccount2;

        System.out.println(isInSameMemoryLocation);

        boolean isInSameMemoryLocation1 = bankAccount1.equals(bankAccount2);
        System.out.println(isInSameMemoryLocation1);

        BankAccount bankAccount3 = new BankAccount("785452582", "ABC", AccountType.SAVING,"9851420222", "Irving, TX", "002", "525325632");
        BankAccount bankAccount4 = new BankAccount("78545252582", "XYZ", AccountType.CURRENT,"9851255222", "Irving, TX", "002",5000.00, "525325632");

    }
}

