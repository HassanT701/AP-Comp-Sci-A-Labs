
/**
 * Write a description of class main here.
 *
 * @author (Hassan Talha)
 * @version (4/11/23)
 */
public class main
{
    public static void main(String[] args) { 
       Account  mike = new Account("Mike", "T12564", 1250);

       CheckingAccount  john = new CheckingAccount("John","T52643", 256, 20);

       Account  cecilia = new CheckingAccount("Cecilia", "T24964", 5200, 50);
    
        mike.makeDeposit(300);
        john.withdraw(400);
        cecilia.withdraw(500);
        System.out.println("Cecilia's bonus: " + ((CheckingAccount) cecilia).getBonus());
        System.out.println("Mike's balance: " + mike.getBalance());
    
    }
}