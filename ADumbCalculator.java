import java.util.Scanner;
public class ADumbCalculator
{
    public static void main( String[] args )
    {
        double firstNum, secondNum, thirdNum, ans;
        
        Scanner keyboard = new Scanner( System.in );
        
        System.out.println( "What is your first number? " );
        firstNum = keyboard.nextDouble();
        
        System.out.println( "What is your second number? " );
        secondNum = keyboard.nextDouble();
        
        System.out.println( "What is your third number? " );
        thirdNum = keyboard.nextDouble();
        
        ans = ( firstNum + secondNum + thirdNum ) / 2;
        
        System.out.println( "( " + firstNum + " + " + secondNum + " + " + thirdNum + " )" + " / 2 is... " + ans );
    }
}
