import java.util.Scanner;

public class ALittleQuiz
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        
        int ans1, ans2, ans3, total;
        int wrong = 0;
        
        System.out.println( "Q1) What is the capital of alaska?" );
        System.out.println( "       1) Melbourne" );
        System.out.println( "       2) Anchorage" );
        System.out.println( "       3) Juneau" );
        ans1 = keyboard.nextInt();
        
        if ( ans1 == 1 )
        {
            wrong += 1;
            System.out.println( "Sorry, that's not right!" );
        }
        else if ( ans1 == 2 )
        {
            wrong += 1;
            System.out.println( "Sorry, that's not right!" );
        }
        else if ( ans1 == 3 )
        {
            System.out.println( "That's right!" );
        }
        else
        {
            System.out.println( "Did you pick a number between 1 and 3?" );
        }
        
        System.out.println( "Q2) Can you store the value 'cat' in a variable of type int?" );
        System.out.println( "       1) yes" );
        System.out.println( "       2) no" );
        ans2 = keyboard.nextInt();
        
        if ( ans2 == 1 )
        {
            wrong += 1;
            System.out.println( "Sorry, that's not right!" );
        }
        else if ( ans2 == 2 )
        {
            System.out.println( "That's right!" );
        }
        else
        {
            System.out.println( "Did you pick a number between 1 and 2?" );
        }
        
        System.out.println( "What is the result of 9+6/3" );
        System.out.println( "       1) 5" );
        System.out.println( "       2) 11" );
        System.out.println( "       3) 15/3" );
        ans3 = keyboard.nextInt();
        
        if ( ans3 == 1 )
        {
            wrong += 1;
            System.out.println( "Sorry, that's not right!" );
        }
        else if (ans3 == 2)
        {
            System.out.println( "That's right!" );
        }
        else if (ans3 == 3)
        {
            wrong += 1;
            System.out.println( "Sorry, that's not right!" );
        }
        else
        {
            System.out.println( "Did you pick a number between 1 and 3?" );
        }
        
        total = 3 - wrong;
        
        System.out.println( "Overall, you got " + total + " out of 3 correct." );
    }
}
