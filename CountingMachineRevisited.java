import java.util.Scanner;

public class CountingMachineRevisited
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Count From: ");
        int fr = keyboard.nextInt();
        System.out.print("Count To: ");
        int to = keyboard.nextInt();
        System.out.print("Count By: ");
        int by = keyboard.nextInt();
        
        for (int i = fr; i <= to; i = i+by)
        {
            System.out.print(i + " ");
        }
    }
}
