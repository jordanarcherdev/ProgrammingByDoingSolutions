import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int guess;
        int card = r.nextInt(3);
        System.out.println("You slide up to Fast Eddies' card table and throw down your cash.");
        System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
        System.out.println("He lays down three cards.");
        System.out.println();
        System.out.println("Which one is the ace?");
        System.out.println();
        System.out.println("##  ##  ##");
        System.out.println("##  ##  ##");
        System.out.println("1   2   3 ");
        System.out.println();
        guess = keyboard.nextInt();
        
        if (guess == card)
        {
            System.out.println();
            System.out.println("You nailed it! Fast Eddie reluctantly hands over  your winnings, scowling.");
            System.out.println();
        }
        else if(guess != card)
        {
            System.out.println();
            System.out.println("Ha! Fast Eddie wins again! The ace card was number " + card + "!");
            System.out.println();
        }
        
        if (card == 1)
        {
            System.out.println("AA  ##  ##");
            System.out.println("AA  ##  ##");
            System.out.println("1   2   3 ");
        }
        else if (card == 2)
        {
            System.out.println("##  AA  ##");
            System.out.println("##  AA  ##");
            System.out.println("1   2   3 ");
        }
        else if (card == 3)
        {
            System.out.println("##  ##  AA");
            System.out.println("##  ##  AA");
            System.out.println("1   2   3 ");
        }
    }
}
