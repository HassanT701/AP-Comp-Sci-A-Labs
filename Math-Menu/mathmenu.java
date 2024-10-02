import java.util.Scanner;

/**
 * Write a description of class mathmenu here.
 *
 * @author (Hassan Talha)
 * @version (11-11-22)
 */
public class mathmenu
{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
       
       System.out.println("---Math Menu Program---\n");
    }
    public static void printMenu (){
       Scanner input = new Scanner(System.in);
        
       System.out.println("Menu\n");
       System.out.println("1. Power");
       System.out.println("2. Square");
       System.out.println("3. Square Root");
       System.out.println("4. Exit");
       
       System.out.println("Enter Selection: ");
       double select = input.nextDouble();


    }
}