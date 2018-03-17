import java.util.Scanner;
import java.util.Random;

public class AgainWithNumberCounting
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        int tries = 0;
        int num = 1 + r.nextInt(10);
        int guess;
        
        System.out.println("I have chose a number between 1 and 10. Try to guess it.");
        
        do
        {
            if (tries == 0)
            {
                System.out.print("Your guess: ");
                guess = keyboard.nextInt();
                System.out.println();
                tries++;
            }
            else{
            System.out.println("Sorry try again! ");
            System.out.print("Your guess: ");
            guess = keyboard.nextInt();
            System.out.println();
            tries++;
        }
        }while (guess != num);
        
        System.out.println("That's right! It took you " + tries + " tries!");
    }
}
