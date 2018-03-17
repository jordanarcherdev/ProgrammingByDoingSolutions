import java.util.Scanner;

public class RefresherChallenge
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Your name: ");
        String name = keyboard.next();
        System.out.println();
        int j = 10;
        if (name.equals("Jordan"))
        {
            j = 5;
        }
        
        
        for (int i = 0; i < j; i++)
        {
            System.out.println(name);
        }
    }

}