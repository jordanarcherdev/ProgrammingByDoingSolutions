import java.util.Scanner;

public class ParallelArrays
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String[] lastNames = {"Archer","McCord","Green","Gellar","Bing"};
        double[] grades = {99.9564,44.0125,87.2548,65.9875,72.2755};
        int[] studentId = {30048250,20015879,30485457,10023645,97589715};
        int slot = -12;
        
        System.out.println("Values: ");
        System.out.println("\t" + lastNames[0] + " " + grades[0] + " " + studentId[0]);
        System.out.println("\t" + lastNames[1] + " " + grades[1] + " " + studentId[1]);
        System.out.println("\t" + lastNames[2] + " " + grades[2] + " " + studentId[2]);
        System.out.println("\t" + lastNames[3] + " " + grades[3] + " " + studentId[3]);
        System.out.println("\t" + lastNames[4] + " " + grades[4] + " " + studentId[4]);
        
        System.out.println();
        
        System.out.print("ID number to find: ");
        int id = keyboard.nextInt();
        System.out.println();
        
        for(int i = 0; i < studentId.length; i++)
        {
            if (id == studentId[i])
            {
                slot = i;
            }
        }
        
        System.out.println("Found in slot " + slot);
        System.out.println("\tName: " + lastNames[slot]);
        System.out.println("\tAverage: " + grades[slot]);
        System.out.println("\tID: " + studentId[slot]);
    }
}
