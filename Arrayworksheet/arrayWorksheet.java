import java.util.Scanner;

/**
 * Write a description of class arrayWorksheet here.
 *
 * @author (Hassan Talha)
 * @version (1/27/23)
 */
public class arrayWorksheet
{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] temp = new int[7];
        
        System.out.print("Enter the temp of day 1: ");
        int temp1 = input.nextInt();
        temp[0] = temp1;
        System.out.print("Enter the temp of day 2: ");
        int temp2 = input.nextInt();
        temp[1] = temp2;
        System.out.print("Enter the temp of day 3: ");
        int temp3 = input.nextInt();
        temp[2] = temp3;
        System.out.print("Enter the temp of day 4: ");
        int temp4 = input.nextInt();
        temp[3] = temp4;
        System.out.print("Enter the temp of day 5: ");
        int temp5 = input.nextInt();
        temp[4] = temp5;
        System.out.print("Enter the temp of day 6: ");
        int temp6 = input.nextInt();
        temp[5] = temp6;
        System.out.print("Enter the temp of day 7: ");
        int temp7 = input.nextInt();
        temp[6] = temp7;
        
        System.out.println("Total: ");
        System.out.println(total(temp));
        System.out.println("Average :");
        System.out.println(average(temp));
        System.out.println("Highest :");
        System.out.println(max(temp));
    }
    public static int total (int temp[]){
        int total = 0;
        for (int x: temp){
            total += temp[x];  
        }
        return total;
    }
    public static int average (int temp[]){
        return total(temp) / 7;
    }
    public static int max (int temp[]){
        int max = 0;
        for (int i = 0; i < temp.length; i++){
            if(temp[i] > max) {
                max = temp[i];
            }
        }
        return max;
    }
}