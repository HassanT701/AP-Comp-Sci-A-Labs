
/**
 * Write a description of class CheckingAccount here.
 *
 * @author (Hassan Talha)
 * @version (4/11/23)
 */
public class CheckingAccount extends Account
{
    private double bonus;
    private static final double FEE = 50.0;
   
     public CheckingAccount(String name, String AccountID, double balance, double bonus) {
        super(name, AccountID, balance);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void makeDeposit(double amount) {
        super.makeDeposit(amount);
        balance += bonus;
    }

    @Override
    public void withdraw(double amount) {
        if (balance < 500) {
            balance -= FEE;
        }
        super.withdraw(amount);
    }

    @Override
    public String toString() {
        return super.toString() + ", bonus=" + bonus;

    }
}
