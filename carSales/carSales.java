import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class carSales here.
 *
 * @author (Hassan Talha)
 * @version (2-22-23)
 */
public class carSales
{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> sales = new ArrayList<Double>(); 
        
        System.out.println("Please enter the sales for the firts 8 months of the year:");
        for (int i = 0; i < 8; i++) {
             System.out.print("Enter sales amount for month " + (i + 1) + ": ");
             sales.add(sc.nextDouble());
        }
        
        System.out.println("The following are the sales amounts for the first 8 months of the year : " + sales +"");
        
        System.out.println("Sales amounts in reverse order: ");
        for (int i = sales.size() - 1; i >= 0; i--) {
            System.out.print(sales.get (i) + " ");
        }

        double totalSales = 0;
        for (int i =0; i < sales.size(); i++) {
             totalSales += sales.get(i);
        }
        System.out.println("\nThe total sales amount: " + totalSales +"");

        double averageSales = totalSales / sales.size();
        System.out.println("The average sales amount: " + averageSales +"");

        double highestSale = sales.get(0);
        for (int i = 1; i < sales.size(); i++) {
            if (sales.get(i) > highestSale) {
                highestSale = sales.get(i);
            }
        }
        System.out.println("The highest sales amount: "+ highestSale +"");
        
        double lowestSale = sales.get(0);
        for(int i = 1; i  < sales.size(); i++) {
            if (sales.get(i) < lowestSale) {
                lowestSale = sales.get(i);
            }
        } 
        System.out.println("The lowest sales amount: " + lowestSale +"");
        
        double range = highestSale - lowestSale;
        System.out.println("The range of sales amounts: " + range +"");

        for (int i = 0 ; i < sales.size(); i++) {
              for (int j = i + 1; j < sales.size(); j++) {
                    if (sales.get(i) > sales.get(j)) {
                        double y = sales.get(i); 
                        sales.set (i, sales.get(j));
                        sales.set(j, y);
                    }
                }
        }
        System.out.println("Sales in order from least to greatest: " + sales +"");
        
}
}


