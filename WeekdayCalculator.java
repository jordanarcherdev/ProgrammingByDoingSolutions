import java.util.Scanner;

public class WeekdayCalculator
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to Mr. Archers fantastic birth-o-meter!");
        System.out.println();
        System.out.println("All you have to do is enter your birth date, and it will");
        System.out.println("tell you the day of the week on which you were born.");
        System.out.println();
        System.out.println("Some automatic tests....");
        System.out.println("12 10 2003 => " + weekday(12,10,2003));
        System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
        System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
        System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
        System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
        System.out.println("10 13 2000 => " + weekday(10,13,2000));
        System.out.println();
        
        System.out.println("Now it's your turn! What's your birthday?");
        System.out.print("Birth date (mm dd yyyy: )");
        int mm = keyboard.nextInt();
        int dd = keyboard.nextInt();
        int yyyy = keyboard.nextInt();
        
        
        System.out.println("You were born on: " + weekday(mm,dd,yyyy));
        
    }
    
    public static String weekday(int mm, int dd, int yyyy)
    {
        int yy, total;
        String date = "";
        
        yy = yyyy - 1900;
        
        total = (yy / 4) + yy + dd + month_offset(mm);
        
        if (is_leap(yyyy) && (mm == 1 || mm == 2))
        {
            total = total - 1;
        }
        
        int wn = total % 7;
        
        
        //placeholder
        
        date = weekday_name(wn) + ", " + month_name(mm) + ", " + dd + ", " + yyyy;
        
        return date;
    }
    
    public static int month_offset(int y)
    {
        int offset;
        
        if (y == 1)
        {
            offset = 1;
        }
        else if (y == 2)
        {
            offset = 4;
        }
        else if (y == 3)
        {
            offset = 4;
        }
        else if (y == 4)
        {
            offset = 0;
        }
        else if (y == 5)
        {
            offset = 2;
        }
        else if (y == 6)
        {
            offset = 5;
        }
        else if (y == 7)
        {
            offset = 0;
        }
        else if (y == 8)
        {
            offset = 3;
        }
        else if (y == 9)
        {
            offset = 6;
        }
        else if (y == 10)
        {
            offset = 1;
        }
        else if (y == 11)
        {
            offset = 4;
        }
        else if (y == 12)
        {
            offset = 6;
        }
        else
        {
            offset = -1;
        }
        return offset;
    }
    
    public static String month_name(int x)
    {
        String name = "";
        
        if (x == 1)
        {
            name = "January";
        }
        else if (x == 2)
        {
            name = "February";
        }
        else if (x == 3)
        {
            name = "March";
        }
        else if (x == 4)
        {
            name = "April";
        }
        else if (x == 5)
        {
            name = "May";
        }
        else if (x == 6)
        {
            name = "June";
        }
        else if (x == 7)
        {
            name = "July";
        }
        else if (x == 8)
        {
            name = "August";
        }
        else if (x == 9)
        {
            name = "September";
        }
        else if (x == 10)
        {
            name = "October";
        }
        else if (x == 11)
        {
            name = "November";
        }
        else if (x == 12)
        {
            name = "December";
        }
        else
        {
            name = "Error";
        }
        return name;
    }
    
    
    public static String weekday_name(int z)
    {
        String wkName = "";
        
        if (z == 2)
        {
            wkName = "Monday";
        }
        else if (z == 3)
        {
            wkName = "Tuesday";
        }
        else if (z == 4)
        {
            wkName = "Wednesday";
        }
        else if (z == 5)
        {
            wkName = "Thursday";
        }
        else if (z == 6)
        {
            wkName = "Friday";
        }
        else if (z == 7)
        {
            wkName = "Saturday";
        }
        else if (z == 1)
        {
            wkName = "Sunday";
        }
        else
        {
            wkName = "Error!";
        }
        
        return wkName;
    }
    
    public static boolean is_leap(int year)
    {
        boolean result;
        
        if (year%400 == 0)
        {
            result = true;
        }
        else if (year%100 == 0)
        {
            result = false;
        }
        else if (year%4 == 0)
        {
            result = true;
        }
        else
        {
            result = false;
        }
        
        return result;
    }
}
