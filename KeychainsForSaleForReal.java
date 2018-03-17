import java.util.Scanner;

public class KeychainsForSaleForReal
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int choice;
        int num = 0;
        double price = 10;
        double tax = 8.25;
        int shipping = 5;
        int aditem = 1;
        
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
                num = add_keychains(num);
            }
            else if (choice == 2)
            {
                num = remove_keychains(num);
            }
            else if (choice == 3)
            {
                view_order(num, price, tax, shipping, aditem);
            }
            else if (choice == 4)
            {
                checkout(num, price, tax, shipping, aditem);
                choice = 999;
            }
            else if (choice == 999)
            {
                System.out.println("PROGRAM KILLED");
            }
            else
            {
                System.out.println("Invalid choice, try again!");
            }
        } while (choice != 999);
    }
    
    public static int add_keychains(int x)
    {
        int add, total;
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.print("You have " + x + " keychains. How many to add?");
        add = keyboard.nextInt();
        x = x + add;
        while (x < 0)
        {
            x = 0;
            System.out.println("Invalid amount, try again!");
            System.out.print("You have " + x + " keychains. How many to add?");
            add = keyboard.nextInt();
            x = x + add;
        }
        System.out.println("You now have " + x + " keychains.");
        
        return x;
    }
    
    public static int remove_keychains(int y)
    {
        int rem, total;
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.print("You have " + y + " keychains. How many to remove?");
        rem = keyboard.nextInt();
        if ((y - rem) < 0)
        {
            System.out.println("You can't have less than 0!");
        }
        else
        {
            y = y - rem;
            System.out.println("You now have " + y + " keychains.");
        }
        
        
        
        return y;
    }
    
    public static void view_order(int a, double b, double c, int d, int e)
    {
        System.out.println();
        System.out.println("You have " + a + " keychains.");
        System.out.println("Keychains cost $" + b +" each.");
        double total;
        
        int adsh = a-e;
        double tax = (a*b/100)*c;
        total = a*b + tax + d + adsh;
        System.out.println("Total cost is $" + total);
    }
    
    public static void checkout(int a,double b, double c, int d, int e)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println("CHECKOUT");
        System.out.println();
        System.out.print("What is your name? ");
        String name = keyboard.next();
        view_order(a,b,c,d,e);
        System.out.println("Thanks for your order, " + name);
    }
}
