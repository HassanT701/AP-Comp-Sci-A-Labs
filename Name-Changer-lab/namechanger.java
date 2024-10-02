import java.util.Scanner;

/**
 * Write a description of class namechanger here.
 *
 * @author (Hassan Talha)
 * @version (9/27/22)
 */
public class namechanger
{
   public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter your full name");
       String s = sc.nextLine();
       
       String[] broken = s.split(" ");
       System.out.print(broken[2]);
       
       System.out.print(",");
       System.out.print(s.charAt(0));
       
       
       
       
       
       
    }
}
