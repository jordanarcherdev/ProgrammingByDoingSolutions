import java.util.Scanner;


public class AdventureGame
{
    public static void main( String[] args )
    {
        
       
    
        Scanner keyboard = new Scanner(System.in);
        
        String r1 = "";
        String r2 = "";
        String r3 = "";
        String e1 = "";
        String e2 = "";
        String e3 = "";
        String e4 = "";
        
        System.out.println("WELCOME TO THE TINY ADVENTURE");
        
        System.out.print("\nYou are in a creepy house! Would you like to go \"upstairs\" or into the kitchen? ");
        r1 = keyboard.next();
        
        if (r1.equals("kitchen"))
        {
            System.out.print("\nThere is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refridgerator. You may open the \"refridgerator\" or look in a \"cabinet\".");
            r2 = keyboard.next();
       
            if(r2.equals("refridgerator"))
            {
                System.out.print("\nInside the refridgerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food? (\"yes or no\")");
                e1 = keyboard.next();
                if (e1.equals("no"))
                {
                    System.out.print("You die of starvation... eventually.");
                }
                else if (e1.equals("yes"))
                {
                    System.out.print("You die of food poisoning. BLLEEEGGHHH!");
                }
            }
            else if(r2.equals("cabinet"))
            {
                System.out.print("Inside the cabinet you see a black fluffy ball in the corner. Do you pick it up to see what it is? (\"yes\" or \"no\")");
                e2 = keyboard.next();
                if (e2.equals("no"))
                {
                    System.out.print("You turn away and slip on the floor. You bang your head on the counter and die from the injuries.");
                }
                else if (e2.equals("yes"))
                {
                    System.out.print("The fluffy ball turns out to be a rat. It bites you and you die of rabies after going crazy.");
                }
            }
        }
        else if (r1.equals("upstairs"))
        {
            System.out.print("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like to go?");
            r3 = keyboard.next();
            if (r3.equals("bedroom"))
            {
                System.out.print("You are in a plush bedroom, with expensive-looking hardwood furniature. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door? (\"yes\" or \"no\")");
                e3 = keyboard.next();
                if (e3.equals("no"))
                {
                    System.out.print("You never know what is in the there. It drives you so crazy you hang yourself.");
                }
                else if (e3.equals("yes"))
                {
                    System.out.print("The Boogeyman grabs you and drags you down to hell.");
                }
            }
            else if (r3.equals("bathroom"))
            {
                System.out.print("You slip in the bathroom and break your ankle. You look in the medicine cabinet and find an unlabeled bottle of pills. They could be painkillers. Do you take them? (\"yes\" or \"no\")");
                if (e4.equals("no"))
                {
                    System.out.print("You pass out from the pain and die of blood loss.");
                }
                else if (e4.equals("yes"))
                {
                    System.out.print("The pills turn out to be cyanide. You are dead.");
                }
            }
        }
    }
}

