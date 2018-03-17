import java.util.Scanner;

public class AddingValuesInLoop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int num = 0;
        
        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");
        int entry = keyboard.nextInt();
        int total = num + entry;
        num = total;
        System.out.println("The total so far is " + total);
        
        while (entry != 0)
        {
            System.out.print("Number: ");
            entry = keyboard.nextInt();
            total = num + entry;
            num = total;
            System.out.println("The total so far is " + total);
        }
        System.out.println("The total is " + total);
    }
        
}
