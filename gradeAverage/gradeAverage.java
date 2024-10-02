import java.util.Scanner;

/**
 * Write a description of class gradeAverage here.
 *
 * @author (Hassan Talha)
 * @version (2-6-23)
 */
public class gradeAverage
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of Grades: ");
        int numGrades = sc.nextInt();
        double[] grades = new double[numGrades];
        
        gatherGrades(grades, sc);
        System.out.println("The average for all your grades is: " + average(grades));
        System.out.println("The letter grade is: " );
        System.out.print(gradeLetter(average(grades)));
    }
    public static void gatherGrades(double[] grades, Scanner sc){
        for (int i = 0; i < grades.length; i++){
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }
    }
    public static double average(double[] grades){
        double sum = 0;
        for(double grade : grades){
            sum += grade;
        }
        return sum / grades.length;
    }
    public static char gradeLetter(double average){
        if(average >= 90){
            return 'A';
        }
        else if(average >= 80){
            return 'B';
        }
        else if(average >= 70){
            return 'C';
        }
        else if(average >= 60){
            return 'D';
        }
        else{
            return 'F';
        }
    }
}
