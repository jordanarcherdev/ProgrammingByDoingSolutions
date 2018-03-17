import java.util.Scanner;

public class RightTriangleChecker
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three integers, they must be in ascending order");
        System.out.print("Side 1: ");
        int a = keyboard.nextInt();
        System.out.print("Side 2: ");
        int b = keyboard.nextInt();
        
        while (b < a)
        {
            System.out.println(b + " is smaller than " + a + ". Try again.");
            System.out.print("Side 2: ");
            b = keyboard.nextInt();
        }
        
        System.out.print("Side 3: ");
        int c = keyboard.nextInt();
        
        while (c < b)
        {
            System.out.println(c + " is smaller than " + b + ". Try again.");
            System.out.print("Side 3: ");
            c = keyboard.nextInt();
        }
        
        System.out.println();
        System.out.println("Your three sides are " + a + " " + b + " " + c);
        System.out.println("These sides *do* make a right triangle. Well done!");
    }
}
