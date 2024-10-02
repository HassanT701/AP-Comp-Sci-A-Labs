import java.util.Scanner;
/**
 * Write a description of class leaveout here.
 *
 * @author (Hassan)
 * @version (8/3/22)
 */
public class leaveout
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Enter a string(at least 1 character)");
        String s = sc.nextLine();
        
        System.out.print(" Enter an Integer");
        int choice = sc.nextInt();
        
        System.out.println(s.substring(0,choice-1)); 
        System.out.print(s.substring(choice+1,15));

        
        
        
        
        
        
        
    }
}
