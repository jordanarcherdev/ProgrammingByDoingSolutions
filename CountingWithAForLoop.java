import java.util.Scanner;

public class CountingWithAForLoop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Type in a message, and I'll display it five times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();
        
        for (int i = 1; i <= 5; i = i+1)
        {
            System.out.println(i + ". " + message);
        }
    }
}
