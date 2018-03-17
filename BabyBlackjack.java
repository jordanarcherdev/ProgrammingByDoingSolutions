import java.util.Random;

public class BabyBlackjack
{
    public static void main(String[] args)
    {
        Random r = new Random();
        
        int p1 = 1 + r.nextInt(10);
        int p2 = 1 + r.nextInt(10);
        int pt = p1 + p2;
        int d1 = 1 + r.nextInt(10);
        int d2 = 1 + r.nextInt(10);
        int dt = d1 + d2;
        
        System.out.println("Baby Blackjack!");
        System.out.println("\nYou drew " + p1 + " and " + p2 + ".");
        System.out.println("Your total is " + pt + ".");
        System.out.println("\nThe dealer has " + d1 + " and " + d2 + ".");
        System.out.println("Dealer's total is " + dt + ".");
        System.out.println();
        
        if (pt > dt)
        {
            System.out.println("YOU WIN!");
        }
        else
        {
            System.out.println("Dealer wins.");
        }
    }
}
