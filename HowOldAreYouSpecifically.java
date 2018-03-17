import java.util.Scanner;

public class HowOldAreYouSpecifically
{
    public static void main( String[] args )
    {
        String name;
        int age;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println( "What is your name?" );
        name = keyboard.next();
        
        System.out.println( "Ok " + name + ", how old are you?");
        age = keyboard.nextInt();
        
        if ( age < 16 )
        {
            System.out.println( "You can't drive, " + name );
        }
        else if ( age >= 16 && age < 18 )
        {
            System.out.println( "You can drive but not vote, " + name );
        }
        else if ( age >= 18 && age < 25 )
        {
            System.out.println( "You can vote but not rent a car, " + name );
        }
        else
        {
            System.out.println( "You can pretty much do anything, " + name );
        }
    }
}
