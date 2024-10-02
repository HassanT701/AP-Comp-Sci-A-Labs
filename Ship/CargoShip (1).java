
/**
 * Write a description of class CargoShip here.
 *
 * @author (Hassan Talha)
 * @version (4/16/23)
 */
public class CargoShip extends Ship
{
    private int cargoCapacity;
    public CargoShip() {
        super();
        cargoCapacity = 0;
    }
    public CargoShip(String name, String year, int cargoCapacity) {
        super(name, year);
        this.cargoCapacity = cargoCapacity;
    }
    public int getCargoCapacity() {
        return cargoCapacity;
    }
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    public String toString() {
        return "Name: " + getName() + ", Cargo Capacity: " + cargoCapacity;
    }
}
