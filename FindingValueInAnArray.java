import java.util.Random;
import java.util.Scanner;

public class FindingValueInAnArray
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        int[] arr;
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
        
        System.out.println("\nValue to find: ");
        int num = keyboard.nextInt();
        
        for(int k = 0; k < arr.length; k++)
        {
            if(num == arr[k])
            {
                System.out.println(num + " is in the array.");
            }
        }     
    }
}
