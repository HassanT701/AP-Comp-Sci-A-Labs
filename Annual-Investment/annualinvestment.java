import java.util.Scanner;

/**
 * Write a description of class annualinvestment here.
 *
 * @author (Hassan Talha)
 * @version (11-2-22)
 */
public class annualinvestment
{
   public static void main (String[] args){
       Scanner input = new Scanner(System.in); 
       double totalInAccount;
       
       System.out.println("   ---Investment Program---   ");
       
       System.out.println("Enter investment amount: ");
       double investmentAmount = input.nextDouble();
       
       System.out.println("Enter annual interest rate percentage: ");
       double annualInterestRate = input.nextDouble();
       
       System.out.print("Enter the number of years on investment: ");
       int yearsOnInvest = input.nextInt();
       
       System.out.print("Investing $" +investmentAmount+ " over " +yearsOnInvest+ " years at an interest rate of " +annualInterestRate+ " would earn $"); 
       System.out.print(totalInAccount(investmentAmount,annualInterestRate, yearsOnInvest));
       System.out.print(" giving you a total of $");
       double Total = investmentAmount + (totalInAccount(investmentAmount,annualInterestRate, yearsOnInvest));
       System.out.print(""+Total+"");
   }
   public static double totalInAccount(double investmentAmount, double annualInterestRate, int yearsOnInvest){
       return (investmentAmount*(Math.pow((1 + (annualInterestRate/1200)), (yearsOnInvest*12)))) - investmentAmount ;
       
   }
}
