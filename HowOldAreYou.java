import java.util.Scanner;
public class HowOldAreYou
{
    public static void main( String[] args )
    {
        String name;
        int age;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println( "Hey, What's your name? " );
        name = keyboard.next();
        
        System.out.println( "Ok " + name + ", how old are you? " );
        age = keyboard.nextInt();
        
        if ( age < 16 )
        {
            System.out.println( "You can't drive " + name );
        }
        
        if ( age < 18 )
        {
            System.out.println( "You can't vote " + name );
        }
        
        if ( age < 25 )
        {
            System.out.println( "You can't rent a car " + name );
        }
        
        if ( age >= 25 )
        {
            System.out.println( "You can do anything that's legal." );
        }
    }
        
}
