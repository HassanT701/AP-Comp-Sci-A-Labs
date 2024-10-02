
/**
 * Write a description of class Ship here.
 *
 * @author (Hassan Talha)
 * @version (4/13/23)
 */
public class Ship
{
    // instance variables - replace the example below with your own
    private String name;
    private String year;
    
    public Ship()
    {
        name = "";
        year = "";
    }
    public String getName() {
        return name;
    }
    public String getYear() {
        return year;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String toString() {
        return "Name: " + name + "\nYear of production: " + year;
    }
}
