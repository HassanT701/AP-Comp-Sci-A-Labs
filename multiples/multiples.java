import java.util.Scanner;

/**
 * Write a description of class multiples here.
 *
 * @author (Hassan)
 * @version (11/9/22)
 */
public class multiples
{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
       
       System.out.println("---Multiples---"); 
        
       System.out.println("Enter a number: ");
       int num= input.nextInt();
        
       System.out.println("Enter the number of multiples you would like to see for the number " +num+ ": ");
       int times = input.nextInt();
       int x;
       System.out.print("The first " +times+ " multiples of " +num+ " are: ");
       for( x = 1; x <= times; x ++){
       System.out.print(num * x + ", ");
       if (x== times - 1){
                x++;
                System.out.print(num * x + ".");
            }
    
    }
}
}
