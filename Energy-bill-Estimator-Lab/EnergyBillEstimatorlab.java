import java.util.Scanner;
/**
 * Write a description of class EnergyBillEstimatorlab here.
 *
 * @author (Hassan Talha)
 * @version (09/08/22)
 */
public class EnergyBillEstimatorlab
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your cost per kilowatt hour (whole number): ");
        double num = sc.nextDouble();
        System.out.println("Enter the number of kilowatt hours per month (whole number): ");
        double num2 = sc.nextDouble();
        double kpm = num * 13;
        double kpy = num2 * 1.5;
        System.out.print("\n\n");
        System.out.print("Projected Electricity Bill:\n\n");
        
        System.out.printf("Monthly cost - $%5.2f%n" ,kpm);
        System.out.printf("Annual Cost - $%10.2f%n" ,kpy);
        
    }
}
