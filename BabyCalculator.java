import java.util.Scanner;

public class BabyCalculator
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        double a, b, c;
        String op;
        boolean kill = false;
        
        do
        {
            System.out.print("> ");
            a = keyboard.nextDouble();
            if (a == 0)
            {
                kill = false;
            }
            else
            {
                kill = true;
            }
            op = keyboard.next();
            b = keyboard.nextDouble();
            
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
            else
            {
                System.out.println("Undefined operator: " + op + "'.");
                c = 0;
            }
            
            System.out.println(c);
        }while (kill == true);
        
        System.out.println("Goodbye!");
    }
}
