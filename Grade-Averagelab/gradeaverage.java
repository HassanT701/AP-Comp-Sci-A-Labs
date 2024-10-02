import java.util.Scanner;

/**
 * Write a description of class gradeaverage here.
 *
 * @author (hassan Talha)
 * @version (10-28-22)
 */
public class gradeaverage
{
     public static void main (String[] args){
       Scanner input = new Scanner(System.in);
     
       System.out.print("Enter grade one: ");
       Double g1 = input.nextDouble();
       
       System.out.print("Enter grade two: ");
       Double g2 = input.nextDouble();
       
       System.out.print("Enter grade three: ");
       Double g3 = input.nextDouble();
       
       System.out.print("Enter grade four: ");
       Double g4 = input.nextDouble();
       
       System.out.print(average(g1, g2, g3, g4));
       
    }
    public static double average (double g1, double g2, double g3, double g4){
       return (g1 + g2 + g3 + g4)/4;    
    
    }
    public static char gradeLetter (double average, double g1, double g2, double g3, double g4){
       return if (average >= 90   <= 100)
              {
              print("A");
              }
              elif (average >=80 and average <= 89)
              {
              print("B");
              }
              elif (average >=70 and average <= 79)
              {
              print("C");
              }
              elif (average >=60 and average <= 69)
              {
              print("D");
              }
              else:
              {
              print("F");
              }
}