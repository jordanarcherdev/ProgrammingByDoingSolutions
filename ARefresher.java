import java.util.Scanner;

public class ARefresher
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is your name: ");
        String name = keyboard.next();
        System.out.println();
        
        if (name.equals("Jordan"))
        {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(name);
        }
    }
        else
        {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(name);
        }
    }
}
}
