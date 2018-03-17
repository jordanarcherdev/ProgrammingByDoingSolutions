import java.util.Random;
import java.util.Scanner;

public class WhereIsIt
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        int[] arr;
        int counter = 0;
        arr = new int[10];
        
        System.out.print("Array: ");
        
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = 1 + r.nextInt(50);
        }
        
        for (int j = 0; j < arr.length; j++)
        {
            System.out.print(arr[j] + " ");
        }
        System.out.print("\nValue to find: ");
        int num = keyboard.nextInt();
        System.out.println();
        
        for(int k = 0; k < arr.length; k++)
        {
            if(num == arr[k])
            {
                counter++;
                System.out.println(num + " is in slot " + k);
            }
        }
        
        if(counter == 0)
        {
            System.out.println(num + " is not in the array.");
        }
    }
}
