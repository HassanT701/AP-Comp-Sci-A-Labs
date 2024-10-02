import java.util.Scanner;

/**
 * Write a description of class mainFile here.
 *
 * @author (Hassan Talha)
 * @version (1/30/23)
 */
public class mainFile
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the make of car 1: ");
        int Q = input.nextInt();
        
        System.out.print("Enter the model of car 1: ");
        int D = input.nextInt();
        
        System.out.print("Enter the year of car 1: ");
        int N = input.nextInt();
        
        System.out.print("Enter the distance(in miles) traveled for the car 1: ");
        int P = input.nextInt();
        
        Purse purse1 = new Purse(Q, N, D, P);
        purse1.setQuarter(Q);
        purse1.setDimes(D);
        purse1.setYear(year1);
        purse1.setDistance(distance1);
    }
}
