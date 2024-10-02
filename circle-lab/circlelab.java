import java.util.Scanner;
/**
 * Write a description of class circlelab here.
 *
 * @author (Hassan Talha)
 * @version (9/6/22)
 */
public class circlelab

{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius (whole number): ");
        double num = sc.nextDouble();
        double circumference = 2*Math.PI*num;
        double area = num * num*Math.PI;
        
        System.out.printf("radius - %14.3f%n",num);
        System.out.printf("circumference - %7.3f%n", circumference);
        System.out.printf("area - %16.3f%n" , area);
        
        
        
        
        
        
        
    }
}
