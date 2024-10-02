import java.util.Scanner;

/**
 * Write a description of class MainFile here.
 *
 * @author (Hassan Talha)
 * @version (2/2/23)
 */
public class MainFile
{
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    
        int choice = 0;
        while (choice != 8) {
        printMenu();
        choice = input.nextInt();
        if (choice == 1) {
            data1.gatherData();
        } else if (choice == 2) {
            System.out.print("Enter the index: ");
            int index = input.nextInt();
            System.out.print("Enter the new value: ");
            int value = input.nextInt();
            data1.replaceData(index, value);
        } else if (choice == 3) {
            data1.print();
        } else if (choice == 4) {
            System.out.println("Total: " + data1.total());
        } else if (choice == 5) {
            System.out.println("Average: " + data1.average());
        } else if (choice == 6) {
            System.out.println("Max: " + data1.max());
        } else if (choice == 7) {
            System.out.println("Min: " + data1.min());
        } else if (choice == 8) {
            data1.clear();
            System.out.println("Data cleared");
        } else if (choice == 9) {
            System.out.println("Exiting program...");
            break;
        } else {
            System.out.println("Invalid option. Try again.");
        }
        }
        input.close();
    }
    public static void printMenu() {
        System.out.println("Menu Options:");
        System.out.println("1. Reassign Array");
        System.out.println("2. Change 1 element");
        System.out.println("3. Print Array");
        System.out.println("4. Total");
        System.out.println("5. Average");
        System.out.println("6. Max");
        System.out.println("7. Min");
        System.out.println("8. Clear");
        System.out.println("9. Exit");
        System.out.print("Enter your choice: ");
    }
}