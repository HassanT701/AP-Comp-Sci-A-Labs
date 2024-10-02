import java.util.Scanner;

/**
 * Write a description of class stringfun here.
 *
 * @author (Hassan Talha)
 * @version (10/3/22)
 */
public class stringfun
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Enter a string(at least 1 character)");
        String s = sc.nextLine();
        
        System.out.println(s.toUpperCase());
        
        System.out.println(s.toLowerCase());
        
        System.out.print(" Enter a Character");
        char choice = sc.next().charAt(0);
        System.out.println("first location:"+ s.indexOf(choice)); 
        System.out.println("last location:"+ s.lastIndexOf(choice));
        
        System.out.println(s.substring(s.indexOf(choice),s.lastIndexOf(choice))); 
        
        String[] broken = s.split(" "); 
        System.out.print(broken[0]+"$"); 
        System.out.print(broken[1]+"$"); 
        System.out.print(broken[2]+"$"); 
        System.out.print(broken[3]);
        
        
        
        
        
        
        
    }
}
