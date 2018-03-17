import java.util.Scanner;

public class GenderGame
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String firstName, lastName, married, gender;
       
        int age = 0;
        
        System.out.println("What is your gender (M or F): ");
        gender = keyboard.next();
        
        System.out.println("First name?: ");
        firstName = keyboard.next();
        
        System.out.println("Last name?: ");
        lastName = keyboard.next();
        
        System.out.println("Age?: ");
        age = keyboard.nextInt();
        
        if (gender.equals("F"))
        {
            System.out.println("Are you married, " + firstName + "?");
            married = keyboard.next();
            if (married.equals("Y"))
            {
                System.out.println("Then I shall call you Mrs. " + firstName + " " + lastName + ".");
            }
            else if(married.equals("N") && age < 20)
            {
                System.out.println("Then I shall call you Miss. " + firstName + " " +  lastName + ".");
            }
            else if (married.equals("N") && age >=20)
            {
                System.out.println("Then I shall call you Ms. " + firstName + " " + lastName + ".");
            }
        }
        else if (gender.equals("M"))
        {
            if (age < 20)
        {
                System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
        }
        else if(age >= 20)
        {
            System.out.println("Then I shall call you Mr. " + firstName + " " + lastName + ".");
        }
    }
    }        
}
