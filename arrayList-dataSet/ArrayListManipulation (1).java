import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class array here.
 *
 * @author (Hassan Talha)
 * @version (2/27/23)
 */
public class ArrayListManipulation
{
    private ArrayList<Integer> list;

    public ArrayListManipulation() {
        list = new ArrayList<Integer>();
    }
    public void addValues() {
        Scanner input = new Scanner(System.in);
        int value;
        do {
            System.out.print("Enter a value (0 to stop): ");
            value = input.nextInt();
            if (value != 0) {
                list.add(value);
            }
        } while (value != 0);
    }
    public void changeValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of the value to change: ");
        int index = input.nextInt();
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index, please try again.");
        } else {
            System.out.print("Enter the new value: ");
            int value = input.nextInt();
            list.set(index, value);
        }
    }
    public void insertValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index to insert the value: ");
        int index = input.nextInt();
        if (index < 0 || index > list.size()) {
            System.out.println("Invalid index, please try again.");
        } else {
            System.out.print("Enter the value to insert: ");
            int value = input.nextInt();
            list.add(index, value);
        }
    }
    public void getIndex() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index to get the value: ");
        int index = input.nextInt();
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index, please try again.");
        } else {
            int value = list.get(index);
            System.out.println("Value at index " + index + ": " + value);
        }
    }
    public void getSize() {
        System.out.println("Size of the list: " + list.size());
    }
    public void printList() {
        System.out.print("List: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public void getTotal() {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        System.out.println("Total of all values: " + total);
    }
    public void getAverage() {
        if (list.size() == 0) {
            System.out.println("The list is empty.");
        } else {
            int total = 0;
            for (int i = 0; i < list.size(); i++) {
                total += list.get(i);
            }
            double average = (double) total / list.size();
            System.out.println("Average of all values: " + average);
        }
    }
    public void removeValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value to remove: ");
        int value = input.nextInt();
        if (list.remove(Integer.valueOf(value))) {
            System.out.println("Remove successful.");
        } else {
            System.out.println("Value not found.");
        }
    }
    public void removeLocation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index to remove: ");
        int index = input.nextInt();
        if (index < 0 || index >= list.size()) {
        System.out.println("Invalid index, please try again.");
        } else {
        int removedValue = list.remove(index);
        System.out.println("Value removed: " + removedValue);
        }
    }
    public void clearList(){
        for(int x= 0; x <= list.size(); x++){
            list.remove(x);
        }
    }
}
