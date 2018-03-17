import java.util.Scanner;

public class AddingValuesWithFor
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Number: ");
        int num = keyboard.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= num; i++)
        {
            System.out.println(i + " ");
            sum = sum + i;
        }
        
        System.out.println("The sum is " + sum);
    }
}
