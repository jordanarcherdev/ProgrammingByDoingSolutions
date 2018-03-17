import java.util.Random;

public class LocatingLargestValue
{
    public static void main(String[] args)
    {
        Random r = new Random();
        
        int[] arr;
        arr = new int[10];
        int big = 0;
        int pos = 0;
        
        System.out.print("Array: ");
        
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = 1 + r.nextInt(100);
        }
        
        for(int j = 0; j < arr.length; j++)
        {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        
        for (int k = 0; k < arr.length; k++)
        {
            if (arr[k] > big)
            {
                big = arr[k];
                pos = k;
            }
        }
        
        System.out.println("The largest value it " + big);
        System.out.println("It is in slot " + pos);
    }
}