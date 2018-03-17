import java.util.Random; 

public class FortuneCookie
{
    public static void main(String[] args)
    {
        Random r = new Random();
        
        int i = 1 + r.nextInt(6);
        
        int lot1 = 1 + r.nextInt(54);
        int lot2 = 1 + r.nextInt(54);
        int lot3 = 1 + r.nextInt(54);
        int lot4 = 1 + r.nextInt(54);
        int lot5 = 1 + r.nextInt(54);
        int lot6 = 1 + r.nextInt(54);
        
        if (i == 1)
        {
            System.out.println("Fortune cookie says: You will find happiness with a new love.");
        }
        else if (i == 2)
        {
            System.out.println("Fortune cookie says: Stick with your wife.");
        }
        else if (i == 3)
        {
            System.out.println("Fortune cookie says: Today it's up to you to create the peacefulness you long for.");
        }
        else if (i == 4)
        {
            System.out.println("Fortune cookie says: A friend asks only for your time not your money. ");
        }
        else if (i == 5)
        {
            System.out.println("Fortune cookie says: If you refuse to accept anything but the best, you very often get it. ");
        }
        else if (i == 6)
        {
            System.out.println("Fortune cookie says: A smile is your passport into the hearts of others. ");
        }
        else
        {
            System.out.println(i);
        }
        
        System.out.println("Lucky numbers: " + lot1 + "-" + lot2 + "-" + lot3 + "-" + lot4 + "-" + lot5 + "-" + lot6);
    }
}
