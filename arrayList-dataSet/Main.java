import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class Main here.
 *
 * @author (Hassan Talha)
 * @version (2/27/23)
 */
public class Main
{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList listManipulator = new ArrayList();

    while (true) {
        System.out.println("Menu Options:");
        System.out.println("1. Add values");
        System.out.println("2. Change a value");
        System.out.println("3. Insert a value");
        System.out.println("4. Get index");
        System.out.println("5. Get size");
        System.out.println("6. Print");
        System.out.println("7. Total");
        System.out.println("8. Average");
        System.out.println("9. Remove a value");
        System.out.println("10. Remove a location");
        System.out.println("11. Clear list");
        System.out.println("12. Exit");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if (choice == 1) {
            list.addValues();
        } else if (choice == 2) {
            list.changeValue();
        } else if (choice == 3) {
            list.insertValue();
        } else if (choice == 4) {
            list.getIndex();
        } else if (choice == 5) {
            list.getSize();
        } else if (choice == 6) {
            list.printList();
        } else if (choice == 7) {
            list.getTotal();
        } else if (choice == 8) {
            list.getAverage();
        } else if (choice == 9) {
            list.removeValue();
        } else if (choice == 10) {
            list.removeLocation();
        } else if (choice == 11) {
            list.clearList();
        } else if (choice == 12) {
            System.out.println("Exiting program...");
            System.exit(0);
        } else {
            System.out.println("Invalid choice, please try again.");
        }
    }
    }
}
