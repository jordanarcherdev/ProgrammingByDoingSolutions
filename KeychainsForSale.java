import java.util.Scanner;

public class KeychainsForSale
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int choice;
        
        System.out.println("Ye Olde Keychain Shoppe");
        do
        {
            System.out.println();
            System.out.println("1. Add Keychains to Order");
            System.out.println("2. Remove Keychains form Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout");
            System.out.println();
            System.out.print("Please enter your choice: ");
            choice = keyboard.nextInt();
            if (choice == 1)
            {
                add_keychains();
            }
            else if (choice == 2)
            {
                remove_keychains();
            }
            else if (choice == 3)
            {
                view_order();
            }
            else if (choice == 4)
            {
                checkout();
                choice = 999;
            }
        } while (choice != 999);
    }
    
    public static String add_keychains()
    {
        System.out.println();
        System.out.println("ADD KEYCHAINS");
        
        return "";
    }
    
    public static String remove_keychains()
    {
        System.out.println();
        System.out.println("REMOVE KEYCHAINS");
        
        return "";
    }
    
    public static String view_order()
    {
        System.out.println();
        System.out.println("VIEW ORDER");
        
        return "";
    }
    
    public static String checkout()
    {
        System.out.println();
        System.out.println("CHECKOUT");
        
        
        return "";
    }
}
