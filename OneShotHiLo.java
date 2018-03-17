import java.util.Scanner;
import java.util.Random;

public class OneShotHiLo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        int num = 1 + r.nextInt(100);
        int guess;
        
        System.out.println("I'm thinking of a number between 1-100. Try to guess it");
        guess = keyboard.nextInt();
        
        if (guess == num)
        {
            System.out.println("Well done! You got it!");
        }
        else if (guess < num)
        {
            System.out.println("Sorry, you are too low. I was thinking of " + num + ".");
        }
        else if (guess > num)
        {
            System.out.println("Sorry, you are too high. I was thinking of " + num + ".");
        }
    }
}
