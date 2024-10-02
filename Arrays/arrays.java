
/**
 * Write a description of class arrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrays
{
    public static void main(String[] args) {
        int[] value = {5,12,-7,8,19,27,55,1,6,-3};
        int k;
           for (k = 0; k < 10; k++){
                if (value[k] % 2 == 1)
                    System.out.println(k + ": " + value[k]);
                 }
    }
}