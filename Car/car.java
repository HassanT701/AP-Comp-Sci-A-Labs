
/**
 * Write a description of class car here.
 *
 * @author (Hassan Talha)
 * @version (1/13/23)
 */
public class car
{
    // instance variables - replace the example below with your own
    private String make;
    private String model;
    private int year;
    
    public bookClass(String name, String author, double price){
        this.name = " ";
        this.author = " ";
        this.price = 0;
    }
    public String getname(){
     return name;
    }
    public String getauthor(){
     return author;
    }
    public double getprice(){
     return price;
    }
    public void setname(String name){
     this.name = name;
    }
    public void setauthor(String author){
     this.author = author;
    }
    public void setprice(double price){
     this.price = price;
    }  
    public String toString(){
        return "" + name + " is written by: " + author + " and goes for: $" + price + " ";
    }
    
}
