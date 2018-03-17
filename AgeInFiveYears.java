import java.util.Scanner;
public class AgeInFiveYears
{
        public static void main( String[] args )
        {
            String name;
            int age, ageIn5, age5ago;
            
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println( "Hello. What is your name? " );
            name = keyboard.next();
            
            System.out.println( "Hi, " + name + "! How old are you? ");
            age = keyboard.nextInt();
            
            ageIn5 = age + 5;
            age5ago = age - 5;
            
            System.out.print( "Did you know that in five years you will be " + ageIn5 + " years old? And five years ago you were " +  age5ago + " years old! Imagine that!");
        }
    }

