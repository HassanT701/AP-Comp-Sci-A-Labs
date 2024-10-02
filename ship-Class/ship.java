
/**
 * Write a description of class ship here.
 *
 * @author (Hassan Talha)
 * @version (1/9/23)
 */
public class ship
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int speed;
    public ship(int x,int y){
     this.x=x;
     this.y=y;
     }
    public ship(int x,int y,int speed){
     this.x=x;
     this.y=y;
     this.speed=speed;
    }
    public int getX(){
     return x;
    }
    public int getY(){
     return y;
    }
    public int getSpeed(){
     return speed;
    }
    public void setX(int x){
     this.x=x;
    }
    public void setY(int y){
     this.y=y;
    }
    public void setSpeed(int speed){
     this.speed=speed;
    }   
    public String toString(){
        return "This ship has an x-coordinate of: " + x + " and a y coordinate of: " + y + " and a speed of: " + speed + ".";
    }
}