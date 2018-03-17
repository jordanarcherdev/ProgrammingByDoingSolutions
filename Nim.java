import java.util.Scanner;

public class Nim
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int a = 3;
        int b = 4;
        int c = 5;
        int ans;
        String choice = "";
        String winner = "";
        
        System.out.print("Player 1, enter your name: ");
        String player1 = keyboard.next();
        System.out.print("Player 2, enter your name: ");
        String player2 = keyboard.next();
        
        while ((a + b + c) > 1)
        {
            System.out.println();
            System.out.println("A: " + a + "    B: " + b + "    C: " + c);
            System.out.print(player1 + ", choose a pile: ");
            choice = keyboard.next();
            System.out.print("How many to remove from pile " + choice + ": ");
            ans = keyboard.nextInt();
            while(ans < 1)
            {
                System.out.print("You must choose at least 1. Try again: ");
                ans = keyboard.nextInt();
            }
            if (choice.equals("A"))
            {
                while(ans > a)
                {
                    System.out.print("Pile A doesn't have that many. Try again: ");
                    ans = keyboard.nextInt();
                }
                a = a - ans;
            }
            else if (choice.equals("B"))
            {
                while (ans > b)
                {
                    System.out.print("Pile B doesn't have that many. Try again: ");
                    ans = keyboard.nextInt();
                }
                b = b - ans;
            }
            else if (choice.equals("C"))
            {
                while (ans > c)
                {
                    System.out.print("Pile C doesn't have that many. Try again: ");
                    ans = keyboard.nextInt();
                }
                c = c - ans;
            }
            
            if ((a + b + c) <= 0)
            {
                winner = player2;
                break;
            }
            
            System.out.println();
            System.out.println("A: " + a + "    B: " + b + "    C: " + c);
            System.out.print(player2 + ", choose a pile: ");
            choice = keyboard.next();
            System.out.print("How many to remove from pile " + choice + ": ");
            ans = keyboard.nextInt();
            while(ans < 1)
            {
                System.out.print("You must choose at least 1. Try again: ");
                ans = keyboard.nextInt();
            }
            if (choice.equals("A"))
            {
                while(ans > a)
                {
                    System.out.print("Pile A doesn't have that many. Try again: ");
                    ans = keyboard.nextInt();
                }
                a = a - ans;
            }
            else if (choice.equals("B"))
            {
                while (ans > b)
                {
                    System.out.print("Pile B doesn't have that many. Try again: ");
                    ans = keyboard.nextInt();
                }
                b = b - ans;
            }
            else if (choice.equals("C"))
            {
                while (ans > c)
                {
                    System.out.print("Pile C doesn't have that many. Try again: ");
                    ans = keyboard.nextInt();
                }
                c = c - ans;
            }
            
            if ((a + b + c) <= 0)
            {
                winner = player1;
            }
        }
        
        System.out.println(winner + ", there are no counters left, you WIN!");
    }
            
}
