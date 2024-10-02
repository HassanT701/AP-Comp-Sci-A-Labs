import java.util.Scanner;

/**
 * Write a description of class mainFile here.
 *
 * @author (Hassan Talha)
 * @version (2/9/23)
 */
public class mainFile
{
   static Purse2[] list = new Purse2[6];
   static Scanner sc = new Scanner(System.in);
   
    public static void main(String args[]){
       gather(list, sc);
       
       list[5] = new Purse2(5,5,5,5);
       list[6] = new Purse2(6,6,6,6);
       
   }
   public static void gather(Purse2[] list, Scanner sc){
       for(int i = 0; i < 4; i++){
           System.out.println("Enter the number of quarters for Purse " + (i+1) + ":");
           int q = sc.nextInt();
           System.out.println("Enter the number of dimes for Purse " + (i+1) + ":");
           int d = sc.nextInt();
           System.out.println("Enter the number of nickels for Purse " + (i+1) + ":");
           int n = sc.nextInt();
           System.out.println("Enter the number of pennies for Purse " + (i+1) + ":");
           int p = sc.nextInt();
           
           list[i] = new Purse2(q, d, n, p);
       }
       
   }
   public static double largestTotal(Purse2[] list){
       for(int a = 0; a 
   }
}
