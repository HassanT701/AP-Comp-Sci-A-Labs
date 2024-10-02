
/**
 * Write a description of class bookClass here.
 *
 * @author (Hassan)
 * @version (1/11/23)
 */
public class bookClass
{
    // instance variables - replace the example below with your own
    private String name;
    private String author;
    private double price;
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