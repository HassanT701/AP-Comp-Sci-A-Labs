import java.util.Scanner;

/**
 * Write a description of class studentid here.
 *
 * @author (Hassan Talha)
 * @version (10/7/22)
 */
public class studentid
{
   public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.print(" Enter your first name");
        String f = sc.nextLine();
        
        System.out.print(" Enter your last name");
        String l = sc.nextLine();
        
        System.out.print(" Enter your grade level");
        int g = sc.nextInt();
        
        System.out.print(" Enter your ID number");
        int id = sc.nextInt();
        
       System.out.println("\n the text for your student id is: ");
       System.out.println(getIDText(f, l, g, id));
    }
   public static String getIDTest(String firstName, String lastName, int gl, int id){
       return  "\nName: " +lastName+ "," +firstName+ "\nGrade: " +gl + "\nid" +id+
        
    }
}
