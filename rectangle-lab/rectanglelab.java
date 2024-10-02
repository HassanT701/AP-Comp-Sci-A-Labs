import java.util.Scanner;

/**
 * Write a description of class rectanglelab here.
 *
 * @author (Hassan Talha)
 * @version (9/1/22)
 */
public class rectanglelab
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length (whole number): ");
        int length = sc.nextInt();
        System.out.print("Enter the Width (whole number): ");
        int width = sc.nextInt();
        int perimeter = (length + width) * 2;
        int area = width * length;
        
        
        System.out.printf("length - %10%n" ,length);
        System.out.printf("width - %11d%n" ,width);
        System.out.printf("Perimeter - %7d%n" ,perimeter);
        System.out.printf("Area - %12d%n" ,area);
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
