
/**
 * Write a description of class Ship here.
 *
 * @author (Hassan Talha)
 * @version (4/16/23)
 */
public class Ship
{
    private String name;
    private String year;

    public Ship() {
        name = "";
        year = "";
    }
    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
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
        return "Name: " + name + ", Year: " + year;
    }
}
