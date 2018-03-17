
public class FillInFunctions
{
    public static void main(String[] args)
{
    System.out.println("Watch as we demonstrate functions!");
    
    System.out.println();
    System.out.println("I'm going to get a random character from A-Z");
    char c = '!';
    System.out.println("The character is: " + randchar() + c);
    
    System.out.println();
    System.out.println("Now let's count from -10 to 10");
    int begin, end;
    begin = -10;
    end = 10;
    counter(-10,10);
    System.out.println("How was that?");
    
    System.out.println();
    System.out.println("Now we take the absolute value of a number.");
    int x, y = 99;
    x = -10;
    System.out.println(abso(x));
    System.out.println("This is the absolute value of " + x);
    System.out.println();
    System.out.println("That's all. This program has been brought to you by: ");
    credits();
}

public static char randchar()
{
    int numval;
    char charval;
    
    numval = (int)(Math.random()*26);
    charval = (char) ('A' + numval);
    
    return charval;
}

public static int counter(int start, int stop)
{
    int ctr;
    
    ctr = start;
    while (ctr <= stop)
    {
        System.out.print(ctr + " ");
        ctr = ctr+1;
    }
    return ctr;
}

public static int abso(int value)
{
    int absval;
    
    if (value < 0)
    {
        absval = -value;
    }
    else
    {
        absval = value;
    }
    
    return absval;
}

public static String credits()
{
    System.out.println();
    System.out.println("programmed by Graham Mitchell");
    System.out.println("modified by Jordan Archer");
    System.out.print("This code is distributed under the terms of the standard");
    System.out.println("BSD licence. Do with it as you wish");
    return "Thanks";
}
}
