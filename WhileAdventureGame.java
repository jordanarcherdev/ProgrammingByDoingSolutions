import java.util.Scanner;


public class WhileAdventureGame
{
    public static void main( String[] args )
    {
        
       
    
        Scanner keyboard = new Scanner(System.in);
        
        int nextRoom = 1;
        String choice = "";
        
        while (nextRoom !=0)
        {
            if (nextRoom == 1)
            {
                System.out.println("You are in a small room. There is a \"closet\" and a doorway to the \"hall\".");
                System.out.print("> ");
                choice = keyboard.nextLine();
                if (choice = "closet")
                {
                    nextRoom = 2;
                }
                else if (choice.equals("hall"))
                {
                    nextRoom = 3;
                }
                else 
                {
                    System.out.println(choice + " wasnt one of the options. Try again.");
                }
        
