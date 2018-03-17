import java.util.Scanner;
import java.util.Random;

public class Blackjack
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        String playAgain = "y";
        while(playAgain.equals("y"))
        {
        
        int p1 = 2 + r.nextInt(11);
        int p2 = 2 + r.nextInt(11);
        int pt = p1 + p2;
        int d1 = 2 + r.nextInt(11);
        int d2 = 2 + r.nextInt(11);
        int dt = d1 + d2;
        String choice = "";
        
        System.out.println("Blackjack!");
        System.out.println("You get a " + p1 + " and a " + p2);
        System.out.println("Your total is " + pt);
 
        

        System.out.println("\nThe dealer has a " + d1 + " showing, and a hidden card.");
        System.out.println("His total is hidden, too.");
        do
        {
        System.out.println("\nWould you like to 'hit' or 'stay'?");
        choice = keyboard.next();
        if (choice.equals("hit"))
        {
            int draw = 2 + r.nextInt(11);
            System.out.println("You drew a " + draw);
            pt = pt + draw;
            System.out.println("Your total is " + pt);

        }
    } while (choice.equals("hit") && pt < 21);
    if (pt > 21)
    {
        System.out.println("BUST! Dealer wins!");
        break;
    }
       System.out.println("\nOkay, dealers turn.");
       System.out.println("His hidden card was " + d2);
       System.out.println("His total is " + dt); 
       while (dt < 16)
       {
           System.out.println("\nDealer chooses to hit.");
           int dealerDraw = 2 + r.nextInt(11);
           dt = dt + dealerDraw;
           System.out.println("He draws a " + dealerDraw);
           System.out.println("His total is " + dt);
    }
    if (dt > 21)
    {
        System.out.println("DEALER BUST! You win!");
        break;
    }
    else
    {
        System.out.println("Dealer stays.");
        System.out.println("\nDealer total is " + dt);
        System.out.println("Your total is " + pt);
        
        if (pt > dt)
        {
            System.out.println("\nYOU WIN!");
        }
        else
        {
            System.out.println("Dealer wins.");
        }
    }
    System.out.println("Would you like to play again? ('y' or 'n')");
    playAgain = keyboard.next();
}
        
}
}
