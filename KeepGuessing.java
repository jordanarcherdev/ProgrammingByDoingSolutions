import java.util.Scanner;
import java.util.Random;

public class KeepGuessing
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int guess;
        int num = 1 + r.nextInt(10);
        
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        guess = keyboard.nextInt();
        
        while (guess != num)
        {
            System.out.println("\nThat is incorrect. Guess again.");
            System.out.print("Your guess: ");
            guess = keyboard.nextInt();
        }
        System.out.println("That's right! You're a good guesser.");
    }
}
