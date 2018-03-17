import java.util.Scanner;

public class TwentyQuestions
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        
        String ans1 = "";
        String ans2 = "";
        String ans3 = "";
        String answer = "";
        
        System.out.println( "TWO QUESTIONS!" );
        System.out.println( "Think of an object, and I'll try to guess it." );
        System.out.println( "\nQuestion 1) Is it an animal, vegetable, or mineral?" );
        ans1 = keyboard.next();
        System.out.println("Is it bigger than a breadbox?");
        ans2 = keyboard.next();
        
        if (ans1 == "animal" && ans2 == "yes")
        {
            answer = "moose";
        }
        else if (ans1 == "animal" && ans2 == "no")
        {
            answer = "squirrel";
        }
        else if (ans1 == "vegetable" && ans2 == "yes")
        {
            answer = "watermelon";
        }
        else if (ans1 == "vegatable" && ans2 == "no")
        {
            answer = "carrot";
        }
        else if (ans1 == "mineral" && ans2 == "yes")
        {
            answer = "Camaro";
        }
        else if (ans1 == "mineral" && ans2 == "no")
        {
            answer = "paper clip";
        }
        
        System.out.println("My guess is that you are thinking of a " + answer + ".");
    }
}
