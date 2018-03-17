import java.util.Scanner;

public class TheWorstNumberGuessingGameEver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int secretNumber = 4;
        
        System.out.println("The Worst Number Guessing Game");
        System.out.println("\nI'm thinking of a number between 1-10, Guess: ");
        int guess = keyboard.nextInt();
        
        if (guess == secretNumber)
        {
            System.out.println("\nWell done! It was " + secretNumber);
        }
        else 
        {
            System.out.println("\nNope it was " + secretNumber);
        }
    }
}
