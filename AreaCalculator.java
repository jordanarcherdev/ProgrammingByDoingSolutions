import java.util.Scanner;

public class AreaCalculator
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int shape;
        
        
        do
        {
        System.out.println("Shape Area Calculator");
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();
        System.out.println("1) Triangle");
        System.out.println("2) Rectangle");
        System.out.println("3) Square");
        System.out.println("4) Circle");
        System.out.println("5) Quit");
        System.out.print("Which shape: ");
        shape = keyboard.nextInt();
        System.out.println();
        
        if (shape == 1)
        {
            System.out.print("Base: ");
            int base = keyboard.nextInt();
            System.out.print("Height: ");
            int height = keyboard.nextInt();
            System.out.println();
            System.out.println("The area is " + area_triangle(base, height));
        }
        else if (shape == 2)
        {
            System.out.print("Length: ");
            int length = keyboard.nextInt();
            System.out.print("Width: ");
            int width = keyboard.nextInt();
            System.out.println();
            System.out.println("The area is " + area_rectangle(length, width));
        }
        else if (shape == 3)
        {
            System.out.print("Side length: ");
            int side = keyboard.nextInt();
            System.out.println();
            System.out.println("The area is " + area_square(side));
        }
        else if (shape == 4)
        {
            System.out.print("Radius: ");
            int radius = keyboard.nextInt();
            System.out.println();
            System.out.println("The area is " + area_circle(radius));
        }
        
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }while (shape != 5);
    
    System.out.println("Goodbye!");
}

public static double area_triangle(int base, int height)
{
    double area = 0.5*base*height;
    return area;
}

public static int area_rectangle(int length, int width)
{
    int area = length*width;
    return area;
}

public static int area_square(int side)
{
    int area = side*side;
    return area;
}

public static double area_circle(int radius)
{
    double area = Math.PI*(radius*radius);
    return area;
}
}