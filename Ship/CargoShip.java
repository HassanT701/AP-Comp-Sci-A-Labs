
/**
 * Write a description of class CargoShip here.
 *
 * @author (Hassan Talha)
 * @version (4/13/23)
 */
public class CargoShip extends Ship
{
    // instance variables - replace the example below with your own
    private int tons;

    
    public CargoShip()
    {
        // initialise instance variables
        tons = 0;
    }
    public CargoShip(String name, String year)
    {
        super(name, year);
        tons = 0;
    }
    public int getTons() {
        return tons;
    }
    public void setTons(int tons) {
        this.tons = tons;
    }
}
