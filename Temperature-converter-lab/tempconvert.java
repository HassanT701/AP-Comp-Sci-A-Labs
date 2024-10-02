import java.util.Scanner;

/**
 * Write a description of class tempconvert here.
 *
 * @author (Hassan Talha)
 * @version (11-1-22)
 */
public class tempconvert
{
   public static void main (String[] args){
       Scanner input = new Scanner(System.in); 
       
       System.out.println("   ---Temperature Conversion Menu---   ");
       System.out.println("1.Celcius to Farenheight");
       System.out.println("2.Farenheight to Celcius");
       
       System.out.print("Enter selection: ");
       Double selection = input.nextDouble();
       
       System.out.print("Enter the temperature you want to convert: ");
       Double temp = input.nextDouble();
       
       if (selection == 1)
       {
           System.out.print(""+temp+" degrees in Celcius ");
           System.out.print(celToFah(temp));
           System.out.print(" degrees in Farenheight");
       }
       if (selection == 2)
       {
           System.out.print(""+temp+" degrees in Farenheight ");
           System.out.print(fahToCel(temp));
           System.out.print(" degrees in Celcius");
       }
       
   }
   public static double celToFah (double temp){
       return ((temp*1.8)+32);
   }
   public static double fahToCel (double temp){
       return ((temp - 32)*0.5556);  
   }
}