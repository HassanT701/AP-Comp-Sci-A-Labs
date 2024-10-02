
/**
 * Write a description of class mainFile here.
 *
 * @author (Hassan Talha)
 * @version (1/11/23)
 */
public class mainFile
{
    public static void main (String[] args){
        bookClass b1 = new bookClass("Refugee", "Alan Gratz", 4.99);
        bookClass b2 = new bookClass("Clowns", "Jimmy Garoppolo", 15.99);
        bookClass b3 = new bookClass("48 laws of power", "Robert Greene", 16.99);
        bookClass b4 = new bookClass("All your perfects", "Coleen Hoover", 19.99);
        bookClass b5 = new bookClass("Gangsters of capitalism", "Jonathan Katz", 18.99);
    }
    public double bookClass (bookClass b1, bookClass b2, bookClass b3, bookClass b4, bookClass b5){
        double high = b1.getprice();
        
        if (b2.getprice() > high)
            high = b2.getprice();
        if (b3.getprice() > high)
            high = b3.getprice();
        if (b4.getprice() > high)
            high = b4.getprice();
        if (b5.getprice() > high)
            high = b5.getprice();
            
        return high;
    }
}