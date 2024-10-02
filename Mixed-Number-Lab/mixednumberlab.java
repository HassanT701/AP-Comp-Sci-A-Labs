import java.util.Scanner;
/**
 * Write a description of class mixednumberlab here.
 *
 * @author (Hassan Talha)
 * @version (9/12/22)
 */
public class mixednumberlab
{
        public static void main (String[] args){    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator of the fraction: ");
        int num = sc.nextInt();
        System.out.println("Enter the denominator of the fraction: ");
        int num2 = sc.nextInt();
        int ans , ans2;
        ans = num / num2;
        ans2= num % num2;
        System.out.println("The answer is,"+ ans +" "+ans2+"/"+num2+"");
        
        
        
        
        
        
        
     }
}