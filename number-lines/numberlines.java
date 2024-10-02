import java.util.Scanner;

/**
 * Write a description of class numberlines here.
 *
 * @author (Hassan Talha)
 * @version (12-6-22)
 */
public class numberlines
{
    public static void main (String[] args){
       Scanner input = new Scanner(System.in);
       
       int end;
       do{
       System.out.println("---Number Lines---");
       System.out.println("How many numbers lines do you want to see (1 or greater)? ");
       end = input.nextInt();
       }while (end < 1);
              printNumberRange(end);
   }
   public static void printNumberRange (int end){
       for(int i = 1; i<=end; i++){
           for(int j = 1; j <= i; j++)
           System.out.print(j + " ");
       System.out.println();
    }
        
        
    }
}