import java.util.Scanner;

/**
 * Write a description of class mainFile here.
 *
 * @author (Hassan Talha)
 * @version (1/16/23)
 */
public class mainFile
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---Car Comparison Program---");
        
        System.out.print("Enter the make of car 1: ");
        String make1 = input.nextLine();
        
        System.out.print("Enter the model of car 1: ");
        String model1 = input.nextLine();
        
        System.out.print("Enter the year of car 1: ");
        int year1 = input.nextInt();
        
        System.out.print("Enter the distance(in miles) traveled for the car 1: ");
        double distance1 = input.nextDouble();
        
        System.out.print("Enter the hours traveled for the car 1: ");
        int hours1 = input.nextInt();
        
        System.out.print("Enter the minutes traveled for the car 1: ");
        int minutes1 = input.nextInt();
        
        cars car1 = new cars(make1, model1, year1, distance1, hours1, minutes1);
        car1.setMake(make1);
        car1.setModel(model1);
        car1.setYear(year1);
        car1.setDistance(distance1);
        car1.setHours(hours1);
        car1.setMinutes(minutes1);
    
        System.out.print("Enter the make of car 2: ");
        String make2 = input.nextLine();
        
        System.out.print("Enter the model of car 2: ");
        String model2 = input.nextLine();
        
        System.out.print("Enter the year of car 2: ");
        int year2 = input.nextInt(); 
        
        System.out.print("Enter the distance(in miles) traveled for the car 2: ");
        double distance2 = input.nextDouble();
        
        System.out.print("Enter the hours traveled for the car 2: ");
        int hours2 = input.nextInt();
        
        System.out.print("Enter the minutes traveled for the car 2: ");
        int minutes2 = input.nextInt();
         
        cars car2 = new cars(make2, model2, year2, distance2, hours2, minutes2);
        car2.setMake(make2);
        car2.setModel(model2);
        car2.setYear(year2);
        car2.setDistance(distance2);
        car2.setHours(hours2);
        car2.setMinutes(minutes2);
        
        System.out.println(car1);
        System.out.println(car2);
    }
}