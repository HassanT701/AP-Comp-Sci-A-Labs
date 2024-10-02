import java.util.Scanner;

/**
 * Write a description of class distance here.
 *
 * @author (Hassan Talha)
 * @version (10/18/22)
 */
public class distance
{
    public static void main (String[] args){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("---Distance Program---");
     
     System.out.print("Enter the x of the first point");
     Double x1 = sc.nextDouble();
     
     System.out.print("Enter the y of the first point");
     Double y1 = sc.nextDouble();
        
     System.out.print("Enter the x of the second point");
     Double x2 = sc.nextDouble();
     
     System.out.print("Enter the y of the second point");
     Double y2 = sc.nextDouble();
     
     System.out.print(distance(x1,x2,y1,y2));
    }
    public static double distance (double x1, double y1, double x2, double y2){
        return Math.sqrt((Math.pow(x2-x1,x2-x1))+ (Math.pow(y2-y1,y2-y1)));
        
    }  
}
