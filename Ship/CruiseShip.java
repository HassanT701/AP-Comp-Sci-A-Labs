
/**
 * Write a description of class CruiseShip here.
 *
 * @author (Hassan Talha)
 * @version (4/16/23)
 */
public class CruiseShip extends Ship
{
    private int maxPassengers;

    public CruiseShip() {
        super();
        maxPassengers = 0;
    }
    public CruiseShip(String name, String year, int maxPassengers) {
        super(name, year);
        this.maxPassengers = maxPassengers;
    }
    public int getMaxPassengers() {
        return maxPassengers;
    }
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
    public String toString() {
        return "Name: " + getName() + ", Maximum Passengers: " + maxPassengers;
    }
}
