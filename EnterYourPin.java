import java.util.Scanner;

public class EnterYourPin
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 1234;
        
        System.out.println("WELCOME TO BANK OF ARCHER");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();
        
        while (entry != pin)
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }
        
        System.out.println("ACCESS GRANTED.");
    }
}
