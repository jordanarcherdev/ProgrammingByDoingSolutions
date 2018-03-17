import java.util.Scanner;

public class PinLockout
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 1234;
        int tries = 0;
        
        System.out.println("WELCOME TO THE BANK OF ARCHER.");
        System.out.print("YOUR PIN: ");
        int entry = keyboard.nextInt();
        int max = 4;
        tries++;
        
        while (entry != pin && tries < max)
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("YOUR PIN: ");
            entry = keyboard.nextInt();
            tries++;
        }
        
        if (entry == pin)
        {
            System.out.println("\nACCESS GRANTED!");
        }
        else if ( tries >= max)
        {
            System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED");
        }
    }
}
