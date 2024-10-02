
/**
 * Write a description of class Purse2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Purse2
{
    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;
    public Purse2(){
        this.quarters = 0;
        this.dimes = 0;
        this.nickels = 0;
        this.pennies = 0;
    }
    public Purse2(int quarters, int dimes, int nickels, int pennies){
        this.quarters = quarters;
        this.dimes = dimes;
        this.nickels = nickels;
        this.pennies = pennies;
    }
    public void setQuarters(int quarters){
        this.quarters += quarters;
    }
    public void setDimes(int dimes){
        this.dimes += dimes;
    }
    public void setNickels(int nickels){
        this.nickels += nickels;
    }
    public void setPennies(int pennies){
        this.pennies += pennies;
    }
    public int getQuarters(){
        return quarters;
    }
    public int getDimes(){
        return dimes;
    }
    public int getNickels(){
        return nickels;
    }
    public int getPennies(){
        return pennies;
    }
    public double calculateTotal(){
        return (quarters * 0.25) + (dimes * 0.1) + (nickels * 0.05) + (pennies * 0.01);
    }
    public String toString(double calculateTotal){
        return "This purse comtains:/n" +quarters+ " Quarters/n" +dimes+ " Dimes/n" +nickels+ " Nickels/n" +pennies+ " Pennies/n" + "for a total of $ " +calculateTotal+ ".";
    }
}
