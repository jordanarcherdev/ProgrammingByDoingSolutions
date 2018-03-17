//works with out string again being declared because do operates once


import java.util.Scanner;
import java.util.Random;

public class CoinFlipDoWhile
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        String again;
        
        do 
        {
            int flip = r.nextInt(2);
            String coin;
            
            if (flip == 1)
            {
                coin = "HEADS";
            }
            else 
            {
                coin = "TAILS";
            }
            
            System.out.println("You flip a coin and it is..." + coin);
            
            System.out.print("Would you like to flip again? (y/n)");
            again = keyboard.next();
        } while (again.equals("y"));
    }
}