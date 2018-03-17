import java.util.Scanner;

public class AlphabeticalOrder
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        
        System.out.println("What is your last name? ");
        name = keyboard.next();
        
        int carswell = name.compareTo("Carswell");
        int jones = name.compareTo("Jones");
        int smith = name.compareTo("Smith");
        int young = name.compareTo("Young");
        
}
