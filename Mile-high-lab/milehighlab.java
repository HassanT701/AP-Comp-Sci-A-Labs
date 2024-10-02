import java.util.Scanner;

/**
 * Write a description of class milehighlab here.
 *
 * @author (Hassan)
 * @version (9/12/22)
 */
public class milehighlab
{
    public static void main (String[] args){
        long gallons, inches, miles, cans, moon;
        
        
        // Number 1
        gallons = 4894000000l;
        cans = (gallons * 128)/12;
        System.out.print("The number of cans in the stack would be: "+cans+"\n");
        
        
        // Number 2
        inches = (long)(cans * 4.75);
        System.out.print("The height of the stack in inches is: "+inches+"\n");
        
        // Number 3 
        miles = inches / 12 / 5280;
        System.out.print("The height of the stack in miles is: "+miles+"\n");
        
        // Number 4 
        moon = miles / 239000;
        System.out.print("The number of times the stack would reach the moon is: "+moon+" ");
        
        
        
        
    }
}
