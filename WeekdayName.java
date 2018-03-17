
/**
 * Write a description of class WeekdayName here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeekdayName
{
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
}
