import java.util.Scanner;
import java.util.Random;

public class RandomNumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int i = 1 + r.nextInt(10);
        int guess;
        
        System.out.println("I'm thinking of a number from 1 to 10");
        System.out.println("\nYour guess: ");
        guess = keyboard.nextInt();
        
        if (guess == i)
        {
            System.out.println("\nThat's right! My secret number was " + i + "!");
        }
        else if (guess != i)
        {
            System.out.println("\nSorry, but I was really thinking of " + i + "!");
        }
    }
}
