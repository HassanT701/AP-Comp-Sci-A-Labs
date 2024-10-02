
/**
 * Write a description of class ShipMain here.
 *
 * @author (Hassan Talha)
 * @version (4/16/23)
 */
public class ShipMain
{
    public static void main(String[] args) {
        Ship[] ships = new Ship[10];

        ships[0] = new Ship("Ship A", "2000");
        ships[1] = new CruiseShip("Cruise Ship B", "2005", 1000);
        ships[2] = new Ship("Ship C", "1995");
        ships[3] = new CruiseShip("Cruise Ship D", "2010", 1500);
        ships[4] = new CargoShip("Cargo Ship E", "1980", 5000);
        ships[5] = new CruiseShip("Cruise Ship F", "2015", 2000);
        ships[6] = new CargoShip("Cargo Ship G", "2008", 8000);
        ships[7] = new CruiseShip("Cruise Ship H", "2018", 2500);
        ships[8] = new CargoShip("Cargo Ship I", "1975", 10000);
        ships[9] = new CruiseShip("Cruise Ship J", "2020", 3000);

        for (int i = 0; i < ships.length; i++) {
            System.out.println(ships[i].toString());
        }
    }
}
