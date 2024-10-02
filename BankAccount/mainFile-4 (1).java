
/**
 * Write a description of class mainFile here.
 *
 * @author (Hassan Talha)
 * @version (3/20/23)
 */
public class mainFile
{
     public static void main(String[] args) {
        Account account1 = new Account();
        account1.setName("LeBron James");
        account1.setAccountID("123456");
        account1.setBalance(500.0);

        Account account2 = new Account("Steph Curry", "654321", 1000.0);

        account1.makeDeposit(100.0);
        account1.withdraw(200.0);

        account2.makeDeposit(500.0);
        account2.withdraw(1500.0);

        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
