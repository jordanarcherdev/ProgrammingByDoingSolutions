import java.util.Scanner;

public class SafeSquareRoot
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("SQUARE ROOT!");
        System.out.print("Enter a number: ");
        double num = keyboard.nextInt();
        
        while (num < 0)
        {
            System.out.println("You can't square a negative number!");
            System.out.print("Try again: ");
            num = keyboard.nextInt();
        }
        
        double rooted = Math.sqrt(num);
        System.out.println("The square root of " + num  + " is " + rooted + ".");
    }
}
