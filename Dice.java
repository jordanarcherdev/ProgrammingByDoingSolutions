import java.util.Random;

public class Dice
{
    public static void main(String[] args)
    {
        Random r = new Random();
        
        int a = 1 + r.nextInt(6);
        int b = 1 + r.nextInt(6);
        int c = a + b;
        
        System.out.println("HERE COMES THE DICE!");
        System.out.println();
        
        System.out.println("Roll #1: " + a);
        System.out.println("Roll #2: " + b);
        System.out.println("The total is " + c + "!");
    }
}
