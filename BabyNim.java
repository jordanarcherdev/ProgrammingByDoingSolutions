import java.util.Scanner;

public class BabyNim
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int a = 3;
        int b = 3;
        int c = 3;
        
        int ans;
        String choice = "";
        
        while ((a + b + c) > 0)
        {
            System.out.println("A: " + a + "    B: " + b + "    C: " + c);
            System.out.println();
            System.out.print("Choose a pile: ");
            choice = keyboard.next();
            System.out.print("How many to remove from pile " + choice + ": ");
            ans = keyboard.nextInt();
            
            if (choice.equals("A"))
            {
                a = a - ans;
            }
            else if (choice.equals("B"))
            {
                b = b - ans;
            }
            else if (choice.equals("C"))
            {
                c = c - ans;
            }
        }
        System.out.println("All piles are empty! Good Job!");
    }
}
