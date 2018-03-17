import java.util.Scanner;

public class LetterAtATime
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your message? ");
        String message = keyboard.nextLine();
        
        System.out.println("Your message is " + message.length() + " characters long.");
        System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
        int last = message.length() - 1;
        System.out.println("The last character is at position " + last + " and is '" + message.charAt(last) + "'.");
        System.out.println("\nHere are all the characters, one at a time: ");
        System.out.println();
        
        for(int i = 0; i < message.length(); i++)
        {
            System.out.println("\t" + i + ": '" + message.charAt(i) + "'");
        }
        
        int counter = 0;
        
        for (int i = 0; i < message.length(); i++)
        {
            char letter = message.charAt(i);
            if (letter == 'a' || letter == 'A')
            {
                counter++;
            }
        }
        
        System.out.println("\nYour message contains the letter 'a' " + counter + "times.");
    }
}
        

