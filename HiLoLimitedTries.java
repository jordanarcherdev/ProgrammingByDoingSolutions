import java.util.Scanner;
import java.util.Random;

public class HiLoLimitedTries
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int num = 1 + r.nextInt(100);
        int tries = 0;
        
        System.out.println("I am thinking of a number between 1 - 100. You have 7 guesses.");
        System.out.print("Your guess: ");
        int guess = keyboard.nextInt();
        tries++;
        
        while (guess != num && tries < 7)
        {
            if (guess < num)
            {
                System.out.println("Sorry, you are too low.");
            }
            else if (guess > num)
            {
                System.out.println("Sorry, you are too high.");
            }
            System.out.print("Your guess: ");
            guess = keyboard.nextInt();
            tries++;
        }
        if (tries == 7)
        {
            System.out.println("Sorry you didn't get it in 7 guesses");
        }
        else if (guess == num)
        {
            System.out.println("You got it!");
        }
    }
        
}
