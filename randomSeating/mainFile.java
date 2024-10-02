import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class mainFile here.
 *
 * @author (Hassan Talha)
 * @version (3-6-23)
 */
public class mainFile
{
    public static void main (String[] args){
       Scanner input = new Scanner(System.in);
       
       ArrayList<String> names = new ArrayList<String>();
       String name = "";
        while (!name.equals("Done")) {
            System.out.print("Enter a student name (or 'Done' to finish): ");
            name = input.nextLine();
            if (!name.equals("Done")) {
                names.add(name);
            }
           }
       
       ArrayList<Integer> seats = new ArrayList<Integer>();
       System.out.print("Enter the number of seats in the classroom: ");
       int numSeats = input.nextInt();
        if (numSeats < names.size()) {
            System.out.println("Error not enough seats in your class");
            } else {
            for (int i = 1; i <= numSeats; i++) {
                seats.add(i);
            }
           }
        if (numSeats >= names.size()){
        Random ran = new Random();
           for (String student : names) {
                int seatIndex = ran.nextInt(seats.size());
                int seatNum = seats.get(seatIndex);
                seats.remove(seatIndex);
                System.out.println(student + " will sit in seat " + seatNum);
           }
        }
}
    public static int randomSeat(ArrayList<Integer> seats){
       int size = seats.size();
       if (size == 0) {
        return -1;
        } else if (size == 1) {
        return seats.get(0);
        } else {
        Random ran = new Random();
        for (int i = size - 1; i >= 0; i--) {
            int seatIndex = ran.nextInt(i + 1);
            int seatNum = seats.get(seatIndex);
            seats.set(seatIndex, seats.get(i));
            seats.set(i, seatNum);
        }
        return seats.remove(0);
        }
    }
}
