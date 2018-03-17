import java.util.Scanner;
public class SpaceBoxing
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        
        double planet;
        
        double weight, planetWeight;
        
        double venus = 0.78;
        double mars = 0.39;
        double jupiter = 2.65;
        double saturn = 1.71;
        double uranus = 1.05;
        double neptune = 1.23;
        
        System.out.println( "Please enter your current earth weight: " );
        weight = keyboard.nextDouble();
        
        System.out.println( "I have information for the following planets: " );
        System.out.println( "   1. Venus    2. Mars     3. Jupiter" );
        System.out.println( "   4. Saturn   5. Uranus   6. Neptune" );
        
        System.out.println("\nWhich planet are you visiting? ");
        planet = keyboard.nextInt();
        
        if ( planet == 1 )
        {
            planet = venus;
        }
        else if ( planet == 2 )
        {
            planet = mars;
        }
        else if ( planet == 3 )
        {
            planet = jupiter;
        }
        else if ( planet == 4 )
        {
            planet = saturn;
        }
        else if ( planet == 5 )
        {
            planet = uranus;
        }
        else if ( planet == 6 )
        {
            planet = neptune;
        }
        else
        {
            System.out.println( "Are you sure you have chosen a planet?" );
        }
        
        planetWeight = weight * planet;
        
        System.out.println( "Your weight would be " + planetWeight + " on that planet." );
    }
}
