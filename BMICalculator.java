import java.util.Scanner;

public class BMICalculator
{
    public static void main( String[] args )
    {
        double height, weight, bmi;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println( "Your height m: " );
        height = keyboard.nextDouble();
        
        System.out.println( "Your weight in kg: " );
        weight = keyboard.nextDouble();
        
        bmi = weight / (height * height);
        
        System.out.println( "Your bmi is: " + bmi);
    }
}
