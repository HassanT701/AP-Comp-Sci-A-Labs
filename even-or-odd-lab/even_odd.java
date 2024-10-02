import java.util.Scanner;

/**
 * Write a description of class even_odd here.
 *
 * @author (Hassan Talha)
 * @version (10/27/22)
 */
public class even_odd
{
   public static void main (String[] args){
     Scanner input = new Scanner(System.in);
       
    System.out.print("Enter an Integer number: ");
    int num = input.nextInt();

    
    if ( num % 2 == 0 )
      System.out.println(+num+" is an even number.");
    else
      System.out.println(+num+" is an odd number.");
  }
}

