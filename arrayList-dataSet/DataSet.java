import java.util.Scanner;

/**
 * Write a description of class DataSet here.
 *
 * @author (Hassan Talha)
 * @version (2/2/23)
 */
public class DataSet
{
    ArrayList<Integer> x = new ArrayList<Integer>();
    private Scanner scan = new Scanner(System.in);  
    public void gatherData() {
        System.out.println("Enter 10 values:");
        for (int i = 0; i < 10; i++) {
             System.out.print("Value " + (i + 1) + ": ");
             data[i] = scan.nextInt();
        }
    }
    public void replaceData(int index, int value) {
           if (index >= 0 && index < 10) {
              data[index] = value;
           }
    }
    public void print() {
        System.out.print("Data values: ");
            for (int i = 0; i < 10; i++) {
                 System.out.print(data[i] + " ");
            }
        System.out.println();
    }
    public int total() {
        int total = 0;
            for (int i = 0; i < 10; i++) {
                 total += data[i];
            }
        return total;
    }
    public int min() {
        int min = data[0];
        for (int i = 1; i < 10; i++) {
             if (data[i] < min) {
                min = data[i];
             }
        }
        return min;
    }
    public int max() {
        int max = data[0];
        for (int i = 1; i < 10; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }
    public int average() {
        return total() / 10;
    }
    public void clear() {
        for (int i = 0; i < 10; i++) {
            data[i] = 0;
        }
    }

}
