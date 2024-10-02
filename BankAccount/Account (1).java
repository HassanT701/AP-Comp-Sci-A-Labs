
/**
 * Write a description of class Account here.
 *
 * @author (Hassan Talha)
 * @version (3/20/23)
 */
public class Account
{
    private String name;
    private String accountID;
    private double balance;

    public Account() {
        name = "";
        accountID = "";
        balance = 0.0;
    }
    public Account(String name, String accountID, double balance) {
        this.name = name;
        this.accountID = accountID;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public String getAccountID() {
        return accountID;
    }
    public double getBalance() {
        return balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void makeDeposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }
    public String toString() {
        return "Name: " + name + "\nAccount ID: " + accountID + "\nBalance: $" + balance;
    }
}

