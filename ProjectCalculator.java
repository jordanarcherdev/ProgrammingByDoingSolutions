import java.util.Scanner;

public class ProjectCalculator
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double a, b;
        double c = 0;
        String op;
        
        do
        {
        System.out.print("> ");
        a = keyboard.nextInt();
        op = keyboard.next();
        b = keyboard.nextInt();
        
        if (op.equals("+"))
        {
            c = a + b;
        }
        else if (op.equals("-"))
        {
            c = a - b;
        }
        else if (op.equals("*"))
        {
            c = a * b;
        }
        else if (op.equals("/"))
        {
            c = a / b;
        }
        else if (op.equals("^"))
        {
            c = Math.pow(a,b);
        }
        else if (op.equals("%"))
        {
            c = a % b;
        }
        
        System.out.println(c);
    } while(a != 0);
    
    System.out.println("Goodbye!");
}
}
