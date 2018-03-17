import java.util.Scanner;

public class CollatzSequence
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int ans;
        int count = 0;
        int largest = 0;
        
        System.out.print("Starting number: ");
        int num = keyboard.nextInt();
        System.out.print(num + "    ");
        while (num > 1)
        {
        if ((num%2)==0) //even
        {
            num = num / 2;
            if (largest < num)
            {
                largest = num;
            }
            System.out.print(num + "    ");
            count++;
        }
        else
        {
            num = (num * 3) + 1;
            if (largest < num)
            {
                largest = num;
            }
            System.out.print(num + "    ");
            count++;
        }
    }
    
        

    
        System.out.println();
        System.out.println("Terminated after " + count + " steps");
        System.out.println("The largest value was " + largest);
    }
}
