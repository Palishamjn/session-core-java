package day2;
/**
 * This application is used to create bank account
 *
 * @author Palisha Maharjan
 * @version 1.0.0
 */

public class BankAccount {
    //  States
    // Get but not set
    private String accountNumber = "1234597";
    // Get and Set both allowed
    private String accountHolderName;
    // Get and Set both allowed
    private AccountType accountType;
    // Get and Set both allowed
    private String connectedMobileNumber;
    // Get and Set both allowed
    private String address;
    // Get and Set both allowed
    private String bsbNumber;
    // Get and Set both allowed
    private double accountBalance;
    //Set but not get
    private String socialSecurityNumber;
    // Get and Set both allowed


    /**
     * This function returns account number and account number always needs to be unique
     * @return account number of account holders
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * This function returns account holder name
     * @return account holders name
     */

    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * This method is used for setting account holders name
     * @param accountHolderName this is the name of an account holder
     */
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    /**
     * This function returns the type of account
     * @return types of account
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * This function is used to set an account type
     * @param accountType types of account
     */
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * This function returns the mobile number of connected bank account
     * @return mobile number of an account
     */
    public String getConnectedMobileNumber() {
        return connectedMobileNumber;
    }

    /**
     * This function is used to set the mobile number for an account
     * @param connectedMobileNumber mobile number of an account
     */
    public void setConnectedMobileNumber(String connectedMobileNumber) {
        this.connectedMobileNumber = connectedMobileNumber;
    }

    /**
     * This function returns the address of an account holder
     * @return address of account holder
     */
    public String getAddress() {
        return address;
    }

    /**
     * This function is used to set an address of an account holder
     * @param address address of an account holder
     */
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

    /**
     * This method is used for setting social security number of an account holder
     * @param socialSecurityNumber this is the social security of an account holder
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * This function transfer balance from fromAccount to toAccount
     * @param fromAccount account where amount is withdraw to transfer
     * @param toAccount account where amount is deposited by transfer
     * @param balance amount to be transferred
     */
    public void transferBalance(BankAccount fromAccount, BankAccount toAccount, double balance) {
        double fromFinalBalance = fromAccount.getAccountBalance() - balance;
        double toFinalBalance = toAccount.getAccountBalance() + balance;

        fromAccount.setAccountBalance(fromFinalBalance);
        toAccount.setAccountBalance(toFinalBalance);


        // Behaviour
        //- Open Account
        //- Close Account
        //- Deposit
        //- Withdraw
        //- Transfer

    }
}
