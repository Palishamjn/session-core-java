package day10;
import day2.AccountType;


public class BankAccount {

    // States
    // Get but not set
    private String accountNumber ="1234597";
    // Get and Set both allowed
    private String accountHolderName; //Required
    // Get and Set both allowed
    private AccountType accountType; //Required
    // Get and Set both allowed
    private String connectedMobileNumber; //Required
    // Get and Set both allowed
    private String address; //Required
    // Get and Set both allowed
    private String bsbNumber; //Required
    // Get and Set both allowed
    private double accountBalance; //Not required
    //Set but not get
    private String socialSecurityNumber; //Required
    // Get and Set both allowed


    //Default constructor
    public BankAccount(){ }

    //Parameterized constructor

    public BankAccount(String accountNumber, String accountHolderName, AccountType accountType, String connectedMobileNumber, String address, String bsbNumber, String socialSecurityNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.connectedMobileNumber = connectedMobileNumber;
        this.address = address;
        this.bsbNumber = bsbNumber;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //Parameterized Constructor


    public BankAccount(String accountNumber, String accountHolderName, AccountType accountType, String connectedMobileNumber, String address, String bsbNumber, double accountBalance, String socialSecurityNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.connectedMobileNumber = connectedMobileNumber;
        this.address = address;
        this.bsbNumber = bsbNumber;
        this.accountBalance = accountBalance;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getConnectedMobileNumber() {
        return connectedMobileNumber;
    }

    public void setConnectedMobileNumber(String connectedMobileNumber) {
        this.connectedMobileNumber = connectedMobileNumber;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getBsbNumber() {
        return bsbNumber;
    }

    public void setBsbNumber(String bsbNumber) {
        this.bsbNumber = bsbNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Behaviour
    //- Open Account
    //- Close Account
    //- Deposit
    //- Withdraw
    //- Transfer


    public void transferBalance(BankAccount fromAccount, BankAccount toAccount, double balance){
        double fromFinalBalance = fromAccount.getAccountBalance()-balance;
        double toFinalBalance = toAccount.getAccountBalance()+balance;

        fromAccount.setAccountBalance(fromFinalBalance);
        toAccount.setAccountBalance(toFinalBalance);
    }
}
