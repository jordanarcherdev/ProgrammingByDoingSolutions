import java.util.Scanner;

public class BetterBmi
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
        
        System.out.println( "Your BMI is: " + bmi);
        
        if (bmi < 15.0)
        {
            System.out.println("BMI Category: very severley underweight");
        }
        else if (bmi >= 15.0 && bmi <= 16.0)
        {
            System.out.println("BMI Category: severely underweight");
        }
        else if (bmi >= 16.1 && bmi <= 18.4)
        {
            System.out.println("BMI Category: underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9)
        {
            System.out.println("BMI Category: normal weight");
        }
        else if (bmi >= 25.0 && bmi <= 29.9)
        {
            System.out.println("BMI Category: overweight");
        }
        else if (bmi >= 30.0 && bmi <= 34.9)
        {
            System.out.println("BMI Category: moderately obese");
        }
        else if (bmi >= 35.0 && bmi <= 39.9)
        {
            System.out.println("BMI Category: severely obese");
        }
        else if (bmi >= 40.0)
        {
            System.out.println("BMI Category: morbidly obese");
        }
    }
}
