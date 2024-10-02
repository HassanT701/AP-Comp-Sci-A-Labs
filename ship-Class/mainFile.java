
/**
 * Write a description of class mainFile here.
 *
 * @author (Hassan Talha)
 * @version (1/9/23)
 */
public class mainFile
{
    public static void main (String[] args){
        ship s1 = new ship();
        
        ship s2 = new ship(10, 20, 5);
        
        ship s3 = new ship(5,8);
        
        System.out.print(s1);
        System.out.print(s2);
        System.out.print(s3);
    }
}