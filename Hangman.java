import java.util.Scanner;
import java.util.Random;

public class Hangman
{
    public static void main(String[] args){
         
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        String[] words = {"hunter", "father", "gather", "worder"};
        int x = r.nextInt(words.length);
        String word = words[x];
        int misses = 0;
        int guess = 0;
        
        do{
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println();
        
    }while(misses <= 5 && guesses <= 5);
}
