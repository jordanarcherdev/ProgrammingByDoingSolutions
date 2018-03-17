import java.util.Scanner;

public class DisplayingSomeMultiples
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Choose a number: ");
        int num = keyboard.nextInt();
        int ans;
        for(int i = 1; i <= 12; i++)
        {
            ans = num * i;
            System.out.println(num + "x" + i + " " + "=" + " " + ans);
        }
    }
}
