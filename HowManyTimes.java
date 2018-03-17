import java.util.Random;
import java.util.Scanner;

public class HowManyTimes
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        int arr[];
        arr = new int[10];
        
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = 1 + r.nextInt(50);
        }
        
        System.out.print("Array: ");
        
        for (int j = 0; j < arr.length; j++)
        {
            System.out.print(arr[j] + " ");
        }
        
        System.out.print("\nValue to find: ");
        int num = keyboard.nextInt();
        System.out.println();
        
        int counter = 0;
        
        for (int k = 0; k < arr.length; k++)
        {
            if (arr[k] == num)
            {
                counter++;
            }
        }
        
        if (counter > 0)
        {
            System.out.println(num + " was found " + counter + " times.");
        }
        else
        {
            System.out.println("Sorry, " + num + " was not found!");
        }
        
    }
}
