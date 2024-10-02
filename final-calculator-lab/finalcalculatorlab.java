import java.util.Scanner;

/**
 * Write a description of class finalcalculatorlab here.
 *
 * @author (Hassan Talha)
 * @version (9/13/22)
 */
public class finalcalculatorlab
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the grade you got for the first six weeks: ");
        double term1 = sc.nextDouble();
        
        System.out.println("Enter the grade you got for the second six weeks: ");
        double term2 = sc.nextDouble();
        
        System.out.println("Enter the grade you got for the third six weeks: ");
        double term3 = sc.nextDouble();
        
        System.out.println("Enter the average you want for the semester: ");
        double want = sc.nextDouble();
        
        double average, step1, step2, needed;
        
        //finding average
        average = (term1 + term2 + term3)/3;
        
        // wanted semester average divided by 0.15
        step1 = want / 0.15;
        
        // average times 0.85 divided by 0.15
        step2 = (average*0.85)/0.15;
        
        // step1 minus step2
        needed = step1 - step2;
        System.out.printf("You would need to get a needed - %5.2f on your final to have a "+want+" for the semester" ,needed);
        
        
    }
}
