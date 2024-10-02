import java.util.Scanner;

/**
 * Write a description of class guessingGame here.
 *
 * @author (Hassan Talha)
 * @version (12-2-22)
 */
public class guessingGame
{
    public static void main (String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("---Guessing Game---\n");
       
       int x = (int) (Math. random () * (1000 - 1 + 1) + 1);
       System.out.println("I picked a number from 1 to 1000. Try to guess it. \n Enter a guess: ");
       int guess = input.nextInt();
        
       for (int num = 0; guess >= x || guess <= x; num++) {
            if (guess > x) {
            System.out .println ("\nToo high, try again.");
            System.out .println("Enter a guess: ");
            guess = input.nextInt();
            num++;
            }
            else if (guess < x){
            System.out .println ("\nToo low, try again.");
            System.out .println("Enter a guess: ");
            guess = input.nextInt();
            num++;
            }
            else {
            num++;
            System.out.println(" You got my number in " +num+ " guesses!");
            
            }
       }
    }
}